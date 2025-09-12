package PartOne.Helper;

import PartOne.Utility.Array;

import java.util.Random;

public class ArrayGenHelper implements Array {
    private static int size = 0;
    Random random;

    public ArrayGenHelper() {
        random = new Random(12345L); // making sure the random values are same everytime
    }

    @Override
    public double[] GenArray(int count) {
        if(count <= 12){
            size += 5;
//            size += 50_000;
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt();
            }
            return array;
        }else{
            return null;
        }
    }
}
