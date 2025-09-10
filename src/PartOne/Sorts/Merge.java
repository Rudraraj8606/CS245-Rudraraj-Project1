package PartOne.Sorts;

public class Merge {

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
        double[] rightArr = new double[length];
        int arrIdx = 0;
        for (int i = length; i < arr.length; i++) {
            rightArr[arrIdx++] = arr[i];
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
        long currentTime = System.currentTimeMillis();
        if(arr.length > 1){
            double[] left = get_left(arr);
            double[] right = get_right(arr);

            sort(left);
            sort(right);
            merge(arr, left, right);
        }
        long timeElapse = System.currentTimeMillis() - currentTime;
        return new Object[]{arr, timeElapse};
    }
}
