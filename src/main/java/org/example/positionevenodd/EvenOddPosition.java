package org.example.positionevenodd;

public class EvenOddPosition {
    public static void main(String[] args) {
        int[] array = new int[]{10,20 ,30 ,40 ,50 ,60};
        System.out.println("Elements at even position");
        for (int i = 0; i < array.length; i = i + 2){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Elements at Odd Position");
        for (int i = 1; i < array.length; i = i + 2)
            System.out.print(array[i] + " ");
    }
}
