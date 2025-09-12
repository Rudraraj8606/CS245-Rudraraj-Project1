package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.HashMap;

public class Insertion implements Time {

    public static Object[] sort(double[] arr){
        long currentTime = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            double temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
        long timeElapse = System.currentTimeMillis() - currentTime;
        return new Object[]{arr, timeElapse};
    }

    @Override
    public HashMap<Integer, Double> Record() {
        return null;
    }
}
