package com.example.recyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.RecipeModels;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class recipeAdapters extends RecyclerView.Adapter<recipeAdapters.viewHolder>{
    ArrayList<RecipeModels> list;
    Context context;

    public recipeAdapters(ArrayList<RecipeModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RecipeModels model = list.get(position);
        holder.image.setImageResource(model.getPic());
        holder.text.setText(model.getText());
        switch (position){
            case 0:
                holder.image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1st image is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "1st text is clicked", Toast.LENGTH_SHORT).show();

                    }
                });

                break;
            case 1:
                holder.image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2nd image is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                holder.text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "2nd text is clicked", Toast.LENGTH_SHORT).show();

                    }
                });
        }

    }

    @Override
    public int getItemCount() {
        return  list.size();
    }

    public class viewHolder extends  RecyclerView.ViewHolder{
        ImageView image;
        TextView text;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.imageView2);
            text =itemView.findViewById(R.id.textView2);

        }
    }
}
