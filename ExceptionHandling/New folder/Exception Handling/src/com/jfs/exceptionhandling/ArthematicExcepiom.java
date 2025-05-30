package com.jfs.exceptionhandling;

import java.util.Scanner;

public class ArthematicExcepiom {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			try {
				sc = new Scanner(System.in);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Enter Num1");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			sc.close();
			System.out.println("Program Entered Finally Block");
		}
		System.out.println("Program Executed");
	}
}