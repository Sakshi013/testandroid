package com.example.joker.androidtest;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.





public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    private List<Movie> movieList = new ArrayList<Movie>();



    private List<hero> heroList = new ArrayList<hero>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.
        recyclerView = findViewById(R.id.recyclerView);
        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.



        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);
        prepareMovieData();
    }


        private void prepareMovieData() {
            Movie movie = new Movie("batman", "romance--disaster");
            movie.setImage(R.drawable.batman);
            movieList.add(movie);

            movie = new Movie("deadpool", "action");
            movie.setImage(R.drawable.deadpool);


            movieList.add(movie);


        //


    }

    @Override
    public void onClick(View v) {

        Toast.makeText(MainActivity.this,"hero name",Toast.LENGTH_SHORT).show();


    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.

//    SharedPreferences sp = getSharedPreferences("detail", MODE_PRIVATE);
//

}
