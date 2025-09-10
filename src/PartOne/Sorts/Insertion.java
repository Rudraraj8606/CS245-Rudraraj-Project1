package PartOne.Sorts;

public class Insertion {

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
}
