package com.grurkul.day1;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		int a1, a2 ,a3;
		a1=7;
		a2=5;
		a3=3;

		if (a1>a2 && a1>a3)
			System.out.println("the largest no is "+ a1);
		else if (a2>a1 && a2>a3)
			 System.out.println("the largest no is "+a2);
		else System.out.println("the largest no is " +a3);
		
		
	}

}
