package com.example.indukuri.unife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Pass_Driv_entrnc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass__driv_entrnc);
        ImageView b1 = (ImageView) findViewById(R.id.imageView);
        ImageView b2 = (ImageView) findViewById(R.id.imageView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pass_Driv_entrnc.this,GenerateTicket.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pass_Driv_entrnc.this,DriverRequests.class);
                startActivity(intent);
            }
        });

    }
}
