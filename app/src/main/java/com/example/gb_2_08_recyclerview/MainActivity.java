package com.example.gb_2_08_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> items = new ArrayList<>();

        int count = 10000;

        for (int i = 0; i < count; i++) {
            items.add(UUID.randomUUID().toString());
        }

        RecyclerView importantList = findViewById(R.id.very_important_list);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        importantList.setLayoutManager(lm);

        VeryImportantAdapter adapter = new VeryImportantAdapter();

        importantList.setAdapter(adapter);

        adapter.addData(items);

        adapter.notifyDataSetChanged(); // отрисовка списка

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