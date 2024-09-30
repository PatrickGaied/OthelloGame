package ca.utoronto.utm.assignment1.othello;

public class Player {

        protected Othello othello;
        protected char player;
        protected boolean canMove;
        protected boolean isHuman;

        public Player(Othello othello, char player) {

            this.othello = othello;
            this.player = player;
            this.isHuman = false;
        }

        public boolean canMove() {
            return othello.canMove(player);
        }

        public boolean isHuman() {
            return this.isHuman;
        }

        public Move getMove() {
            return null;
        }
}
