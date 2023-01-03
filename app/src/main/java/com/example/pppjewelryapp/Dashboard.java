package com.example.pppjewelryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity  implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        View D1 = findViewById(R.id.d1);
        View D2 = findViewById(R.id.d2);
        View D3 = findViewById(R.id.d3);
        View D4 = findViewById(R.id.d4);


        D1.setOnClickListener((View.OnClickListener) this);
        D2.setOnClickListener((View.OnClickListener) this);
        D3.setOnClickListener((View.OnClickListener) this);
        D4.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.d1: i = new Intent(this,tblbracelet.class); startActivity(i); break;
            case R.id.d2: i = new Intent(this,tblnecklace.class); startActivity(i); break;
            case R.id.d3: i = new Intent(this,tblring.class); startActivity(i); break;
            case R.id.d4: i = new Intent(this,tblearring.class); startActivity(i); break;

        }

    }
}