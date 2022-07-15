package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Makeup extends AppCompatActivity {
    Button kb1, kb2, kb3, kb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup);
        kb1 = findViewById(R.id.kb1);
        kb2 = findViewById(R.id.kb2);
        kb3 = findViewById(R.id.kb3);
        kb4 = findViewById(R.id.kb4);
        kb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Sugar Nude Pink Liquid Lipstick of Rs 370");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        kb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Huda Beauty Eyeshadow Palette of Rs 540");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        kb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Lakme 9To5 Primer+Matte Foundation 100ml of  Rs 250");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        kb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Nykaa Crystal Silver Nail Paint + Gloss of  Rs 60");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void cb1(View v) {
        Intent i1 = new Intent(this, Dress.class);
        startActivity(i1);
    }

    public void cb2(View v) {
        Intent i2 = new Intent(this, Jwellery.class);
        startActivity(i2);
    }

    public void cb3(View v) {
        Intent i3 = new Intent(this, Footwear.class);
        startActivity(i3);
    }

    public void cb4(View v) {
        Intent i4 = new Intent(this, Makeup.class);
        startActivity(i4);
    }
}
