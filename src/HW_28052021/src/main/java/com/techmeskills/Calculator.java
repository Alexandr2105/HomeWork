package com.techmeskills;

public class Calculator {
private String a;
private String b;

    public Calculator(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public int sum(String a, String b){
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        return c+d;
    }
    public int minus(String a,String b){
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        return c-d;
    }
    public int multiplication(String a, String b){
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        return c*d;
    }
    public double division(String a,String b){
        Double c=Double.parseDouble(a);
        Double d=Double.parseDouble(b);
        return c/d;
    }
}
