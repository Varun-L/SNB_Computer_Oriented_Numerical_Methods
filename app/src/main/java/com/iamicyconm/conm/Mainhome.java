package com.iamicyconm.conm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainhome extends AppCompatActivity {
    Button python,aa,bis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainhome);
        python = (Button) findViewById(R.id.python);
        aa = (Button) findViewById(R.id.aa);
        bis = (Button) findViewById(R.id.bis);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Mainhome.this,Jacobi.class);
                startActivity(i);



            }
        });
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Mainhome.this,Seidel.class);
                startActivity(i);



            }
        });
        bis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mainhome.this,Bisection.class);
                startActivity(i);
            }
        });



    }

}