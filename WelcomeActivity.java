package com.example.indukuri.unife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
        setContentView(R.layout.activity_welcome);
        startActivity(intent);
    }
}
