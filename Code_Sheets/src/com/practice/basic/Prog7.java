//7) Write a Program to Find ASCII Value of a Character

package com.practice.basic;

import java.util.*;

public class Prog7{
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch=sc.next().trim().charAt(0);
		int ascii=(int)(ch);
		System.out.println("Your character is: "+ ch);
		System.out.println("ASCII of "+ ch+ " is: "+ascii);

	}
}