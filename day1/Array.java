package com.day1;

public class Array {
    public static void main(String[] args){
    //int[] number1 = {1,2,3,4,5};
    char array[][] = {{'X','O','X'},{'O','X','O'},{'X','O','X'}};
    for (int i = 0; i < array.length; i++){
        for (int j=0; j<array[i].length; j++){
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    }
}
