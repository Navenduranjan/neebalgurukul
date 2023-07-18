package com.gurukul.day2;

import java.util.Scanner;

public class Binary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a number");
		int number = sc.nextInt();
		System.out.print("Enter the bits");
		int bit = sc.nextInt();
		System.out.print((number>>(bit-1))&1);
	}

}
