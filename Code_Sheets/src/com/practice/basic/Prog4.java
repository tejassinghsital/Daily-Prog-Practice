//4) Write a program where the user is asked to enter two integers.
// (divisor and dividend) and the quotient and the remainder of their division is computed.
// (Both divisor and dividend should be integers.)

//COnclusion: we can't return two values like int,double etc from a function(it is a silly thing but remeber this...)

package com.practice.basic;

import java.util.Scanner;

public class Prog4{
	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the dividend as integer for division computation: ");
		int dividend= sc.nextInt();

		System.out.println("Enter the divisor as integer fro divison computation: ");
		int divisor=sc.nextInt();

		division(dividend,divisor);
	}

	public static void division(int dividend, int divisor){
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("Division computation between"+dividend+"and"+divisor+"yields quotient: "+ quotient+ " and remainder: "+remainder);
	}
}