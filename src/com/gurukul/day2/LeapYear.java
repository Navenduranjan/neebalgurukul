package com.gurukul.day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the year");
		int year = sc.nextInt();
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.print("The year" + year +" is a leap year");
		}
		else 
			System.out.print("The year " + year +" is not a leap year");

	}

}
