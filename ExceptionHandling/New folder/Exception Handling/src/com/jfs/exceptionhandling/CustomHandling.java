package com.jfs.exceptionhandling;

import java.util.Scanner;

public class CustomHandling {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Age");
			int person = sc.nextInt();
			if ( person >= 18) {
				System.out.println("Major, you can Vote");
			}
			else{
				throw new CustomException("Minor, you are not eligible to Vote");
			}
		}
			catch (CustomException e) {
				System.out.println(e);
			}
			finally {
				sc.close();
				System.out.println("Scanner closed");
			}
		}
	}
