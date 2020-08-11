import java.util.Scanner;

// DATE: 10:08:2020
// VERSION: 1.0.0

public class HangMan {
    public static void main(String[] args){

        // About the Game
        System.out.println("----WELCOME TO THE HANGMAN GAME----");
        System.out.println("----Guess the word in under 5 Tries and WIN----");

        // Init Scanner
        Scanner scanner= new Scanner(System.in);

        // Init the Game
        boolean start = true;
        while(start) {
            // Init the GAME Class
            Game cliGame = new Game();

            //  DO..WHILE loop Ahead

            do {

                System.out.println("--HANGMAN CLI v1.0.0--");
                System.out.println();
                // Prints in Dashed Format
                // _ _ _ _
                System.out.println(""+cliGame.getCurrentGuess());

                // Enter the Guess
                System.out.println("Enter Your Guess :");

                // Gets the letter from User
                char guess = (scanner.next().toLowerCase().charAt(0));
                System.out.println();

                // Checks if letters are asked before
                while(cliGame.repeatGuess(guess)){
                    System.out.println("You Already Guessed That");
                    // Since Already Guessed it will ask for another guess
                    guess = (scanner.next().toLowerCase().charAt(0));
                }

                // CHECKS IF CORRECT OR NOT
                if (cliGame.checkGuess(guess)){
                    System.out.println("Correct Guess");
                } else{
                    System.out.println("Incorrect Guess");
                }
            }

            // Game Over
            while( !cliGame.gameOver());

            System.out.println();
            System.out.println("Enter Y to Play");
            // takes Y or y to Fireup the Game again
            // imp step or the gams runs again and again
            Character startGameCommand = scanner.next().toUpperCase().charAt(0);
            start = ( startGameCommand == 'Y');

    }
}
}
