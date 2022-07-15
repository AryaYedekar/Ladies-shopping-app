package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;


public class MainActivity extends AppCompatActivity {
    SliderLayout sl;
    //connecting intent
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sl = findViewById(R.id.imgslider);
        sl.setIndicatorAnimation(IndicatorAnimations.NONE);
        sl.setScrollTimeInSec(1);

        setSliderViews();
    }
        private void setSliderViews(){
            for(int i=0;i<=2;i++){
                DefaultSliderView sv=new DefaultSliderView(this);
                switch(i){
                    case 0:
                        sv.setImageDrawable(R.drawable.s2);
                        break;
                    case 1:
                        sv.setImageDrawable(R.drawable.s3);
                        break;
                    case 2:
                        sv.setImageDrawable(R.drawable.s6);
                        break;
                }
            sv.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int finalI =i;
            sv.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(MainActivity.this,"This is slider"+(finalI+1),Toast.LENGTH_SHORT).show();
                }
            });
            sl.addSliderView(sv);
            }
        }

    public void cb1(View v)
    {
        Intent i1=new Intent(this,Dress.class);
        startActivity(i1);
    }
    public void cb2(View v)
    {
        Intent i2=new Intent(this,Jwellery.class);
        startActivity(i2);
    }
    public void cb3(View v)
    {
        Intent i3=new Intent(this,Footwear.class);
        startActivity(i3);
    }
    public void cb4(View v)
    {
        Intent i4=new Intent(this,Makeup.class);
        startActivity(i4);
    }

}
