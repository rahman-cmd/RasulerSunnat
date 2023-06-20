package com.aisoftdev.rasulersunnat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder> {

    private List<String> nList;

    public NestedAdapter(List<String> nList){
        this.nList = nList;
    }
    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item, parent, false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {
        holder.nestedItemTv.setText(nList.get(position));
    }

    @Override
    public int getItemCount() {
        return nList.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder{
        private TextView nestedItemTv;

        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);

            nestedItemTv = itemView.findViewById(R.id.nestedItemTv);
        }
    }
}
