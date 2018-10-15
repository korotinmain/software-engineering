package com.korotin.TransposeRandomArray;

import com.korotin.LiteralConstants;

public class ArrayManipulation {

   public float[][] randomize() {
        float[][] randomArray = new float[6][6];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = RandomFloat.randFloat(0, 6);
            }
        }
        return randomArray;
    }
    public static void outputArray(float[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format(LiteralConstants.STRING_FORMAT, array[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

}
