package com.korotin.TransposeRandomArray;

import com.korotin.LiteralConstants;

public class TransposeMatrix {
    public void transpose(float[][] originMatrix) {
        System.out.println(LiteralConstants.Debug.NOT_TRANSPOSED_MATRIX);
        ArrayManipulation.outputArray(originMatrix);

        int originMatrixRowsNumber = originMatrix.length;
        int originMatrixColumnsNumber = originMatrix[0].length;

        float[][] transposedMatrix = new float[originMatrixColumnsNumber][originMatrixRowsNumber];

        for (int i = 0; i < originMatrixRowsNumber; i++) {
            for (int j = 0; j < originMatrixColumnsNumber; j++) {
                transposedMatrix[originMatrix.length - 1 - j][i] = originMatrix[i][j];
            }
        }

        System.out.println(LiteralConstants.Debug.TRANSPOSED_MATRIX);
        ArrayManipulation.outputArray(transposedMatrix);

    }
}
