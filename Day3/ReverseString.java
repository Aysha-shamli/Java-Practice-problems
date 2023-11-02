package com.Day3;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        String originalString = "I am Goutham";
        String reversedStr = "";

        String[] words = originalString.split(" ");
        String[] wordsArray = new String[words.length];
        for (int i = 0; i < words.length; i++)
        {
            wordsArray[i] = words[i];
            String characters = wordsArray[i];
            reversedStr = reversedStr + " ";
            for (int j = characters.length() - 1; j >= 0; j--)
            {
                char temp = characters.charAt(j);
                reversedStr = reversedStr + temp;
            }
        }
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedStr);
    }
}
