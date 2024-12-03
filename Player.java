import java.util.Scanner;

public class Player {

    Scanner sc = new Scanner(System.in);
    private int player1Score = 0;
    private int player2Score = 0;

    public Player() {
        
    }

    public void addPoints(int player, int points) {
        if (player == 1) {
            player1Score += points;
        }
        else if (player == 2) {
            player2Score += points;
        }
    }

    public int getScore(int player) {
        if (player == 1) {
            return player1Score;
        }
        else if (player == 2) {
            return player2Score;
        }
    }
    public String getGuess() {
        System.out.println("Input your guess:");
        String getGuess = sc.nextLine();
        return getGuess;
    }

    

}