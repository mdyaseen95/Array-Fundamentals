package org.example.dplicate;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 2, 3, 8, 10, 5, 8,};
        System.out.println("Duplicate elements are");
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);

                }
            }
        }
    }
}
