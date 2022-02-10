package com.bridgelabz.genericstestmaximum;

public class MaximumTestIntStrFloat <E extends Comparable<E>> {
	E x, y, z;

	
	public static  <E extends Comparable<E>> E testMaximum(E x, E y, E z) {
		E maximum = x;
		if(y.compareTo(maximum) > 0) {
			maximum = y;
		}

		if(z.compareTo(maximum) > 0) {
			maximum = z;
		}
		return maximum;
	}


	public static void main(String[] args) {
		System.out.printf("Max of %s, %s and %s is %s\n",24,16,19, testMaximum(24,16,19));		
		System.out.printf("Max of %s, %s and %s is %s\n","Apple","Peach","Orange", testMaximum("Apple","Peach","Orange"));		
		System.out.printf("Max of %s, %s and %s is %s\n",14.1,16.2,19.3, testMaximum(14.1,16.2,19.3));		

		

		
	}

}
