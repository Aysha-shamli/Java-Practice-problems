package com.Day2;

public class Operators {
    public static void main(String[] args){
        int a = 10,b = 20;
        int add = a + b;
        int sub = a - b;
        boolean A = add >= sub;
        boolean B = add <= sub;
        boolean C = A && B ;
        boolean D = A || B;
        boolean E = add != sub;
        int F = ++a;
        int G = --b;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
    }
}

