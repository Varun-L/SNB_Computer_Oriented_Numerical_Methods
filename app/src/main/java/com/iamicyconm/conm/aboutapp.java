package com.iamicyconm.conm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class aboutapp extends AppCompatActivity {
    TextView dev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutapp);
        dev = (TextView) findViewById(R.id.devpanel);
        dev.setText("\t\tDeveloped By:\n"+"\t\t\t\tL Venkat\n"+"\t\t\t\tSamarendra P\n\n"+"\t\tSpecial Thanks : \n\t\t\t\tSree Sai Nikhil\n\n\t\t\t\n\n\t\tIn Association with : \n\t\t\t\tSmart Nuts N Bolts\n\n\t\t\t\tAN IAMICY-RV PRESENTATION\n"+"\n\n\t\t\t\t\t\t\t(: (: (: (: Thank You :) :) :) :)");
    }
}

