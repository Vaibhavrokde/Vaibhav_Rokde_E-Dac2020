/* 14.	Program to check that entered year is a leap year or not.*/


package com.company;

import java.util.Scanner;

public static void main(String[] args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		year = sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}
}
