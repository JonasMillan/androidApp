package com.example.adm.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        // we use getIntent in order to take a string that comes from the main activity
        String nameSend = getIntent().getStringExtra("name");
        //String lastName = getIntent().getStringExtra("lastName");
        TextView textReult = (TextView) findViewById(R.id.textSendActivity);
        // we use te setText to concatenate the string and apend to the string on the text value
        textReult.setText(textReult.getText().toString()+ " "+nameSend);

    }
}
