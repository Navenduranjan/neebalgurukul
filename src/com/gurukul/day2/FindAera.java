package com.gurukul.day2;

import java.util.Scanner;

public class FindAera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the shape");
		String shape = sc.next();
		
		switch(shape) {
			case "square":
			{
				System.out.println("Enter the length of the side");
				double side =sc.nextDouble();
				double area = side* side;
				System.out.println("The area is "+ area);
				break;
			}
			case "circle":
			{
				System.out.println("Enter the radius length");
				double radius = sc.nextDouble();
				double area = Math.PI*Math.pow(radius,2);
				System.out.println("The area is "+ area);
				break;
			}
			case "triangle":
			{
				System.out.println("Enter the length of the side");
				double side = sc.nextDouble();
				double area = (Math.sqrt(3)/4)*Math.pow(side, 2);
				System.out.println("The area is "+ area);
				break;
			}
			default:
				System.out.println("The shape is invalid");
		}

	}
}
