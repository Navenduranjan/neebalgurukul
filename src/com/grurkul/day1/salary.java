package com.grurkul.day1;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.print( "Enter the salary");
 double salary = sc.nextDouble();
 if (salary<30000)
	 salary=1.05*salary;
 System.out.println("the existing salary is " +salary);
 
	 
 
 
	

}
}
