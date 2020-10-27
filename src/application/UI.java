package application;

import Chess.ChessPiece;

public class UI {
	
	// Printando o tabuleiro e suas pe�as
	public static void printBoard(ChessPiece[][] pieces) { 
		for(int i=0;i<pieces.length;i++) {
			System.out.print((8-i) + " ");
			for(int j=0;j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	
	// Print individual de pe�a testando seu formato.
	private static void printPiece(ChessPiece piece) {
		if(piece == null)
			System.out.print("-");
		else
			System.out.print(piece);
		System.out.print(" ");
	}
}
