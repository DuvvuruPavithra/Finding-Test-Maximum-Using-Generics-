package com.bridgelabz.genericstestmaximum;

public class IntegerMaximumTest <E> {
	E x, y, z;
	
	public IntegerMaximumTest(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static  <T extends Comparable<T>> Integer testMaximum(Integer x, Integer y, Integer z) {
		Integer maximum = x;
		if(y.compareTo(maximum) > 0) {
			maximum = y;
		}
		
		if(z.compareTo(maximum) > 0) {
			maximum = z;
		}
		printMaximum(x,y,z,maximum);
		return maximum;
	}

	public static void printMaximum(Integer x, Integer y, Integer z, Integer maximum) {
           System.out.printf("Max of %s, %s and %s is %s\n",x,y,z, maximum);		
	}

	public static void main(String[] args) {
        Integer xInt= 4, yInt = 6, zInt = 9;
        new IntegerMaximumTest(xInt,yInt,zInt).testMaximum(xInt, yInt, zInt);
	}

}
