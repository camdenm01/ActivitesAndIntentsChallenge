package com.example.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String Passage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPassageOne(View view) {
        Intent intent = new Intent(this, TextActivity.class);
        Passage = "one";
        intent.putExtra("passageNumber", Passage);
        startActivity(intent);
    }

    public void launchPassageTwo(View view) {
        Intent intent = new Intent(this, TextActivity.class);
        Passage = "two";
        intent.putExtra("passageNumber", Passage);
        startActivity(intent);
    }

    public void launchPassageThree(View view) {
        Intent intent = new Intent(this, TextActivity.class);
        Passage = "three";
        intent.putExtra("passageNumber", Passage);
        startActivity(intent);
    }
}