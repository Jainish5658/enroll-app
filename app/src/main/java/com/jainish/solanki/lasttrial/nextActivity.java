package com.jainish.solanki.lasttrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class nextActivity extends AppCompatActivity {
    public static final String MSG = "com.jainish.solanki.enroll.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void nextPage1(View view){

        Toast.makeText(this, "Successfully enrolled", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, finalActivity.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        EditText editText2 = findViewById(R.id.editTextTextPersonName2);
        String message = editText2.getText().toString() + " successfully enrolled . " +
                " welcome " +
                editText1.getText().toString()  ;

        intent.putExtra(MSG, message);
        startActivity(intent);

    }


    }

