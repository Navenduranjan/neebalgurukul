package com.grurkul.day1;

import java.util.Scanner;

public class Bluebird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.print ("Enter the number of booking");
		int x = sc.nextInt();
		int numberofpeopletraveling =50* (x/50);
		if(numberofpeopletraveling>100) {
			numberofpeopletraveling= 100;
		}
	System.out.println("people travelling today:" + numberofpeopletraveling);	
		
	}

}
