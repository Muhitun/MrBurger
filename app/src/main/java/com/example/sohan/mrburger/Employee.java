package com.example.sohan.mrburger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Employee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

    }

    public void employeeWindow(View v){

        Intent i = new Intent(this, BurgerSellActivity.class);
        startActivity(i);
        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show();
    }

}
