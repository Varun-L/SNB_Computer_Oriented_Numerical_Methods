package com.iamicyconm.conm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bisection extends AppCompatActivity {
    functions cla= new functions();
    EditText x111,x1,x2,x3,c,i;
    int flag=0;
    Button bs;
    float ite,cox111,cox,cox2,cox3,con;
    TextView result;
    float x11,x22,v1,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bisection);
        bs=(Button) findViewById(R.id.buttonresult);
        result = (TextView) findViewById(R.id.result);
        x111=(EditText) findViewById(R.id.etx4);
        x1 = (EditText) findViewById(R.id.etx1);
        x2 = (EditText) findViewById(R.id.etx2);
        x3 = (EditText) findViewById(R.id.etx3);
        c = (EditText) findViewById(R.id.etcon);
        i = (EditText) findViewById(R.id.etforiterations);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                if(x111.getText().toString()=="" &&x1.getText().toString()=="" && x2.getText().toString()=="" && x3.getText().toString()=="" && c.getText().toString()=="" && i.getText().toString()=="" ){
                    result.setText("Please Enter The Coefficients of x^4 , x^3 , x^2 , x , constant value and the desired number of Iterations and Press Result");
                }
                else{
                cox111=Float.parseFloat(x111.getText().toString());
                cox = Float.parseFloat(x1.getText().toString());
                cox2 = Float.parseFloat(x2.getText().toString());
                cox3 = Float.parseFloat(x3.getText().toString());
                con = Float.parseFloat(c.getText().toString());
                ite = Float.parseFloat(i.getText().toString());
                float o1, o2;

                String f5= "Equation is "+String.valueOf(cox111)+"x^4 +"+String.valueOf(cox3)+"x^3 + "+" "+String.valueOf(cox2)+"x^2 + "+" "+String.valueOf(cox)+"x + "+String.valueOf(con)+" =0 \n";
                for (int k = -100; k < 100; k++) {
                    if(k<0 || k>0){
                    o1 = cla.getf(k,cox111, cox3, cox2, cox, con);
                    o2 = cla.getf(k + 1,cox111, cox3, cox2, cox, con);
                    if(o1==0 || o2==0){
                        if(o1==0) x11=k;
                        if(o2==0) x11=k+1;
                        flag=1;
                        break;

                    }}
                    if(k>0){
                        o1 = cla.getf(k,cox111, cox3, cox2, cox, con);
                        o2 = cla.getf(k + 1,cox111, cox3, cox2, cox, con);
                        if (o1 < 0 && o2 > 0) {
                        x11 = k;
                        x22 = k+1;
                        break;

                    }}
                }
                 if(flag==0){
                    for (int p = 0; p <= ite; p++) {
                        if (p == 0) {
                            f5+=("\nThe Root Lies Between " + (x11) + " and " + (x22) + "\n");
                            v1 = cla.b(x11, x22);
                            s = cla.getf2(v1,cox111, cox3, cox2, cox, con);
                            f5+="      x1          x2          x3=(x1+x2)/2         f(x3)  \n";
                            f5+=("The Values are:\n  " + (x11) + "   " + (x22) + "   " + (v1) + "   " + (s) + "\n");

                        }
                        if (s < 0) {
                            x11 = v1;
                        }
                        else if(s>0) {
                            x22 = v1;
                        }
                        v1 = cla.b(x11, x22);
                        s = cla.getf2(v1,cox111, cox3, cox2, cox, con);
                        f5+=("The Values are :\n  " + (x11) + "   " + (x22) + "   " + (v1) + "   " + (s) + "\n");



                    }}
                    else{

                        f5="The Root is "+x11+"\nThese Roots can be found by Quadratic Formula ";
                 }

                    result.setText(f5);
                }}
            catch (NumberFormatException e){
                    result.setText("  (:  Please Don't Leave The Fields Blank or Enter Alphabets , Kindly Enter Values To Evaluate the Problem:)  ");
            }
            catch (Exception e){
                    result.setText("(: Enter Appropriate Values in the Input Fields , There is an inappropriate input found while processing , kindly re-enter data :)");
            }

            }


        });


    }
}

