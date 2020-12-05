package com.iamicyconm.conm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
public class Jacobi extends AppCompatActivity {
    TextView res,name,gr;
    Button br;
    int a;
    EditText xx1,xx2,xx3,yy1,yy2,yy3,zz1,zz2,zz3,cc1,cc2,cc3,noi;
    float fx1,fx2,fx3,fy1,fy2,fy3,fz1,fz2,fz3,fc1,fc2,fc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jacobi);
        xx1= (EditText) findViewById(R.id.a1);
        yy1= (EditText) findViewById(R.id.a2);
        zz1= (EditText) findViewById(R.id.a3);
        cc1= (EditText) findViewById(R.id.a4);
        xx2= (EditText) findViewById(R.id.b1);
        yy2= (EditText) findViewById(R.id.b2);
        zz2= (EditText) findViewById(R.id.b3);
        cc2= (EditText) findViewById(R.id.b4);
        xx3= (EditText) findViewById(R.id.c1);
        yy3= (EditText) findViewById(R.id.c2);
        zz3= (EditText) findViewById(R.id.c3);
        cc3= (EditText) findViewById(R.id.c4);
        name=(TextView) findViewById(R.id.j);
        //noi=(EditText) findViewById(R.id.oite);
        res = (TextView) findViewById(R.id.JacobiResult);
        res.setText("This is the Gauss Jacobi's Iteration Method for Solving Simultaneous Linear Equations.\n"+"Enter the Coefficients of X,Y,Z such that the Coefficents of the leading Diagonal are Large Compared to Others.\n"+
                "At Present Our Method Only Solves the Equations which have 3 variables and 3 Equations, we will Improve this in Near Future.\n Enter The Coefficients with Respective Signs to get Correct Answer.\n"
        );
        br=(Button) findViewById(R.id.button);
        name.setText("Jacobi Iteration Method");
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (xx1.getText().toString() == "" && xx2.getText().toString() == "" && xx3.getText().toString() == "" && yy1.getText().toString() == "" && yy2.getText().toString() == "" && yy3.getText().toString() == "" && zz1.getText().toString() == "" && zz2.getText().toString() == "" && zz3.getText().toString() == "" && cc1.getText().toString() == "" && cc2.getText().toString() == "" && cc3.getText().toString() == "") {

                        res.setText("Enter All The Coefficients in All The 3 Equations to Proceed");
                    } else {

                        // a = Integer.parseInt(noi.getText().toString());

                        fx1 = Float.parseFloat(xx1.getText().toString());
                        fy1 = Float.parseFloat(yy1.getText().toString());
                        fz1 = Float.parseFloat(zz1.getText().toString());
                        fx2 = Float.parseFloat(xx2.getText().toString());
                        fx3 = Float.parseFloat(xx3.getText().toString());
                        fy2 = Float.parseFloat(yy2.getText().toString());
                        fy3 = Float.parseFloat(yy3.getText().toString());
                        fz2 = Float.parseFloat(zz2.getText().toString());
                        fz3 = Float.parseFloat(zz3.getText().toString());
                        fc1 = Float.parseFloat(cc1.getText().toString());
                        fc2 = Float.parseFloat(cc2.getText().toString());
                        fc3 = Float.parseFloat(cc3.getText().toString());

                        if (((Math.abs(fx1)) > (Math.abs(fy1) + Math.abs(fz1))) && ((Math.abs(fy2)) > (Math.abs(fx2) + Math.abs(fz2))) && ((Math.abs(fz3)) > (Math.abs(fy3) + Math.abs(fx3)))) {
                            Gauss g = new Gauss();
                            String gjop = g.Gaussjacobi(fx1, fx2, fx3, fy1, fy2, fy3, fz1, fz2, fz3, fc1, fc2, fc3);
                            res.setText(gjop);
                        }
                        else {
                            res.setText("The Provided Equations Do Not Satisfy The Gauss Jacobi Criterion . Please Re Arrange the equations to get The Correct Output. Re Arrange such that the Values in the Leading Diagonal Should be greater than the sum of the other two.\n");

                        }
                    }


                }catch (NumberFormatException e){
                    res.setText(" (: Please Enter All The Fields , Dont Leave The Fields Empty , Enter Some Data to Process :) ");
                }
                catch (Exception e){
                    res.setText(" (: An Error has Occured While Processing the Problem , Kindly Re-Enter The Values. :)");

                }
            }

        });





    }
}
