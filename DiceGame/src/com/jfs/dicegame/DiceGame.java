package com.jfs.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) throws InvalidGameOption {
		try (Scanner sc = new Scanner(System.in);) {
			Random random = new Random();
			int dicescore = 0;
			int dice = 0;
			System.out.println("Enter the dice condition");
			int condition = sc.nextInt();
			while (dice != condition) {
				System.out.println("Enter game ID 10 to play dice");
				int gameID = sc.nextInt();
				if (gameID == 10) {
					dice = random.nextInt(1, 7);
					System.out.println("dicescore = " + dice);
					if (dice == condition) {
						System.out.println("Dice rolled " + condition);
						System.out.println("You are OUT OF THE GAME!!!!");
					} else {
						dicescore += dice;
						System.out.println("Score = " + dicescore);
					}
				} else {
					throw new InvalidGameOption("Invalid Game Option");
				}
			}
			System.out.println("Your final score = " + (dicescore));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}