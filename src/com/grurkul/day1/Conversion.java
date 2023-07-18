package com.grurkul.day1;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the time");
		int milli =sc.nextInt();
		int hour = milli/(60*60*1000);
		milli= milli%(60*60*1000);
		int min = milli/(60*1000);
		milli = milli%(60*1000);
		int sec = milli/(1000);
		
	
		System.out.println(hour + ":" + min +":" +sec );
		
	}

}
