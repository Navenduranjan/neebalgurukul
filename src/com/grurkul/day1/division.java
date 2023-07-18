package com.grurkul.day1;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.print("Enter two number");
int div1 = sc.nextInt();
int div2 =sc.nextInt();
int div3 ;
if(div1>div2)
{
	div3=div1/div2;
}
else {
	div3=div2/div1;
}

System.out.println(div2);


	}

}
