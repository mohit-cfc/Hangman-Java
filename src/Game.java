import java.util.ArrayList;

public class Game {

    // The Guessing Word
    String word ="java";
    // Current Guess
    // _ _ _ _
    StringBuilder currentGuess = getDashedWord();

    // ArrayList to store all the Letters Guessed
    ArrayList<Character> allGuesses = new ArrayList<>();

    // no.of Tries
    int totalTry = 5;
    // init the current try = o
    int currentTry  = 0;


    // Creating a set of Words
    // Will add in the next versions ( v1.1.0 )


    public StringBuilder getDashedWord(){
        // init DashWord StringBuilder ( NON-IMMUTABLE )
        StringBuilder dashWord = new StringBuilder();

        // Create word with Dashes
        for ( int i = 0; i < word.length()*2 ; i++){
            if( i%2 ==0){
                dashWord.append("_");
            }
            else{
                dashWord.append(" ");
            }
        }
        return dashWord;
    }

    public String getCurrentGuess(){
        return "Guessed: " +currentGuess;
        // Guessed: _ _ _ _
    }

    // Checks if it is repeating
    public boolean repeatGuess( char guess){
        return allGuesses.contains(guess);
    }

    // Check Correct / Wrong
    public boolean checkGuess( char guess ){
        boolean correctGuess = false;

        // will loop through the entire word
        for ( int i = 0; i< word.length(); i++ ){
            // check each letter if it matches
            if ( word.charAt(i) == guess ){
                // will replace each dash with the letter
                currentGuess.setCharAt(i*2,guess);
                correctGuess = true;
                // Adding the Guess to the Array
                allGuesses.add(guess);
            }
        }
        // the guess is incorrect
        if ( !correctGuess){
            allGuesses.add(guess);
            // increment the tries
            currentTry++;
        }
        return correctGuess;
    }


    public boolean gameOver(){
        if ( win() ){
            System.out.println();
            System.out.println("CONGRATULATIONS YOU WON");
            return true;
        }
        // if no.of tries run out
        else if( currentTry >= totalTry ){
            System.out.println();
            System.out.println("YOU LOOSE");
            System.out.println("The Word was : " +word);
            return true;
        }
        return false;
    }


    public boolean win (){
        // our word is in this form: J A V A
        // We gotta remove the "Space"
        String temp = currentGuess.toString();
        // Replace the space part with noSpace
        // Result: JAVA
        String checkGuess= temp.replace(" ","");
        // Checks if they are equal
        return checkGuess.equals(word);
    }

}
