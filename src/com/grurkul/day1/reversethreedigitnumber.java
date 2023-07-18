package com.grurkul.day1;

import java.util.Scanner;

public class reversethreedigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc=new Scanner (System.in);
System.out.print("Enter the three digit number");
int no = sc.nextInt();
int dg1 = no%10;
int dg2 = no%10;
int dg3 = no/100;
int reverse = dg1*100+dg2*10+dg3;
int sum= no+reverse;
System.out.println("the sum of number and Reverse is" +sum);
System.out.println("the sum of digit is" +sum);
System.out.println("the reverse digit is" +reverse);

	}

}
