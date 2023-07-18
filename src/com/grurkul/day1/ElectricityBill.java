package com.grurkul.day1;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the bill");
		int units =sc.nextInt();
		double Amount;
		
		
		double Amount100= units*4 + 0.18*(units*4);
		double Amount300 = 400 + (units-100)*5;
		double Amount300plus = 1400+(units-300)*10;
		if (units<=100)
			Amount= Amount100;
		else if (units<=300)  {
			if(Amount300 <= 1000)
				Amount = 400+ (units-100)*5+ .18*Amount300;
			
			else Amount = 400+ (units-100)*5 +.05*(400+ (units-100)*5)+.05*(400+ (units-100)*5 );
		
		}
		
		else 
		   Amount = 1400+(units-300)*10 + .05*(1400 +(units-300)*10 +.05*(14000+(units-300)*10));
		System.out.print("the Amount is"+ Amount);
		System.out.print("Arjun");
		
	}

}
