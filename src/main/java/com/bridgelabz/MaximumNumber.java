package com.bridgelabz;

public class MaximumNumber {

    public static Integer findMaxNo(Integer x, Integer y, Integer z){

        Integer max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        System.out.println(x+" "+y+" "+z);

        System.out.println("Max No. is :"+max);

        return max;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 40;
        int z = 30;

        findMaxNo(x,y,z);
    }
}
