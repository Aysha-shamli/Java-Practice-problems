package com.day1;

public class StringDemo {
    public static void main(String[] args) {
        //==  and  .equals
        String str1 = "Aysha";
        String str2= "Aysha";  //  pool
        String str3 = new String("Aysha");  // new  heap
        boolean res = str1.equals(str2);
        boolean res1 = str1.equals(str3);
        boolean res2 = str1==str2;   //true
        boolean res3 = str1==str3;   // false
        System.out.println(res);  // true
        System.out.println(res1);  // true
        System.out.println(res2);  // true
        System.out.println(res3);  //true
    }
}
