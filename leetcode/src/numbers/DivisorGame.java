package numbers;

/**
 * Alice and Bob take turns playing a game, with Alice starting first.
 * ---
 * Initially, there is a number n on the chalkboard.
 * On each player's turn, that player makes a move consisting of:
 * ---
 * Choosing any integer x with 0 < x < n and n % x == 0.
 * Replacing the number n on the chalkboard with n - x.
 * Also, if a player cannot make a move, they lose the game.
 * ---
 * Return true if and only if Alice wins the game, assuming both players play optimally.
 */
public class DivisorGame {

    public boolean divisorGame(int n) {
        /*
          this exercise is not about coding but about finding the winning
          strategy - in this case the one who starts with even number (n%2 == 0)
          will win, no matter how smart the opponent is...
         */
        return n%2 == 0;
    }
}
