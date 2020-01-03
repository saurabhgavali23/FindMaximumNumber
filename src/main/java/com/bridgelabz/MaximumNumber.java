package com.bridgelabz;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber <T extends Comparable> {

    T[] x;

    public MaximumNumber(){}

    public MaximumNumber(T... x) {
        this.x = x;
    }

    public T testMaximum(){
       return findMaxValue(x);
    }

    private static <T extends Comparable> void printMax(T max) {
        System.out.println(max);
    }

    public static  <T extends Comparable> T findMaxValue(T... x){

        Arrays.sort(x , Collections.reverseOrder());
        printMax(x[0]);
        return x[0];
    }
}
