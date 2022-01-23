//6) Write a Program to Swap Two Numbers

package com.practice.basic;

import java.util.*;

public class Prog6{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st integer number: ");
		int number1=sc.nextInt();

		System.out.println("Enter 2nd integer number: ");
		int number2=sc.nextInt();

		System.out.println("By now, number 1 is: "+number1+" number 2 is: "+number2);

		swap1(number1,number2);//with extra variable
		swap2(number1,number2);//without extra variable but extra bit
		swap3(number1,number2);//without extra bit
		swap4(number1,number2);//easy way of 3
		swap5(number1,number2);//easy way of 2
	}

	public static void swap1(int number1, int number2){
		int temp=0;
		temp=number1;
		number1=number2;
		number2=temp;

		System.out.println("After swap with extra variable number 1 is: "+number1+" number2 is: "+number2);
	}

	public static void swap2(int number1, int number2){
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;

		System.out.println("After swap without extra variable number 1 is: "+number1+" number2 is: "+number2);
	}

	public static void swap3(int number1, int number2){
		number1=number1^number2;
		number2=number1^number2;
		number1=number1^number2;

		System.out.println("After swap without extra bit number 1 is: "+number1+" number2 is: "+number2);
	}

	public static void swap4(int number1, int number2){
		number1=number1^number2^(number2=number1);//number1^=number2^(number2=number1);

		System.out.println("After swap without extra bit number 1 is: "+number1+" number2 is: "+number2);
	}

	public static void swap5(int number1, int number2){
		number1=number1+number2-(number2=number1);//number1+=number2-(number2=number1);

		System.out.println("After swap without extra bit number 1 is: "+number1+" number2 is: "+number2);
	}
}