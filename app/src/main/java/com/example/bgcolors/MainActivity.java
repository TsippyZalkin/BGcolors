package com.example.bgcolors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout cl;
    Button btnR,btnB,btnY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl= this.<ConstraintLayout>findViewById(R.id.cl);
        btnR=findViewById(R.id.btnRed);
        btnB=findViewById(R.id.btnBlue);
        btnY=findViewById(R.id.btnYellow);
        btnR.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnY.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btnR)
            cl.setBackgroundColor(Color.RED);
        else if (view==btnY)
            cl.setBackgroundColor(Color.YELLOW);
        else if (view==btnB)
            cl.setBackgroundColor(Color.BLUE);
    }
}