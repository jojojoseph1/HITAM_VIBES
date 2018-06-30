package com.example.jojo.example;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long SPLASH_TIME_OUT=400;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this,second.class);
                startActivity(homeIntent);
                finish();
            }

        },SPLASH_TIME_OUT);

    }

}
