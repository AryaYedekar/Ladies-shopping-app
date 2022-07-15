package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Footwear extends AppCompatActivity {
    Button fb1, fb2, fb3, fb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footwear);
        fb1 = findViewById(R.id.fb1);
        fb2 = findViewById(R.id.fb2);
        fb3 = findViewById(R.id.fb3);
        fb4 = findViewById(R.id.fb4);
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Black transparent chunky heels  of Rs 1200");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Tie-Up Hot Pink Stiletto of  Rs 1600");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Aqua Blue and White Sneakers of Rs 999");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Transparent Block Heels with Beige Soul of  Rs 1190");
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
