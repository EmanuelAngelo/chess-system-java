package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	public String toString() {
		return "K";
	}

}
