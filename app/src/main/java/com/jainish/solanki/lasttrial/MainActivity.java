package com.jainish.solanki.lasttrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        //we will handle the click on the button here
        // Build an Intent to another activity
        Intent intent = new Intent(this, nextActivity.class);
//        EditText editText = findViewById(R.id.);
        startActivity(intent);


    }
}



