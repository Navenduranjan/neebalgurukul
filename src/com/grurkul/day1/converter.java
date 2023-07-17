package com.grurkul.day1;

import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.print("Enter the km");
double km =sc.nextDouble();
double m= km*1000;
double cm= m*100;
double in = cm/2.54;
double ft =in/12;
System.out.print("value of meter is" +m);
System.out.print("value of cm is" +cm);
System.out.print("value of in is" +in);
System.out.print("value of ft is" +ft);



	} 

}
