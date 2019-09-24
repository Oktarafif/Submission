package com.example.submission;

import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    private ArrayList<Food>listFood;

    public ListFoodAdapter(ArrayList<Food>list){
        this.listFood = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_food, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        final Food food = listFood.get(position);

        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgphoto);

        holder.tvname.setText(food.getName());
        holder.tvdetail.setText(food.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveintent = new Intent(view.getContext(), Detail1.class);
                moveintent.putExtra("objek", food);
                view.getContext().startActivity(moveintent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tvname , tvdetail;
        public ListViewHolder(View itemView) {
            super(itemView);
            imgphoto = itemView.findViewById(R.id.img_item_photo);
            tvname = itemView.findViewById(R.id.tv_item_name);
            tvdetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
