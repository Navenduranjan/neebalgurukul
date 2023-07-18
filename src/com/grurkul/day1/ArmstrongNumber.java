package com.grurkul.day1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the number");
		int number = sc.nextInt();
		int original =  number;
		int x = number/100;
		number = number%100;
		int y = number/10;
		int z = number%10;
		
		int sum = (int) (Math.pow(x, 3)+ Math.pow(y, 3) + Math.pow(z, 3));
		
		if(sum==original)
			System.out.print(original +" Is an Armstrong number");
		else
			System.out.print(original +" Is not an Armstrong number");
		

	}

}
