//5) Write a Program to Find Size of int, float, double and charin your computer.
//also print teir minimum and maximum values too.

//for Boolean size they use print streams so that get covered in stream section of core java course.

package com.practice.basic;

import java.util.*;

public class Prog5{
	public static void main(String [] args){

		System.out.println("S.No.\t Datatype \t Size in Bytes. \t Min Value \t Max Value");
		
		System.out.println("1.\t"+" "+"Byte \t\t"+" "+ (Byte.SIZE/8)+"\t\t\t"+Byte.MIN_VALUE+"\t\t"+" "+Byte.MAX_VALUE);

		System.out.println("2.\t"+" "+"Short \t\t"+" "+ (Short.SIZE/8)+"\t\t\t"+Short.MIN_VALUE+"\t\t"+" "+Short.MAX_VALUE);

		System.out.println("3.\t"+" "+"Int \t\t"+" "+ (Integer.SIZE/8)+"\t\t\t"+Integer.MIN_VALUE+"\t"+" "+Integer.MAX_VALUE);

		System.out.println("4.\t"+" "+"Long \t\t"+" "+ (Long.SIZE/8)+"\t\t\t"+Long.MIN_VALUE+"\t"+" "+Long.MAX_VALUE);

		System.out.println("5.\t"+" "+"Float \t\t"+" "+ (Float.SIZE/8)+"\t\t\t"+Float.MIN_VALUE+"\t\t\t"+" "+Float.MAX_VALUE);

		System.out.println("6.\t"+" "+"Double \t"+" "+ (Double.SIZE/8)+"\t\t\t"+Double.MIN_VALUE+"\t"+" "+Double.MAX_VALUE);

		// System.out.println("1.\t"+" "+"int \t\t"+" "+ (Boolean.SIZE/8)+"\t\t\t"+Boolean.MIN_VALUE+"\t"+" "+Boolean.MAX_VALUE);

		System.out.println("7.\t"+" "+"Char \t\t"+" "+ (Character.SIZE/8)+"\t\t\t"+Character.MIN_VALUE+"\t"+" "+Character.MAX_VALUE);


	}
}

