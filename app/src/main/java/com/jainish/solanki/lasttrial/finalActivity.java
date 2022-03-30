package com.jainish.solanki.lasttrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();
        String message = intent.getStringExtra(nextActivity.MSG);

        //set text inside textview to messsage

        TextView textView = findViewById(R.id.displayText);
        textView.setText(message);
    }
}