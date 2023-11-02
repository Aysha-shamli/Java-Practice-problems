package com.day1;

public class DataTypes{
    public static void main(String[] args)
    {
        int age =20;
        double salary = 25000.20;
        char result = 'B';
        boolean isValue = true;
        String name ="Aysha";
        float value = 123456.54258f;
        long number = 456123852l;

        int[] number1 = {1,2,3,4,5};
        String starray[] = {"ABC","xyz"};
        System.out.println(age);
        System.out.println(salary);
        System.out.println(result);
        System.out.println(isValue);
        System.out.println(name);
        System.out.println(value);

        for (int i=0;i<number1.length;i++)
        {
            System.out.println(number1[i]);
        }
    }
}
