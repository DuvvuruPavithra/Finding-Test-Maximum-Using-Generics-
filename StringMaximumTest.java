package com.bridgelabz.genericstestmaximum;

public class StringMaximumTest <E> {
E x, y, z;
	
	public StringMaximumTest(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static  <T extends Comparable<T>> String testMaximum(String x, String y, String z) {
		String maximum = x;
		if(y.compareTo(maximum) > 0) {
			maximum = y;
		}
		
		if(z.compareTo(maximum) > 0) {
			maximum = z;
		}
		printMaximum(x,y,z,maximum);
		return maximum;
	}

	public static void printMaximum(String x, String y, String z, String maximum) {
           System.out.printf("Max of %s, %s and %s is %s\n",x,y,z, maximum);		
	}

	public static void main(String[] args) {
        String xStr= "Apple", yStr = "Peach", zStr = "Banana";
        new StringMaximumTest(xStr,yStr,zStr).testMaximum(xStr, yStr, zStr);
	}


}
