package com.Day3;

import java.util.Scanner;
public class ShiftingString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String input = scanner.nextLine();
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char newChar = (char)(currentChar + 1);
            word = word + newChar;
        }
        System.out.println("Manipulated string " + word);
    }
}
