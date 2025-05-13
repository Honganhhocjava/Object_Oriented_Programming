package hus.oop.exercises;
import java.util.Scanner;
public class DecisionAndLoopsHomework {
    static Scanner sc;
    static int secretNumber;
    static int count;

    public static void guessNumber() {
        secretNumber = (int) (Math.random() * 100);
        count = 0;
        System.out.println("Key in your guess:");
        guessNumber(sc.nextInt() , sc);
    }
    public static void guessNumber(int number , Scanner in) {
        if (number < secretNumber) {
            System.out.println("Try higher:");
            count++;
            guessNumber(sc.nextInt() , in );
        } else if (number > secretNumber) {
            System.out.println("Try lower:");
            count++;
            guessNumber(sc.nextInt() , in );
        } else {
            System.out.println("Yougot it in " + (count + 1) + " trials!");
        }
    }
    public static void guessWord(){
        System.out.print("Enter the word to be guessed: ");
        String wordToGuess = sc.nextLine().toLowerCase();
        boolean[] guessedPositions = new boolean[wordToGuess.length()];
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.length() == 1) {
                char guessedChar = userInput.charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guessedChar) {
                        guessedPositions[i] = true;
                        correctGuess = true;
                    }
                }
                if (correctGuess) {
                    System.out.print("Trial " + (++trials) + ": ");
                    guessWord(wordToGuess, guessedPositions);
                    if (!containsFalse(guessedPositions)) {
                        System.out.println("\nCongratulations!");
                        System.out.println("You got it in " + trials + " trials");
                        break;
                    }
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
            } else {
                if (userInput.equals(wordToGuess)) {
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials");
                    break;
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
            }
        }
    }
    public static void guessWord(String guessedString, boolean[] guessedPositions){
        for (int i = 0; i < guessedString.length(); i++) {
            if (guessedPositions[i]) {
                System.out.print(guessedString.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    private static boolean containsFalse(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        guessNumber();
        guessWord();
    }
}
