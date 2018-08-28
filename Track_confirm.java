package com.example.indukuri.unife;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Track_confirm extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_confirm);

        Button rides = (Button)findViewById(R.id.trackvehicle);
        rides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Track_confirm.this, "GPS Vehicle tracker", Toast.LENGTH_SHORT).show();
            }
        });
        Button confirm = (Button)findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Track_confirm.this, "successfully paid the amount", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
