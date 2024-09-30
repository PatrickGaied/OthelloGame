package ca.utoronto.utm.assignment1.othello;

public class Player {

        protected Othello othello;
        protected char player;
        protected boolean canMove;

        public Player(Othello othello, char player) {

            this.othello = othello;
            this.player = player;
        }

        public boolean canMove() {
            return othello.canMove(player);
        }

        public Move getMove() {
            return null;
        }
}
