package hus.oop.lab2;

import java.util.Scanner;

public class ArrayExercise {
    static Scanner sc;
    public static int[] createArray(Scanner in){
        System.out.println("Enter the number of items: ");
        int numItems = sc.nextInt();
        int array[]= new int[numItems];
        System.out.print("Enter the values of all items (separated by spaces): ");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        for (int i = 0 ; i < numItems ; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void printArray(int[] arr) {
        System.out.print("The values are: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void testArray(){
        int[] arr = createArray(sc);
        printArray(arr);
    }
    //GradesStatistics
    public static int[] generateStudentGrade(Scanner in){
        System.out.println("Enter the number of Students: ");
        int numStudents = sc.nextInt();
        int []grades =  new int [numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        return grades ;
    }
    public static void simpleGradesStatistics(int[] grades){
        int sum = 0 ;
        int min = grades[0];
        int max = grades[0];
        for(int i = 1 ; i < grades.length; i++ ){
            int temp = min ;
            if(grades[i] < temp){
                min = grades[i];
            }
        }
        for(int i = 1 ; i < grades.length; i++ ){
            int temp1 = max ;
            if(grades[i] > temp1){
                max = grades[i];
            }
        }
        for(int i = 0 ; i < grades.length ; i++){
            sum += grades[i] ;
        }
        double average = (double) sum / (grades.length );
        System.out.printf("The average is: %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
    public static void testGenerateStudentGrade(){
        int[] arr = generateStudentGrade(sc);
        simpleGradesStatistics(arr);
    }
    //HexadecimalToBinary
    public static String hexadecimalToBinary(String hexStr){
        final String[] HEX_BITS = {
                "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        String binStr = "";
        for(int i = 0 ; i < hexStr.length() ; i++){
            char c = hexStr.charAt(i);
            int index =  Character.digit(c,16);
                    binStr += HEX_BITS[index] + " ";
        }
        return binStr;
    }
    public static void testHexadecimalToBinary() {
        System.out.print("Enter a Hexadecimal string: ");
        String hexadecimalStr = sc.nextLine();
        String binStr = hexadecimalToBinary(hexadecimalStr);
        System.out.println("The equivalent binary for hexadecimal \"" + hexadecimalStr + "\" is: " + binStr);
    }
    public static String decimalToHexadecimal(int positiveInteger) {
        String[] array = new String[(int) (Math.log(positiveInteger) / Math.log(16)) + 1];
        int count = 0;
        while (positiveInteger > 0) {
            int number = positiveInteger % 16;
            positiveInteger /= 16;
            if (number < 10) {
                array[count] = String.valueOf(number);
            } else {
                array[count] = String.valueOf((char) (number - 10 + 'A'));
            }
            count++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }

    public static void testDecimalToHexadecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int positiveInteger = Integer.parseInt(sc.nextLine());
        String result = decimalToHexadecimal(positiveInteger);
        int resultLen = result.length();
        StringBuilder newValues = new StringBuilder();
        for (int i = resultLen - 1; i >= 0; i--) {
            newValues.append(result.charAt(i));
        }
        System.out.println("The equivalent hexadecimal number is: " + newValues.toString());
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        testHexadecimalToBinary();
        testArray();
        testGenerateStudentGrade();
        testDecimalToHexadecimal();
    }
}
