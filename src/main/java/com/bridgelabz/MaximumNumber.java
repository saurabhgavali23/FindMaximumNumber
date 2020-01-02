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

    public static  <T extends Comparable> T findMaxValue(T... x){

        /*T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;*/

        Arrays.sort(x , Collections.reverseOrder());
        return x[0];
    }
}
