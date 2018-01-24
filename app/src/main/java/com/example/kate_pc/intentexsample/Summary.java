package com.example.kate_pc.intentexsample;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Summary implements Serializable {


    private double a;
    private double b;

    public Summary(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    private static double Summary (double a, double b){
        return b+=a;
    }

    public String Summ (double a, double b){
        String summ = Double.toString(Summary(a,b));
        return summ;
    }
}
