public class Game {
    private String secretWord = "";
    private int pointValue = 1;
    private String structure = "----------------------------";
    private Players players;

    public Game(Players players){
        this.players = players;
    }

    public void setSecretWord() {
        secretWord = "abcd";
    }

    public void displayPhraseStructure() {
        structure = structure.substring(0, secretWord.length());
        System.out.println(structure);
        
    }

    public void setPointValue() {
        pointValue = (int) (Math.random() * 10) + 1; 
    }

    public boolean isSolved(String guess) {
        return secretWord.equals(guess);
    }

    public boolean isSolvedByLetter() {
        return secretWord.equals(structure);
    }

    public boolean isSameLength(String guess) {
        return guess.length() == secretWord.length();
    }

    public void scoreGuess(String guess, int player) {
        for (int i = 0; i < secretWord.length(); i++) {
            String sub = secretWord.substring(i, i + 1);
            if (sub.equals(guess)) {
                players.addPoints(player, pointValue);
            }
        }
    }

    public void updateStructure(String guess, int player) {
        for (int i = 0; i < secretWord.length(); i++) {
            String sub = secretWord.substring(i, i + 1);
            if (sub.equals(guess)) {
                structure = structure.substring(0, i) + guess + structure.substring(i + 1);
            }
        }
    }

}
