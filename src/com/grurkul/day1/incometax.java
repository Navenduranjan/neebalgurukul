package com.grurkul.day1;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the income");
		double Inc = sc.nextDouble();
		double tax;   
		if (Inc>1500000)
		tax= .3*Inc;
		else if (Inc>1000000)
			tax= .15*Inc;
		else if (Inc>750000)
			tax= .1*Inc;
		else tax =0;
		System.out.println("the income is "+Inc);
		System.out.println("the tax is "+tax);
		System.out.println("the take over  is "+(Inc-tax));



	}


	}


