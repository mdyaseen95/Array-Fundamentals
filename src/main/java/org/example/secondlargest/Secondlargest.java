package org.example.secondlargest;

public class Secondlargest {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 25, 8, 2};
        for ( int i = 0; i < array.length; i++){
            for ( int j = i + 1; j < array.length; j++){
                if ( array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.print(array[i] + " ");

        }
        System.out.println();
        if ( array [0] > array[1] )
            System.out.println("second largest element is " +array[1]);
    }
}
