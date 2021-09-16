package org.example.Sorting;

public class SortingArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 10, 8, 3};
        int i = 0;
        for ( ; i < array.length ; i++ ){

            for ( int j = i + 1; j < array.length; j++ ){
                if ( array[i] > array[j] ) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            System.out.print(array[i] + " ");
        }
    }
}
