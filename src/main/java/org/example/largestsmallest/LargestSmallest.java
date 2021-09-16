package org.example.largestsmallest;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 45, 8, 2};
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        int largest = array[0];
        int smallest = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] >= largest)
                largest = array[i];
            else if (array[i] <= smallest)
                smallest = array[i];
        }
        System.out.println("Largest element= " +largest);
        System.out.println("Smallest element = " +smallest);
    }
}
