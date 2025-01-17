public class Main {

    public static void main(String[] args) {
        String guess = "";
        boolean game = true;
        int activePlayer = 1;
        Players p = new Players();
        Game g = new Game(p);
        g.setSecretWord();
        g.setPointValue();
        while (true) {
            if (activePlayer == 1) {
                g.displayPhraseStructure();

                if (g.isSolvedByLetter()) {
                    System.out.println("You guessed it!");
                    break;
                }
                guess = p.getGuess();

                g.updateStructure(guess, 1);

                g.scoreGuess(guess, 1);
                    System.out.println("player 1 score: " + p.getScore(1)  + "\nplayer 2 score: " + p.getScore(2));

                if (g.isSolved(guess)) {
                    System.out.println("You guessed it!");
                    break;
                }

                // else if (g.isSameLength(guess)) {
                //     activePlayer = 2;
                //     break;
                //}
                
                activePlayer = 2;
            }
            if (activePlayer == 2) {  
                g.displayPhraseStructure();  
                if (g.isSolvedByLetter()) {
                    System.out.println("You guessed it!");
                    break; 
                }
                guess = p.getGuess();

                g.updateStructure(guess, 2);

                g.scoreGuess(guess, 2);
                    System.out.println("player 1 score: " + p.getScore(1)  + "\nplayer 2 score: " + p.getScore(2));

                if (g.isSolved(guess)) {
                    System.out.println("You guessed it!");
                    break;                
                }
                // else if (g.isSameLength(guess)) {
                //     activePlayer = 1;
                //     break;
                // }

                activePlayer = 1;
            }
        }
    }
}