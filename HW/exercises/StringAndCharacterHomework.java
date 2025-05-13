package hus.oop.exercises;
import java.util.Scanner;
public class StringAndCharacterHomework {
    static Scanner sc;
    public static String exchangeCipher(String inStr) {
        inStr = inStr.toUpperCase();
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            char newChar = (char) ('A' + 'Z' - c);
            ciphertext.append(newChar);
        }
        return ciphertext.toString();
    }

    public static void testExchangeCipher() {
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.nextLine();
        String ciphertext = exchangeCipher(inStr);
        System.out.println("The ciphertext string is: " + ciphertext);
    }
    public static boolean isPalindromicWord(String inStr){
        inStr = inStr.toUpperCase();
        int forwardIndex = 0 ;
        int backwardIndex = inStr.length() - 1 ;
        while (forwardIndex < backwardIndex){
            char forwardChar = inStr.charAt(forwardIndex);
            char backwardChar = inStr.charAt(backwardIndex);
            if(Character.isLetter(forwardChar) && Character.isLetter(backwardChar)){
                if(forwardChar != backwardChar){
                    return false ;
                }
                forwardIndex++;
                backwardIndex--;
            }else if (!Character.isLetter(forwardChar)){
                forwardIndex++;
            } else if (!Character.isLetter(backwardChar)) {
                backwardChar--;
            }
        }
        return true ;
    }
    public static void testPalindromicWord(){
        System.out.print("Enter a word: ");
        String inStr = sc.nextLine();
        boolean isPalindrome = isPalindromicWord(inStr);
        System.out.println(isPalindrome);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        testExchangeCipher();
        testPalindromicWord();
    }
}