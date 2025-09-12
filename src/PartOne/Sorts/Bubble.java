package PartOne.Sorts;

import PartOne.Utility.Time;

import java.util.Arrays;
import java.util.HashMap;

public class Bubble implements Time {

    public static Object[] sort(double[] arr){
//        System.out.println("array provided is: ");
//        System.out.println(Arrays.toString(arr));
        long currentTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long timeElapse = System.currentTimeMillis() - currentTime;
        return new Object[]{arr, timeElapse};
    }

    @Override
    public HashMap<Integer, Double> Record() {
        return null;
    }
}
