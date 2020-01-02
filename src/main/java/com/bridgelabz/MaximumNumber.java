package com.bridgelabz;

public class MaximumNumber {

    public static Integer findMaxNo(Integer x, Integer y, Integer z){

        Integer max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static Float findMaxNoForFloat(Float x, Float y, Float z){

        Float max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}
