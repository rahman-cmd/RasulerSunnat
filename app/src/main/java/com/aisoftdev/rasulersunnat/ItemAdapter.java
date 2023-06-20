package com.aisoftdev.rasulersunnat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<DataModel> nList;
    private List<String> list = new ArrayList<>();

    public ItemAdapter(List<DataModel> nList){
        this.nList = nList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        DataModel model = nList.get(position);
        holder.itemTV.setText(model.getItemText());

        boolean isExpandable = model.isExpandable();
        holder.expanded_layout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

        if (isExpandable){
            holder.itemArrow.setImageResource(R.drawable.ic_arrow_up);
        } else {
            holder.itemArrow.setImageResource(R.drawable.ic_arrow_down);
        }

        NestedAdapter adapter = new NestedAdapter(list);
        holder.child_rv.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.child_rv.setHasFixedSize(true);
        holder.child_rv.setAdapter(adapter);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setExpandable(!model.isExpandable());
                list = model.getNestedList();
                notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return nList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout linearLayout;
        private RelativeLayout expanded_layout;
        private TextView itemTV;
        private ImageView itemArrow;
        private RecyclerView child_rv;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expanded_layout = itemView.findViewById(R.id.expanded_layout);
            itemTV = itemView.findViewById(R.id.itemTv);
            itemArrow = itemView.findViewById(R.id.itemArrow);
            child_rv = itemView.findViewById(R.id.child_rv);
        }
    }
}
