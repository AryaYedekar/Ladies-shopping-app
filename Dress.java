package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Dress extends AppCompatActivity {
    Button db1, db2, db3, db4;

    //connecting activity using intents on button click
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);
        db1 = findViewById(R.id.db1);
        db2 = findViewById(R.id.db2);
        db3 = findViewById(R.id.db3);
        db4 = findViewById(R.id.db4);
        db1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("BerryBlush Bottel Green Gown of Rs 1500");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        db2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Shien Casual Joggers of  Rs 999");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        db3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Mint Green Designer Dhoti Saree  of  Rs 1390");
                Toast.makeText(getApplicationContext(), s.toString(), Toast.LENGTH_LONG).show();
            }
        });
        db4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder s = new StringBuilder();
                s.append("Added to cart:- ");
                s.append("Blush Pink Short Dress of Rs 650");
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
