package com.example.indukuri.unife;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class AccountActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        Button b1 = (Button)findViewById(R.id.wallet);
        Button b2 = (Button)findViewById(R.id.credit);
        Button b3 = (Button)findViewById(R.id.debit);
        Button b4 = (Button)findViewById(R.id.net);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AccountActivity.this,WalletDetails.class);
                startActivity(intent1);
                }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AccountActivity.this,CreditDetails.class);
                startActivity(intent1);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AccountActivity.this,DebitDetails.class);
                startActivity(intent1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AccountActivity.this,NetBankDetails.class);
                startActivity(intent1);

            }
        });
    }


}
