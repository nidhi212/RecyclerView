package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recyclerview.Adapters.recipeAdapters;
import com.example.recyclerview.Models.RecipeModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.view1);
        ArrayList<RecipeModels> list = new ArrayList<>();
        list.add(new RecipeModels(R.drawable.food1,"Burger"));
        list.add(new RecipeModels(R.drawable.food2,"Pizza"));
        list.add(new RecipeModels(R.drawable.food3,"Pasta"));
        list.add(new RecipeModels(R.drawable.food4,"chowmein"));
        list.add(new RecipeModels(R.drawable.food5,"coffee"));
        list.add(new RecipeModels(R.drawable.sweets,"sweets"));
        list.add(new RecipeModels(R.drawable.food6,"Litti-chokha"));

        recipeAdapters adapter = new recipeAdapters(list,this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
//        recyclerView.setLayoutManager(gridLayoutManager);
        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggered);
    }
}