package hus.oop.lab2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class StringAndCharacterExercise {
    static Scanner sc;
    //ReverseString
    public static String reverseString(String inStr){
        int inStrLen = inStr.length();
        String reversed = "";
        for(int charIdx = inStrLen -1 ; charIdx>=0 ; --charIdx) {
            reversed += inStr.charAt((charIdx));
        }
        return reversed;
    }
    public static void testReverseString(){
        System.out.print("Enter a String:");
        String inStr = sc.nextLine();
        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reverseString(inStr) + "\"");
    }
    //CountVowelsDigits
    public static int countVowels(String inStr){
        inStr = inStr.toUpperCase();
        int count = 0;
        for(int i = 0;i < inStr.length();i++){
            char c = inStr.charAt(i);
            if(c == 'A' || c == 'O' || c == 'U' || c == 'E' || c == 'I'){
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String inStr){
        inStr = inStr.toUpperCase();
        int count = 0;
        for(int i = 0;i < inStr.length();i++){
            char c = inStr.charAt(i);
            if('0'<= c && c <= '9'){
                count++;
            }
        }
        return count;
    }
    public static void testCountVowelsDigits(){
        System.out.print("Enter a String:");
        String inStr = sc.nextLine();
        int strLength = inStr.length();
        int vowelsCount = countVowels(inStr);
        int digitsCount = countDigits(inStr);
        double vowelsPercentage = (double) vowelsCount / strLength * 100;
        double digitsPercentage = (double) digitsCount / strLength * 100;
        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowelsCount, vowelsPercentage);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digitsCount, digitsPercentage);
    }
    //PhoneKeyPad
    public static String phoneKeyPad(String inStr) {
        inStr = inStr.toLowerCase();
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (c >= 'a' && c <= 'c') {
                result += "2";
            } else if (c >= 'd' && c <= 'f') {
                result += "3";
            } else if (c >= 'g' && c <= 'i') {
                result += "4";
            } else if (c >= 'j' && c <= 'l') {
                result += "5";
            } else if (c >= 'm' && c <= 'o') {
                result += "6";
            } else if (c >= 'p' && c <= 's') {
                result += "7";
            } else if (c >= 't' && c <= 'v') {
                result += "8";
            } else if (c >= 'w' && c <= 'z') {
                result += "9";
            }
        }
        return result;
    }
    public static void testPhoneKeyPad(){
        System.out.println("Enter a String(Nested-if):");
        String inStr = sc.nextLine();
        System.out.println("Nested-if result:" + phoneKeyPad(inStr));
    }
    public static String phoneKeyPadSwitchCase(String inStr) {
        inStr = inStr.toLowerCase();
        String result = "";
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;
                default:
                    break;
            }
        }
        return result;
    }
    public static void testPhoneKeyPadSwitchCase() {
        System.out.println("Enter a String(Switch-case):");
        String inStr = sc.nextLine();
        System.out.println("Switch-case result:" + phoneKeyPadSwitchCase(inStr));
    }
    //Caesar’s Code
    public static String decipherCaesarCode(String inStr , int n ){
        inStr = inStr.toUpperCase();
        String result = "" ;
        for(int i = 0 ; i < inStr.length() ; i++){
            char c =  inStr.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                result += (char) ((c - 'A' - n) % 26 + 'A');
            }
        }
        return result;
    }
    public static void testDecipherCaesarCode(){
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a ciphertext string: ");
        String inStr =  sc.nextLine();
        System.out.println("The ciphertext string is: " + decipherCaesarCode(inStr , n));
    }
    //Decipher Caesar’s Code
    public static String cipherCaesarCode(String inStr  , int n ){
        inStr = inStr.toUpperCase();
        String result = "" ;
        for(int i = 0 ; i < inStr.length() ; i++){
            char c =  inStr.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                result += (char) ((c - 'A' + n) % 26 + 'A');
            }
        }
        return result;
    }
    public static void testCipherCaesarCode(){
        System.out.println("Enter number:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Enter a plaintext string: ");
        String inStr =  sc.nextLine();
        System.out.println("The plaintext string is: " + cipherCaesarCode(inStr ,n));
    }
    //CheckHexString
    public static boolean isHexString(String hexStr){
        hexStr =  hexStr.toLowerCase();
        for(int i = 0 ; i < hexStr.length() ; i++){
            char c = hexStr.charAt(i);
            if(!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f'))){
                return false;
            }
        }
        return true;
    }
    public static void testHexString(){
        System.out.println("Enter a hex string:");
        String hexStr = sc.nextLine();
        if(!isHexString(hexStr)){
            System.out.println( "\"" + hexStr + "\"" + " is NOT a hex string");
        }
        else {
            System.out.println("\"" + hexStr + "\"" + " is a hex string");
        }
    }
    //BinaryToDecimal
    public static int binaryToDecimal(String binStr){
        int result = 0;
        int temp = 1 ;
        for(int i = binStr.length() - 1 ; i >= 0 ; i--){
            result += (binStr.charAt(i) - '0' ) * temp;
            temp *=2;
        }
        return result;
    }
    public static void testBinaryToDecimal(){
        System.out.println("Enter a Binary string:");
        String binStr = sc.nextLine();
        System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + binaryToDecimal(binStr));

    }
    //HexadecimalToDecimal
    public static int hexadecimalToDecimal(String hexStr) {
        int result = 0;
        int temp = 1;
        for (int i = hexStr.length() - 1; i >= 0; i--) {
            char c = hexStr.charAt(i);
            int digit = 0;
            if (c >= '0' && c <= '9') {
                digit = c - '0' ;
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            }
            else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10;
            } else {
                System.out.println("Error: Invalid hexadecimal string \"" + hexStr + "\"");
                return 0;
            }
            result += digit * temp;
            temp *= 16;
        }
        return result;
    }
    public static void testHexadecimalToDecimal(){
        System.out.println("Enter a Hexadecimal string:");
        String hexStr = sc.nextLine();
        System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + hexadecimalToDecimal(hexStr));
    }
    //OctalToDecimal
    public static int octalToDecimal(String octalStr) {
        int result = 0;
        int temp = 1;
        for (int i = octalStr.length() - 1; i >= 0; i--) {
            char c = octalStr.charAt(i);
            if (c >= '0' && c <= '7') {
                result += (octalStr.charAt(i) - '0') * temp;
                temp *= 8;
            } else {
                System.out.println("Error: Invalid octal string \"" + octalStr + "\"");
                return 0;
            }
        }
        return result;
    }
    public static void testOctalToDecimal(){
        System.out.println("Enter a Octal string: ");
        String octalStr = sc.nextLine();
        System.out.println("The equivalent decimal number for octal \"" + octalStr + "\" is: " + octalToDecimal(octalStr));
    }
    //RadixNToDecimal
    public static  int radixNToDecimal(String radixNStr, int number){
        if( number == 2 ){
            return binaryToDecimal(radixNStr);
        } else if (number == 8) {
            return octalToDecimal(radixNStr);
        }else {
            return hexadecimalToDecimal(radixNStr);
        }
    }
    public static void testRadixNToDecimal(){
        System.out.println("Enter the radix:");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the string:");
        String radixNStr = sc.nextLine();
        int decimal = radixNToDecimal(radixNStr,number);
        System.out.println("The equivalent decimal number: " + decimal);
    }
    public static void main(String[] args){
        sc= new Scanner(System.in);
        testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
        testPhoneKeyPadSwitchCase();
        testCipherCaesarCode();
        testDecipherCaesarCode();
        testHexString();
        testBinaryToDecimal();
        testHexadecimalToDecimal();
        testOctalToDecimal();
        testRadixNToDecimal();
    }
}
