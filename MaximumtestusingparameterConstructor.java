package com.bridgelabz.genericstestmaximum;

public class MaximumtestusingparameterConstructor <E extends Comparable<E>> {
	E x, y, z;

	public MaximumtestusingparameterConstructor(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static  <E extends Comparable<E>> E testMaximum(E x, E y, E z) {
		E maximum = x;
		if(y.compareTo(maximum) > 0) {
			maximum = y;
		}

		if(z.compareTo(maximum) > 0) {
			maximum = z;
		}
		printMaximum(x,y,z,maximum);
		return maximum;
	}

	public static <E> void printMaximum(E x, E y, E z,E maximum) {
		System.out.printf("Max of %s, %s and %s is %s\n",x,y,z, maximum);		
	}

	public static void main(String[] args) {
		Integer xInt= 4, yInt = 6, zInt = 9;
		String xStr= "Apple", yStr = "Peach", zStr = "Banana";
		Double xF1= 4.4, yF2 = 11.1, zF3 = 9.9;

		new IntegerMaximumTest(xInt,yInt,zInt).testMaximum(xInt, yInt, zInt);
		new StringMaximumTest(xStr,yStr,zStr).testMaximum(xStr, yStr, zStr);
		new FloatmaximumTest(xF1,yF2,zF3).testMaximum(xF1, yF2, zF3);

	}

}
