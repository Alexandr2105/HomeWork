package HW_19032021;

import java.util.Scanner;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }
    public void multiplication(int a,int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        Calculator calculator=new Calculator(a,b);
        calculator.sum(a,b);
        calculator.subtraction(a,b);
        calculator.multiplication(a,b);
    }
}
