import java.util.Scanner;

public class Players {

    Scanner sc = new Scanner(System.in);
    private int player1Score = 0;
    private int player2Score = 0;


    public void addPoints(int player, int points) {
        if (player == 1) {
            this.player1Score += points;
        } else {
            this.player2Score += points;
        }
    }

    public int getScore(int player) {
        if (player == 1) {
            return this.player1Score;
        } else {
            return this.player2Score;
        }
    }

    public String getGuess() {
        System.out.println("Input your guess:");
        String getGuess = sc.nextLine();
        return getGuess;
    }
}