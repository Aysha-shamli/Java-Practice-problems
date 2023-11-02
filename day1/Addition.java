package com.day1;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int a=5 , b=5;
        int result = a + b;
        System.out.println("The result is "+result);
        int res = sub();
        System.out.println("The subtract is "+res);
    }

    public static int sub() {
        int a=10 , b=5;
        int result = a - b;
        return result;
    }
}
