package com.java.basics;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
