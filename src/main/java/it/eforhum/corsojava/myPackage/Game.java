package it.eforhum.corsojava.myPackage;

public class Game {

	String playerName;
	String secondPlayerName;
	int playerWinCount;
	int secondPlayerWinCount;

	MatrixTicTacToe matrix = new MatrixTicTacToe();

	public String playerStats() {
		return "Player1 name -> " + playerNameMethod(playerName) + " | " + "Wins -> "
				+ playerWinCountMethod(playerWinCount) + "\n" +"Player2 name -> " + playerNameMethod(secondPlayerName) + " | "
				+ "Wins -> " +playerWinCountMethod(secondPlayerWinCount);
	}

	public String playerNameMethod(String name) {
		return name;
	}

	public Integer playerWinCountMethod(int playerWinCount) {
		return playerWinCount;
	}
}
