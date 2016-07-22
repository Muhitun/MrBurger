package com.example.sohan.mrburger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void owner(View v){
        Intent i = new Intent(this, Owner.class);
        startActivity(i);
    }

    public void employee(View v){
        Intent i = new Intent(this, Employee.class);
        startActivity(i);
    }

}
