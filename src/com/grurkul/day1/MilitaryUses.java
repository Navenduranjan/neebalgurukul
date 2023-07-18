package com.grurkul.day1;

import java.util.Scanner;

public class MilitaryUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter the time");
		int time = sc.nextInt();
		int hours = time/100;
		int min = time%100;
		if(hours==12) {
			System.out.print(hours + ":" + min + " pm");
		}
		else if(hours<12) {
			System.out.print(hours + ":" + min + " am");

		}
		else {
			hours = hours%12;
			System.out.print(hours + ":" + min + " pm");

		}

	}

}
