package com.korotin.TransposeRandomArray;

import java.util.Random;

public class RandomFloat {
    public static float randFloat(int min, int max) {

        Random rand = new Random();

        float result = rand.nextFloat() * (max - min) + min;
        return result;
    }
}
