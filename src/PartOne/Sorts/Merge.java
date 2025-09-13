package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.HashMap;

public class Merge implements Time {

    private static double[] get_left(double arr[]){
        int length = arr.length / 2;
        double[] leftArr = new double[length];
        for (int i = 0; i < length; i++) {
            leftArr[i] = arr[i];
        }
        return leftArr;
    }

    private static double[] get_right(double arr[]){
        int length = arr.length - (arr.length / 2);
        int mid = arr.length / 2;
        double[] rightArr = new double[length];
        for (int i = 0; i < length; i++) {
            rightArr[i] = arr[mid + i];
        }
        return rightArr;
    }

    private static void merge(double[] arr, double[] left, double[] right){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){ // while writing this code ; Doubt: can I write left[i++] <= right[j++] and arr[k++] = left[i] ?
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        // copying the left overs in left
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        //same for right
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static Object[] sort(double arr[]){
        long currentTime = 0;
        if(arr.length > 1){
            currentTime = System.nanoTime();
            double[] left = get_left(arr);
            double[] right = get_right(arr);

            sort(left);
            sort(right);
            merge(arr, left, right);
        }
        double timeElapse = (System.nanoTime() - currentTime) / 1_000_000f;
        return new Object[]{arr, timeElapse};
    }

    @Override
    public HashMap<Integer, Double> Record(int size, Double time) {
        return null;
    }
}
