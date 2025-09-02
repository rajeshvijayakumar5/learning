package com.rk.functional.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo {
    public static void main(String[] args) {
        // static initialization
        int[] intOneToTen = {1, 2,3, 4, 5,6, 7, 8, 9,10};
        System.out.println(Arrays.toString(intOneToTen));

        // dynamic initialization
        int[] intOneToThree = new int[3];
        intOneToThree[0] = 1;
        intOneToThree[1] = 2;
        intOneToThree[2] = 3;
        System.out.println(Arrays.toString(intOneToThree));

        // static initialization with new keyword
        int[] intOneToFive = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intOneToFive));

        // using IntStream
        int[] intArrRange = IntStream.rangeClosed(1, 5).toArray();
        System.out.println(Arrays.toString(intArrRange));
    }
}
