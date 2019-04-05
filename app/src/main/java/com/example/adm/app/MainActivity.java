package com.example.adm.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // we create cariables with the text inputs
        final TextInputEditText txtNombre = findViewById(R.id.name);

        // HOW TO GO TO A OTHER ACTIVITY (page or view)
        //find button and down cast to the right object, now we have the correct object to do things with it
        Button send = (Button) findViewById(R.id.send);
        // no create a new activity to do things whit it ( is were the main activity is )
        // after create on the manifest we got the new activity and a java activity and a ml activity new
        // we set the action with setOnClickListener inside de method we use OnClickListener it helps to use events on this case is for a click (there is more like OnScroll)
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a Intent Object allows us to communicate with other activity
                // getApplicationContext() allow us to know were we are
                // SendActivity.class is the activity were we are going to use after the click
                Intent intent = new Intent(getApplicationContext(), SendActivity.class);
                //we  send data with the intent using the method putExtra
                intent.putExtra("name", txtNombre.getText().toString());
                //intent.putExtra("lastName", txtlasN.getText().toString());

                // startActivity(Intend intend) function allow us to start the activity with the intent that we just created
                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
