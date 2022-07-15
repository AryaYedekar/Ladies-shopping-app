package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Jwellery extends AppCompatActivity {
    Button jb1, jb2, jb3, jb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jwellery);
        jb1 = findViewById(R.id.jb1);
        jb2 = findViewById(R.id.jb2);
        jb3 = findViewById(R.id.jb3);
        jb4 = findViewById(R.id.jb4);
        jb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("3 Layer Gold Chunky Necklace of Rs 199");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        jb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Magenta Pink Petal Earrings of Rs 120");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        jb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Maangtika + Earrings Creame golden colour of  Rs 319");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        jb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Chunky Gold Broad Chain Neckpiece  of Rs 159");
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
