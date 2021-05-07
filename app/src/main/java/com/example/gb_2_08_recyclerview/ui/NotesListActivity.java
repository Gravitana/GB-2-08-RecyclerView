package com.example.gb_2_08_recyclerview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.gb_2_08_recyclerview.R;
import com.example.gb_2_08_recyclerview.domain.Note;

import java.util.List;

public class NotesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotesAdapter adapter = new NotesAdapter();

        adapter.setClickListener(new NotesAdapter.NoteClickListener() {
            @Override
            public void onNoteClicked(Note note) {
                Toast.makeText(NotesListActivity.this, note.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        NotesListViewModel viewModel = new ViewModelProvider(this).get(NotesListViewModel.class);

        if (savedInstanceState == null) {
            viewModel.requestNotes();
        }

        viewModel.getNotesLiveData().observe(this, new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                adapter.addData(notes);
                adapter.notifyDataSetChanged(); // отрисовка списка
            }
        });

        RecyclerView notesList = findViewById(R.id.notes_list);

        RecyclerView.LayoutManager lm = /*new GridLayoutManager(this, 2);*/ new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        notesList.setLayoutManager(lm);

        notesList.setAdapter(adapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.items_separator));

        notesList.addItemDecoration(itemDecoration);
/*
        LinearLayout linearLayout = findViewById(R.id.root);

        for (String item: items) {

            View itemView = LayoutInflater.from(this).inflate(R.layout.item_list_item, linearLayout, false);

            TextView titleView = itemView.findViewById(R.id.title);

            titleView.setText(item);

            linearLayout.addView(itemView);
        }
*/
    }
}