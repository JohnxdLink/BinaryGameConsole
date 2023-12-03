package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    private BufferedReader reader;

    // ! Constructor to initialize BufferedReader
    public UserInterface() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    // ! A Function in which will take the guess of the user and using throws IOException instead Try Catch
    public int getUserGuess() throws IOException {
        System.out.println("+++++++");
        System.out.print("+  G  +-------| " );
        String input = reader.readLine();

        // ! Converting the String into Int
        return Integer.parseInt(input);
    }

    public void displayMessage(String message) {
        System.out.println("+++++++");
        System.out.println("+  G  +-------| " + message);
        System.out.println("+++++++");
    }

    public void displayHeader() {
        System.out.println("+++++++                                          +++++++");
        System.out.println("+  G  +-------| WELCOME TO GUESSING GAME |-------+     +");
        System.out.println("+++++++                                          +++++++");
        System.out.println("              [S]START            [E]EXIT");
    }
}
