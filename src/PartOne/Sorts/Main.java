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
            if(bubbleSort != null){
                System.out.printf("\u001B[34mtime for bubble sort for arraySize %d is %s ms\u001B[34m\n", size, bubbleSort[1].toString());
            }else {
                System.out.println("error occurred in bubble sort ; not sorted properly");
                break;
            }
            Object[] insertionSort = Insertion.sort(array.clone()); // Magenta
            if (insertionSort != null){
                System.out.printf("\u001B[35mtime for insertion sort for arraySize %d is %s ms\u001B[35m\n", size, insertionSort[1].toString());
            }else {
                System.out.println("error occurred in insertion sort ; not sorted properly");
                break;
            }
            Object[] mergeSort = Merge.sort(array.clone()); // cyan
            if (mergeSort != null){
                System.out.printf("\u001B[36mtime for merge sort for arraySize %d is %s ms\u001B[36m\n", size, mergeSort[1].toString());
            }else{
                System.out.println("error occurred in merge sort ; not sorted properly");
                break;
            }
            Object[] quickSort = Quick.sort(array.clone(), 0, array.length - 1); // white
            if(quickSort != null){
                System.out.printf("\u001B[97mtime for quick sort for arraySize %d is %s ms\u001B[97m\n", size, quickSort[1].toString());
            }else{
                System.out.println("error occurred in quick sort ; not sorted properly");
                break;
            }
            Object[] selectionSort = Selection.sort(array.clone()); // yellow
            if( selectionSort != null){
                System.out.printf("\u001B[33mtime for selection sort for arraySize %d is %s ms\u001B[33m\n", size, selectionSort[1].toString());
            }else{
                System.out.println("error occurred in selection sort ; not sorted properly");
                break;
            }
            System.out.println("\u001B[97m-".repeat(50));
            System.out.println("\u001B[97m-".repeat(50));
        }
        double timeElapse = (System.nanoTime() - currentTime) / 60_000_000_000f;
        System.out.printf("\u001B[31m" + "Total time took for the program to run %.4f min", timeElapse);
    }
}
