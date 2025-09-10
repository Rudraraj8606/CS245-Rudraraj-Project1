package PartOne.Sorts;

public class Selection {

    private static int findSmallest(double[] arr, int start){
        int smallest = start;
        for (int i = start+1; i < arr.length; i++) {
            if(arr[i] < arr[smallest]){
                smallest = i;
            }
        }
        return smallest;
    }

    private static Object[] sort(double[] arr){
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = findSmallest(arr, i);
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        long timeElapse = System.currentTimeMillis() - currentTime;
        return new Object[]{arr, timeElapse};
    }
}
