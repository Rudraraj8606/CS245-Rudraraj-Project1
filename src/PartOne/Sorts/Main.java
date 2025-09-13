package PartOne.Sorts;

import PartOne.Helper.ArrayGenHelper;

public class Main{

    public static void main(String[] args) {
        ArrayGenHelper arr = new ArrayGenHelper();
        double currentTime = System.nanoTime();
        // all the sorts will be called 12 times
        for (int i = 0; i < 13; i++) {
            double[] array = arr.GenArray(i);
            int size = ArrayGenHelper.getSize();
            System.out.printf("size of the array: %d\n", size);
            Object[] bubbleSort = Bubble.sort(array.clone()); // blue
            System.out.printf("\u001B[34m" + "time for bubble sort for arraySize %d is %.4f ms\n", size, (double) bubbleSort[1]);
            Object[] insertionSort = Insertion.sort(array.clone()); // Magenta
            System.out.printf("\u001B[35m" + "time for insertion sort for arraySize %d is %.4f ms\n", size, (double) insertionSort[1]);
            Object[] mergeSort = Merge.sort(array.clone()); // cyan
            System.out.printf("\u001B[36m" + "time for merge sort for arraySize %d is %.4f ms\n", size, (double) mergeSort[1]);
            Object[] quickSort = Quick.sort(array.clone(), 0, array.length - 1); // white
            System.out.printf("time for quick sort for arraySize %d is %.4f ms\n", size, (double) quickSort[1]);
            Object[] selectionSort = Selection.sort(array.clone()); // yellow
            System.out.printf("\u001B[33m" + "time for selection sort for arraySize %d is %.4f ms\n", size, (double) selectionSort[1]);
            System.out.println("-".repeat(50));
            System.out.println("-".repeat(50));
        }
        double timeElapse = (System.nanoTime() - currentTime) / 60_000_000_000f;
        System.out.printf("\u001B[31m" + "Total time took for the program to run %.4f min", timeElapse);
    }
}
