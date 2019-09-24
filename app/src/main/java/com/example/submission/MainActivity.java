package com.example.submission;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFoods= findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showRecyclerlist();


    }

    private void showRecyclerlist(){
        LinearLayoutManager llm = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        rvFoods.setLayoutManager(llm);
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFoods.setAdapter(listFoodAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_list:
                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntent);
                break;
            default:
                break;
        }
    }
}

//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//    private RecyclerView rv_foods;
//    private ArrayList<Food> list = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        rv_foods = findViewById(R.id.rv_foods);
//       rv_foods.setHasFixedSize(true);
//
//        list.addAll(FoodsData.getListData());
//        showRecyclerlist();
//    }
//
//    private void showRecyclerlist(){
//        rv_foods.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
//        rv_foods.setAdapter(listFoodAdapter);
//    }
//
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.profile, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item){
//        setMode(item.getItemId());
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void setMode(int selectedMode) {
//        switch (selectedMode){
//            case R.id.myProfile:
//                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
//                startActivity(moveIntent);
//                break;
//            default:
//                break;
//        }
//    }
//}




//package com.example.submission;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.content.Intent;
//import android.graphics.drawable.Icon;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private RecyclerView rvFoods;
//    private ArrayList<Food> list = new ArrayList<>();
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        rvFoods = findViewById(R.id.rv_foods);
//        rvFoods.setHasFixedSize(true);
//
//        list.addAll(FoodsData.getListData());
//        showRecyclerList();
//
//
////        button.setOnClickListener(this);
//
//    }
//
//    private void showRecyclerList() {
//        rvFoods.setLayoutManager(new LinearLayoutManager(this));
//        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
//        rvFoods.setAdapter(listFoodAdapter);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.profile, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        setMode(item.getItemId());
//        return super.onOptionsItemSelected(item);
//    }
//
//    public void setMode(int selectedMode) {
//        switch (selectedMode) {
//            case R.id.action_list:
//                Intent intent = new Intent(MainActivity.this, Profile.class);
//                startActivity(intent);
//                break;
//        }
//    }
//}



