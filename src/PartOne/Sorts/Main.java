package PartOne.Sorts;

import PartOne.Helper.ArrayGenHelper;
import PartOne.Utility.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Main{

    public static void main(String[] args) {
        ArrayGenHelper arr = new ArrayGenHelper();
        // all the sorts will be called 12 times
        for (int i = 0; i < 13; i++) {
            double[] array = arr.GenArray(i);
            System.out.println(Arrays.toString(array));
            Object[] bubbleSort = Bubble.sort(array.clone());
            Object[] insertionSort = Insertion.sort(array.clone());
            Object[] mergeSort = Merge.sort(array.clone());
            Object[] quickSort = Quick.sort(array.clone(), 0, array.length - 1);
            Object[] selectionSort = Selection.sort(array.clone());

        }
    }

}
