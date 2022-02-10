package com.bridgelabz.genericstestmaximum;

import java.util.Scanner;

public class FindingMaximumTestUc4 <E extends Comparable<E>> {
	E firstValue;
	E secondValue;
	E thirdValue;
	
	public FindingMaximumTestUc4(E x, E y, E z) {
		this.firstValue = x;
		this.secondValue = y;
		this.thirdValue = z;
	}
	
	public E maximum()
	{
		return testMaximum(firstValue, secondValue, thirdValue);
	}
	
	public static <T extends Comparable<T>> T testMaximum(T firstValue, T secondValue, T thirdValue) {
		T max = firstValue;

		if(secondValue.compareTo(max)>0) {
			max = secondValue;
		}
		if(thirdValue.compareTo(max)>0)
		{
			max = thirdValue;
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result;
		do {
			System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
			{
				System.out.print("Enter First Value: ");
				Integer first = s.nextInt();
				
				System.out.print("Enter Second Value: ");
				Integer second = s.nextInt();
				
				System.out.print("Enter Third Value: ");
				Integer third = s.nextInt();
				
				System.out.println("Maximum  is : " + new FindingMaximumTestUc4(first, second, third).maximum());
				
				break;
			}				
			case 2:
			{
				System.out.print("Enter First Value: ");
				Float first = s.nextFloat();
				
				System.out.print("Enter Second Value: ");
				Float second = s.nextFloat();
				
				System.out.print("Enter Third Value: ");
				Float third = s.nextFloat();
				
				System.out.println("Maximum is : " + new FindingMaximumTestUc4(first, second, third).maximum());
				break;
			}
			case 3:
			{
				System.out.print("Enter First Value: ");
				String first = s.next();
				
				System.out.print("Enter Second Value: ");
				String second = s.next();
				
				System.out.print("Enter Third value ");
				String third = s.next();
				
				System.out.println("Maximum is : " + new FindingMaximumTestUc4(first, second, third).maximum());
				break;
			}
			default:
				System.out.println("Enter Choice Between 1 And 3");				
			}
			System.out.println("Do you want to continue then press 1 for continue");
			result = s.nextInt();
		}while(result == 1);		
	
}
}