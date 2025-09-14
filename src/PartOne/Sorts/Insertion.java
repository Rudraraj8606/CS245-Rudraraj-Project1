package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.HashMap;

public class Insertion implements Time {

    public static Object[] sort(double[] arr){
        long currentTime = System.nanoTime();
        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
        double timeElapse = (System.nanoTime() - currentTime) / 1_000_000f;
        if(checkSorted(arr)){
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
