package com.khiraj.recyclerview;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rview = (RecyclerView) findViewById(R.id.rview);
        //LinearLayoutManager iManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
       // rview.setLayoutManager(iManager);

        GridLayoutManager gManager = new  GridLayoutManager(this,2);
        rview.setLayoutManager(gManager);
        rview.setAdapter(new MyAdapter(this));
        FloatingActionButton fab= findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar sBar= Snackbar.make(v,"floating action bar button",Snackbar.LENGTH_INDEFINITE);
                sBar.show();
              //  Snackbar sBar1= Snackbar.make(v,"floating action bar button",Snackbar.LENGTH_INDEFINITE);
//                sBar1.show();
                sBar.setAction("Open", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                   startActivity(new Intent(MainActivity.this,MainActivity.class));
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);

        return super.onCreateOptionsMenu(menu);
    }
}
