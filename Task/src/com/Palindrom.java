package com;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String orignal,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		orignal=sc.next();
		for(int i=orignal.length()-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
		}
		if(reverse.equals(orignal)) {
			System.out.println("String is Palindrom");
		}
		else {
			System.out.println("String Not Palindrom");
		}
	}

}
