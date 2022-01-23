//2) Write a Program to Print Integer Number Entered by User

package com.practice.basic;

import java.util.Scanner;

public class Prog2{
	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int entnum=sc.nextInt();
		System.out.println("Your entered number is: "+entnum);

	}
}