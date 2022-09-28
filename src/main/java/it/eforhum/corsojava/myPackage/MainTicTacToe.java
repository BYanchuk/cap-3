package it.eforhum.corsojava.myPackage;

import java.util.Scanner;

public class MainTicTacToe {
	public static void main(String[] args) {

		MatrixTicTacToe mapTicTacToe = new MatrixTicTacToe();
		Game game = new Game();
		boolean doWhileEexitCheck = false;

		try (Scanner scanner = new Scanner(System.in)) {

			do {
				int switchCheck = 0;

				System.out.println("1)New Game");
				System.out.println("2)Last game stats");
				System.out.println("0)Exit");
				
				int myCase = Integer.parseInt(scanner.nextLine());
				
				switch (myCase) {
				case 1:
					game.playerName = scanner.nextLine();
					game.playerWinCount = Integer.parseInt(scanner.nextLine());

					System.out.println(game.playerStats());
					System.out.println("======================");

					System.out.println("Player name2:");
					game.playerName = scanner.nextLine();
					
					game.playerWinCount = Integer.parseInt(scanner.nextLine());
					game.playerName = scanner.nextLine();
					game.playerWinCount = Integer.parseInt(scanner.nextLine());

					System.out.println(game.playerStats());

					System.out.println("======================");

					System.out.println("Player name2:");

					game.playerName = scanner.nextLine();
					game.playerWinCount = Integer.parseInt(scanner.nextLine());

					mapTicTacToe.printMatrix();

					break;

				case 2:
					System.out.println(game.playerStats());
					break;

				case 0:
					System.out.println("HAVE A NICE1 ;)");
					doWhileEexitCheck = true;
					break;

				default:
					System.out.println("NOT VALID VALUE");
					doWhileEexitCheck = true;
					break;
				}

			} while (doWhileEexitCheck == false);

		}

	}
}
