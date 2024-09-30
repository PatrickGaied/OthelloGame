package ca.utoronto.utm.assignment1.othello;

import java.util.ArrayList;
import java.util.Random;

/**
 * PlayerRandom makes a move by first determining all possible moves that this
 * player can make, putting them in an ArrayList, and then randomly choosing one
 * of them.
 * 
 * @author arnold
 *
 */
public class PlayerRandom extends Player {
	
	private Random rand = new Random();
	public PlayerRandom(Othello othello, char player) {
		super(othello, player);
	}


	@Override
	public Move getMove() {

		ArrayList<Move> moves = new ArrayList<>();
		for (int row = 0; row < Othello.DIMENSION; row++) {
			for (int col = 0; col < Othello.DIMENSION; col++) {
				if (this.othello.numFlips(this.player, row, col) > 0) {
					moves.add(new Move(row, col));
				}
			}
		}
		if (moves.size() == 0) {
			return new Move(0, 0);
		}
		return moves.get(rand.nextInt(moves.size()));
	}
}
