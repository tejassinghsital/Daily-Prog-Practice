//8) Write a Program to Multiply two decimal Numbers entered by User

package com.practice.basic;

import java.util.*;

public class Prog8{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st decimal number: ");
		double number1=sc.nextDouble();

		System.out.print("Enter 2nd decimal number: ");
		double number2=sc.nextDouble();

		double multiply=multiply(number1,number2);
		System.out.println("The multiplication of "+number1+" and "+ number2+"is: "+ multiply);
	}

	public static double multiply(double number1, double number2){
		return number1*number2;
	}
}