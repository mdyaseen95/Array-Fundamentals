package org.example.oddeven;

public class OddEven {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 8, 9, 7, 3, 10};
        for ( int i = 0; i < array.length; i++){

            if ( array[i] % 2 == 0)
                System.out.println(+array[i] + " is even" );
            else
                System.out.println(array[i] + " is odd");
        }
    }
}
