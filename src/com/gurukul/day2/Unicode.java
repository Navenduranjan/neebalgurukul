package com.gurukul.day2;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print ("Enter lower limit");
		int lower = sc.nextInt();
		System.out.print("Enter upper limit");
		int upper = sc.nextInt();
		
		for(int i=lower;i<=upper;i++) {
			System.out.println((char)i + " - " + i);
		}
	}

}
