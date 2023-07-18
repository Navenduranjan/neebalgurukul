package com.grurkul.day1;

import java.util.Scanner;

public class areaoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
System.out.println("Enter the side");
 double a= sc.nextDouble();
double l = ((Math.sqrt(3))/4)*Math.pow(a, 2);
System.out.println("the aera of square is "+l);
	

}
}