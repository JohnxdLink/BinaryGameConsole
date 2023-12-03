package game;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bfrdReader = new BufferedReader(new InputStreamReader(System.in));
            BinarySearchGame game = new BinarySearchGame(1, 100);
            Player player = new Player();
            UserInterface ui = new UserInterface();
            ClearScreen clr = new ClearScreen();

            clr.clrScreen();
            
            do {
                ui.displayHeader();
                System.out.print("Input: ");
                String input = bfrdReader.readLine();

                clr.clrScreen();

                if(input.equals("S") || input.equals("s")) {
                    while(true) {
                        game.displayBounds();
                        int guess = ui.getUserGuess();
                        player.incrementGuesses();
                        
                        if (game.isCorrectGuess(guess)) {
                            ui.displayMessage("YOU WIN  || NUMBER GUESSES: " + player.getNumberOfGuesses());
                            System.out.println("Msg -> Press Any Key To Continue");
                            String anyKey = bfrdReader.readLine();
                            break;
                        } else if (game.isGuessTooHigh(guess)) {
                            ui.displayMessage("TOO HIGH");
                            game = new BinarySearchGame(game.getLowerBound(), guess - 1);
                            System.out.println("Msg -> Press Any Key To Continue");
                            String anyKey = bfrdReader.readLine();
                        } else {
                            ui.displayMessage("TOO LOW");
                            game = new BinarySearchGame(guess + 1, game.getUpperBound());
                            System.out.println("Msg -> Press Any Key To Continue");
                            String anyKey = bfrdReader.readLine();
                        }

                        clr.clrScreen();
                    }
                } else if(input.equals("E") || input.equals("e")) {
                    System.out.println("+++++++");
                    System.out.println("+  G  +-------| EXIT");
                    System.out.println("+++++++");
                    break;
                } else {
                    System.out.println("+++++++");
                    System.out.println("+  G  +-------| INVALID INPUT");
                    System.out.println("+++++++");

                    System.out.println("Msg -> Press Any Key To Continue");
                    String anyKey = bfrdReader.readLine();
                }

            } while(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
