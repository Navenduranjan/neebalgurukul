package com.grurkul.day1;

import java.util.Scanner;

public class Years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the number of days");
		int days = sc.nextInt();
		int year = days/(365);
		days = days%(365);
		int month = days/(30);
		days = days%(30);
		int week = days/(7);
		days = days%7;
		
		System.out.println(year + ":" +month +":" +week +":" +days);
		
		
		
		

	}

}
