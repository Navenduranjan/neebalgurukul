package com.grurkul.day1;

import java.util.Scanner;

public class convertcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.print("Enter the currency");
int am = sc.nextInt();
int twoth = am/2000;
am = am%2000;
int fiveh = am/500;
am = am%500;
int twoh = am/200;
am = am%200;
int oneh = am/100;
am = am%100;
int fifty = am/50;
am =am%50; 
int twenty = am/20;
am =am%20;
int ten = am/10;
am =am%10;
System.out.println(twoth + " * 2000 = " + twoth*2000);
System.out.println(fiveh + "500=" +fiveh*500);
System.out.println(twoh + "200=" + twoh*200);
System.out.println(oneh +"100=" +oneh*100);
System.out.println(fifty + "50=" +fifty*50);
System.out.println(twenty +"20=" +twenty*20);
System.out.println(ten +"10=" +ten*10);


		
	}

}
