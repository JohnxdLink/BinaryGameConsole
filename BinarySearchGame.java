package game;

import java.util.Random;

public class BinarySearchGame {

    // ! Private Attributes for targetNumber, lower and higher
    private int targetNumber;
    private int lowerBound;
    private int upperBound;

    public BinarySearchGame(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        // ! Generate a a Random Target within Specified Range
        this.targetNumber = generateRandomNumber(lowerBound, upperBound);
    }

    // ! Getter Function for lowerBound and upperBound
    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    // ! a Function that generate Random Number base on the Specified Range
    private int generateRandomNumber(int lower, int upper) {
        
        // ! Reating a random object
        Random random = new Random();

        // ! upper - lower + 1 Determines the range size, and generate a random number within that range
        return random.nextInt(upper - lower + 1) + lower; // ! adding a lower to ensures the generated number is within the range
    }

    // ! GetTargetNumber Function
    public int getTargetNumber() {
        return targetNumber;
    }

    // ! A Boolean function that will return the guess value is correct
    public boolean isCorrectGuess(int guess) {
        return guess == targetNumber;
    }

    // ! if the Guess is greater than TargetNumber it will return true which is too High
    public boolean isGuessTooHigh(int guess) {
        return guess > targetNumber;
    }

    // ! if the Guess is less than TargetNumber it will return true which is too Low
    public boolean isGuessTooLow(int guess) {
        return guess < targetNumber;
    }

    public void displayBounds() {
        System.out.println("+++++++");
        System.out.println("+  G  +-------| GUESS NUMBER BETWEEN " + lowerBound + " AND " + upperBound);
        System.out.println("+++++++");
    }

}
