package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.HashMap;

public class Bubble implements Time {

    public static Object[] sort(double[] arr){
        long currentTime = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    arr[j] = temp;
                }
            }
        }
        double timeElapse = (System.nanoTime() - currentTime) / 1_000_000f;
        if(checkSorted(arr)){
            return new Object[]{arr, Math.round(timeElapse * 10000) / 10000.0};
        }else{
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
