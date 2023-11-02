package com.day2;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        if (x>0){
            x = x+10;
            System.out.println(x);
        }
        else if(x==0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The number is not positive");
        }
    }
}
