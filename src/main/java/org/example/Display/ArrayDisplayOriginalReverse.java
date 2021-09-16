package org.example.Display;

import java.util.Scanner;

public class ArrayDisplayOriginalReverse {
    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println("enter the array elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("Reverse of an array");
        for ( int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}

