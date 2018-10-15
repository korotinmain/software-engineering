package com.korotin;

import com.korotin.TransposeRandomArray.ArrayManipulation;
import com.korotin.TransposeRandomArray.TransposeMatrix;

public class Main {
    public static void main(String[] args) {
        System.out.println(LiteralConstants.Debug.AUTHOR_TEXT);
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        ArrayManipulation randomArray = new ArrayManipulation();
        float[][] random = randomArray.randomize();
        transposeMatrix.transpose(random);
    }
}
