package com.R177219074.Lab9;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.printf("Enter int Value:\t");
	    int a = input.nextInt();
		@SuppressWarnings("deprecation")
		Integer A= new Integer(a);
		System.out.println("Converted int to Intger:\n"+A);
	    String S= String.valueOf(A);
	    System.out.println("Converted Integer to String :\n"+S);
	    System.out.println("Example:\t"+(S+"100"));// Concatenation
	    input.close();
        Integer C=Integer.valueOf(S);
        System.out.println("Converted String to Integer:\n"+C);
        System.out.println("Example:\t"+(A+100));// simple addition
        String Q=String.valueOf(a);
        System.out.println("Converted Integer to String :\n"+Q);
	    System.out.println("Example:\t"+(Q+"100"));// Concatenation
	    int r= Integer.parseInt(S);
	    System.out.println("Converted String to int:\n"+r);
        System.out.println("Example:\t"+(r+100));// simple addition
        int t= A.intValue();
	    System.out.println("Converted Integer to int:\n"+t);
        System.out.println("Example:\t"+(t+100));// simple addition
	}

}
