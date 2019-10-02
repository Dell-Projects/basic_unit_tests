package com.company;

import org.junit.Test;

public class Calculator {
    int a;
    int b;

    boolean c = true;
    boolean d = false;

    double a2;
    double b2;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Calculator(boolean c, boolean d) {
        this.c = c;
        this.d = d;
    }

    public Calculator(){
        this.a = 10;
        this.b = 4;
    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public int multiply(){
        return a * b;
    }

    public int divide(){
        if (b == 0){
            throw new IllegalArgumentException("Unable to divide by zero");
        }

        return a / b;
    }

    public int operate(char operation){
        switch(operation){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0){
                    throw new IllegalArgumentException("Unable to divide by zero");
                }

                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operation passed as OPERATION argument");
        }
    }

    public boolean and(boolean c,boolean d){
        return c && d;
    }

    public boolean or(boolean c,boolean d){
        return c || d;
    }

    public boolean xor(boolean c,boolean d){
        return (c || d) && !(c && d);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}