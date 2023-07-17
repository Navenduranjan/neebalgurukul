package com.grurkul.day1;

import java.util.Scanner;

public class reversethreedigitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc=new Scanner (System.in);
System.out.print("Enter the three digit number");
int n = sc.nextInt();
int d1 = n%10;
int d2 = n%10;
int d3 = n/100;
int re = d1*100+d2*10+d3;
int sum= n+re;
System.out.println("the sum of number and Reverse is" +sum);
System.out.println("the sum of digit is" +sum);
System.out.println("the reverse digit is" +re);

	}

}
