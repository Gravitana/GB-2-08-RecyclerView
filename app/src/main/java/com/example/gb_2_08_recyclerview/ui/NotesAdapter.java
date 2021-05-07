package com.example.gb_2_08_recyclerview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gb_2_08_recyclerview.R;
import com.example.gb_2_08_recyclerview.domain.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {

    private final ArrayList<Note> data = new ArrayList<>();

    private NoteClickListener clickListener;

    public void addData(List<Note> toAdd) {
        data.clear();
        data.addAll(toAdd);
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        Note note = data.get(position);

        holder.title.setText(data.get(position).getTitle());

        Glide.with(holder.image)
                .load(note.getImageUrl())
                .centerCrop()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public NoteClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(NoteClickListener clickListener) {
        this.clickListener = clickListener;
    }

    class NotesViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getClickListener() != null) {
                        getClickListener().onNoteClicked(data.get(getAdapterPosition()));
                    }
                }
            });

            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.image);
        }
    }

    interface NoteClickListener {
        void onNoteClicked(Note note);
    }
}
