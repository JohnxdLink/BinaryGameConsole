package game;

public class Player {

    // ! Private Attributes to get the number of guesses
    private int numberOfGuesses;

    public Player() {
        // ! Once this class constructed; it will have a default value which is zero
        this.numberOfGuesses = 0;
    }

    // ! Incrementing the Number of Guesses
    public void incrementGuesses() {
        numberOfGuesses++;
    }

    // ! Get the sum of Number of Guesses
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }
}
