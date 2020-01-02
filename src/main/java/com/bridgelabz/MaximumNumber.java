package com.bridgelabz;

public class MaximumNumber <T extends Comparable> {

    T x,y,z;

    public MaximumNumber(){}
    public MaximumNumber(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMaximum(){

        return findMaxValue(x,y,z);
    }

    public static  <T extends Comparable> T findMaxValue(T x, T y, T z){

        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}
