package it.eforhum.corsojava.myPackage;

public class MatrixTicTacToe {

	public static void printMatrix() {
		char matrix[][] = new char[3][3];
		
		matrix[2][0] = '_';
		matrix[2][1] = '_';
		matrix[2][2] = '_';
		matrix[1][0] = '_';
		matrix[1][1] = '_';
		matrix[1][2] = '_';
		matrix[0][0] = '_';
		matrix[0][1] = '_';
		matrix[0][2] = '_';
		
		for (int i = 0; i < matrix.length; i++) {

			char row[] = matrix[i];
			for (int j = 0; j < row.length; j++) {

				System.out.print(matrix[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println("--------------");
	}
}
