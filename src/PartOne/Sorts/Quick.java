package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.HashMap;

public class Quick implements Time {

    private static int partition(double[] arr, int low, int high) {

        // choose the pivot
        double pivot = arr[high];

        // index of smaller element and indicates
        // the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static Object[] sort(double[] arr, int bottom, int top){
        long currentTime = 0;
        if(bottom < top){
            currentTime = System.nanoTime();
            int part = partition(arr, bottom, top);
            sort(arr, bottom, part - 1);
            sort(arr, part + 1, top);
        }
        double timeElapse = (System.nanoTime() - currentTime) / 1_000_000f;
        if(checkSorted(arr)) {
            return new Object[]{arr, Math.round(timeElapse * 10000) / 10000.0};
        }else {
            return null;
        }
    }

    @Override
    public HashMap<Integer, Double> Record(int size, Double time) {
        return null;
    }

    private static boolean checkSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i+1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
