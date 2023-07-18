package com.gurukul.day2;

import java.util.Scanner;

public class ConvertCoordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter the radius"); 
		double r = sc.nextDouble();
		System.out.print ("Enter the angle");
		double angle = sc.nextDouble();
		
		double angleInRadians = Math.toRadians(angle);
		double x = r*Math.cos(angleInRadians);
		double y = r*Math.sin(angleInRadians);
		
		System.out.print("The cordinates are " + x + ","+ y);
		

	}

}
