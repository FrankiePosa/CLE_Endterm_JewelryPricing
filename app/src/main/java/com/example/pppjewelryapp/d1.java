package com.example.pppjewelryapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class d1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        EditText edittext1 = (EditText) findViewById(R.id.edittext1);
        EditText edittext2 = (EditText) findViewById(R.id.edittext2);
        EditText edittext4 = (EditText) findViewById(R.id.edittext4);
        EditText edittext5 = (EditText) findViewById(R.id.edittext5);
        EditText edittext6 = (EditText) findViewById(R.id.edittext6);
        edittext1.setShowSoftInputOnFocus(false);
        edittext2.setShowSoftInputOnFocus(false);
        edittext4.setShowSoftInputOnFocus(false);
        edittext5.setShowSoftInputOnFocus(false);
        edittext6.setShowSoftInputOnFocus(false);
        Button shadd = findViewById(R.id.button1);

        shadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(edittext1.getText().toString());
                int n2 = Integer.parseInt(edittext2.getText().toString());
                int n4 = Integer.parseInt(edittext4.getText().toString());
                int n5 = Integer.parseInt(edittext5.getText().toString());
                int n6 = Integer.parseInt(edittext6.getText().toString());
                int subtotal = n1 + n2 + 50;
                int total = subtotal * 4;
                double labor = total + (n6*n5);
                double overhead = labor * 0.10;
                double retail = overhead + labor;
                double wholesale = retail / 2;
                String alert1 = "Retail price: You should charge $"+retail+" per item";
                String alert2 = "Wholesale price: $"+wholesale;

                if (n4 >= 10) {
                    alert(alert2+"\n\n"+alert1);
                } else if (n4>0 && n4<10) {
                    alert(alert1);
                }

            }
        });
    }
    private void alert(String message){
        AlertDialog dlg = new AlertDialog.Builder(d1.this)
                .setTitle("Jewelry Pricing Result")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .create();
        dlg.show();
    }
}