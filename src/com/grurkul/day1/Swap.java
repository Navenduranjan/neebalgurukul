package com.grurkul.day1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number");
		int number = sc.nextInt();
		int x= number%100;
		int y = number/100;
		System.out.println(x*100+y);
		

	}

}
