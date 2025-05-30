package com.jfs.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMistach {
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
			System.out.println("Enter Num1");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
			System.out.println("Program Entered Finally Block");
		}
		System.out.println("Program Executed");
	}
}
