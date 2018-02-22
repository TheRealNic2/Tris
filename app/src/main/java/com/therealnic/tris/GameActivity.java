package com.therealnic.tris;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class GameActivity extends AppCompatActivity {

    ImageButton ibtn1;
    ImageButton ibtn2;
    ImageButton ibtn3;
    ImageButton ibtn4;
    ImageButton ibtn5;
    ImageButton ibtn6;
    ImageButton ibtn7;
    ImageButton ibtn8;
    ImageButton ibtn9;
    int turno=1;
    int[] android = new int[5];
    int[] apple = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final ImageButton ibtn1 = (ImageButton) findViewById(R.id.ibtn1);
        ImageButton ibtn2 = (ImageButton) findViewById(R.id.ibtn2);
        ImageButton ibtn3 = (ImageButton) findViewById(R.id.ibtn3);
        ImageButton ibtn4 = (ImageButton) findViewById(R.id.ibtn4);
        ImageButton ibtn5 = (ImageButton) findViewById(R.id.ibtn5);
        ImageButton ibtn6 = (ImageButton) findViewById(R.id.ibtn6);
        ImageButton ibtn7 = (ImageButton) findViewById(R.id.ibtn7);
        ImageButton ibtn8 = (ImageButton) findViewById(R.id.ibtn8);
        ImageButton ibtn9 = (ImageButton) findViewById(R.id.ibtn9);



        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turno%2==1) {
                    ibtn1.setAlpha((float) 1);
                    ibtn1.setBackground(getDrawable(R.drawable.android));
                }
            }
        });

        ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","2.Premuto!!");
            }
        });

        ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","3.Premuto!!");
            }
        });

        ibtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","4.Premuto!!");
            }
        });

        ibtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","5.Premuto!!");
            }
        });

        ibtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","6.Premuto!!");
            }
        });

        ibtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","7.Premuto!!");
            }
        });

        ibtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","8.Premuto!!");
            }
        });

        ibtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Tris","9.Premuto!!");
            }
        });
    }
}
