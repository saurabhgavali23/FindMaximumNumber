package com.bridgelabz;

public class MaximumNumber {

    public static Integer findMaxNoForInteger(Integer x, Integer y, Integer z){

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

    public static String findMaxString(String x, String y, String z){

        String max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        System.out.println(max);
        return max;
    }
}
