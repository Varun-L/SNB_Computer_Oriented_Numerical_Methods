package com.iamicyconm.conm;

public class GaussSeidelMethods {
    String gjo;
    int n;

    float compx(float a,float b, float c,float d,float y,float z){
        float x ;
        x= (-b*y-c*z-d)/a;
        return x;
    }

    float compy(float a,float b, float c,float d,float x,float z){
        float y ;
        y= (-a*x-c*z-d)/b;
        return y;
    }
    float compz(float a,float b, float c,float d,float x,float y){
        float z ;
        z= (-b*y-a*x-d)/c;
        return z;
    }
    public String GaussSeidel(float x1,float x2,float x3,float y1,float y2,float y3,float z1,float z2,float z3,float c1,float c2,float c3) {
        gjo="";
        float oa,ob,oc,od,ta,tb,tc,td,tha,thb,thc,thd;
        float x,y,z;
        oa=x1;
        ob=y1;
        oc=z1;
        od=c1;
        ta=x2;
        tb=y2;
        tc=z2;
        td=c2;
        tha=x3;
        thb=y3;
        thc=z3;
        thd=c3;
        x=y=z=0;

        for(int i=1;i<=20;i++){
            if(i==1){
                gjo+="    The Output Provided below is for 20 Iterations , Take the values according to your desired number of iterations\n ";
                gjo+="                          x                y               z      \n";
            }
            x=compx(oa,ob,oc,od,y,z);
            y=compy(ta,tb,tc,td,x,z);
            z=compz(tha,thb,thc,thd,x,y);
            gjo += ("  Iteration "+i+":   "+x+"   "+y+"   "+z+"\n") ;
        }

        return gjo;
    }

}