package com.example.sohan.mrburger;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BurgerSellActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_sell);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_logout:
                Intent idd = new Intent(this, MainActivity.class);
                startActivity(idd);
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }




    public void chicken(View v){
        Toast.makeText(this, "180tk added to the database", Toast.LENGTH_LONG).show();
    }

    public void beef(View v){
        Toast.makeText(this, "200tk added to the database", Toast.LENGTH_LONG).show();
    }

    public void fiveLayer(View v){
        Toast.makeText(this, "350tk added to the database", Toast.LENGTH_LONG).show();
    }

    public void fish(View v){
        Toast.makeText(this, "170tk added to the database", Toast.LENGTH_LONG).show();
    }

}
