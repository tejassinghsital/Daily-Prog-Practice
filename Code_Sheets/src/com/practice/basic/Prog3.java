//3) Write a Program to Add Two Integer Numbers Entered by User

package com.practice.basic;

import java.util.Scanner;

public class Prog3{
	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer number: ");
		int number1=sc.nextInt();

		System.out.println("Enter 2nd integer number: ");
		int number2=sc.nextInt();

		int calc=sum(number1,number2);
		System.out.println("The addition of above enter two integer numbers are: "+calc);
	}

	public static int sum(int number1,int number2){

		int add=number1+number2;
		return add;
	}
}