package com.example.gb_2_08_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VeryImportantAdapter extends RecyclerView.Adapter<VeryImportantAdapter.ImportantViewHolder> {

    private final ArrayList<String> data = new ArrayList<>();

    public void addData(List<String> toAdd) {
        data.addAll(toAdd);
    }

    @NonNull
    @Override
    public ImportantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_item, parent, false);
        return new ImportantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VeryImportantAdapter.ImportantViewHolder holder, int position) {
        holder.title.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ImportantViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public ImportantViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
        }
    }
}
