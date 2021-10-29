package com.example.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        Intent intent = getIntent();
        String passage = intent.getStringExtra("passageNumber");
        TextView textView = findViewById(R.id.passage_text);
        if(passage.equals("one")){
            textView.setText(R.string.one);
        }
        else if(passage.equals("two")){
            textView.setText(R.string.two);
        }
        else if(passage.equals("three")){
            textView.setText(R.string.three);
        }
    }
}