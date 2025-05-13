package hus.oop.exercises;
import java.util.Scanner;
public class MathLibraryHomework {
    static Scanner sc ;
    //5.1
    public static double sin(double x, int numTerms) {
        double result = 0;
        int sign = 1;
        for (int n = 0; n < numTerms; n++) {
            int term = 2 * n + 1;
            result += sign * Math.pow(x, term) / factorial(term);
            sign *= -1;
        }
        return result;
    }
    public static double cos(double x, int numTerms) {
        double result = 1;
        int sign = -1;
        for (int n = 1; n < numTerms; n++) {
            int term = 2 * n;
            result += sign * Math.pow(x, term) / factorial(term);
            sign *= -1;
        }
        return result;
    }
    private static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void testTrigonometric() {
        System.out.print("Enter the number(rad) :");
        double x = sc.nextDouble();
        System.out.print("Enter the numTerms(int) :");
        int numTerms = sc.nextInt();
        System.out.println("For x = " + x + " radians and numTerms = " + numTerms + ":");
        System.out.println("Computed sin(x): " + sin(x, numTerms));
        System.out.println("Computed cos(x): " + cos(x, numTerms));
        System.out.println("Math.sin(x): " + Math.sin(x));
        System.out.println("Math.cos(x): " + Math.cos(x));
    }
    //5.2
    public static double calculateCustomSeries(double input, int numberOfTerms) {
        double result = 0;
        double currentNumerator = 1;
        double currentDenominator = 1;

        for (int n = 1; n <= numberOfTerms; n++) {
            result += (currentNumerator / currentDenominator) * Math.pow(input, 2 * n - 1);
            currentNumerator *= 2 * n - 1;
            currentDenominator *= 2 * n;
        }
        return result;
    }

    public static void testCustomSeries() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the value of x (-1 <= x <= 1): ");
        double inputValue = scanner.nextDouble();

        if (inputValue < -1 || inputValue > 1) {
            System.out.println("Invalid input. x must be between -1 and 1.");
            return;
        }

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();
        System.out.println("Result for x = " + inputValue + " with " + numberOfTerms + " terms:");
        System.out.println("Custom Series: " + calculateCustomSeries(inputValue, numberOfTerms));
    }
    //5.3
    public static void calculateFactorialInt() {
        System.out.println("Factorials for 32-bit signed integer:");
        int currentNumber = 1;
        int currentFactorial = 1;

        while (currentFactorial > 0 && currentNumber <= 12) {
            currentFactorial *= currentNumber;
            System.out.println("The factorial of " + currentNumber + " is " + currentFactorial);
            currentNumber++;
        }

        if (currentFactorial <= 0) {
            System.out.println("The factorial of " + currentNumber + " is out of range");
        }

        System.out.println("The factorial of 13 is out of range");
    }

    public static void calculateFactorialLong() {
        System.out.println("\nFactorials for 64-bit signed integer (long):");
        int currentNumber = 1;
        long currentFactorial = 1;

        while (currentFactorial > 0 && currentNumber <= 20) {
            currentFactorial *= currentNumber;
            System.out.println("The factorial of " + currentNumber + " is " + currentFactorial);
            currentNumber++;
        }

        if (currentFactorial <= 0) {
            System.out.println("The factorial of " + currentNumber + " is out of range");
        }

        System.out.println("The factorial of 21 is out of range");
    }
    //5.4
    public static void fibonacciLong() {
        long fb1 = 1;
        long fb2 = 1;
        long fbn;
        int i = 1;

        System.out.printf("F(%1$d) = %2$d\n", 0, fb2);
        System.out.printf("F(%1$d) = %2$d\n", 1, fb1);

        while (true) {
            i++;
            try {
                fbn = Math.addExact(fb1, fb2);
                System.out.printf("F(%1$d) = %2$d\n", i, fbn);
            } catch (ArithmeticException e) {
                System.out.printf("F(%1$d) is out of the range of long\n", i);
                break;
            }

            fb2 = fb1;
            fb1 = fbn;
        }
    }

    public static void testFibonacci() {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + 1);

        MathLibraryHomework fibonacciCalculator = new MathLibraryHomework();
        fibonacciCalculator.fibonacciLong();
    }
    //5.5
    public static int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        if (radix == 0) {
            return "";
        }

        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            result.insert(0, alphabet.charAt(number % radix));
            number /= radix;
        }
        return result.toString();
    }

    public static String toRadix(String sc, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return sc;
        }
        return toRadix(toInt(sc, inRadix), outRadix);
    }

    public static void testNumberConversion(Scanner sc) {
        System.out.print("Enter a number and radix: ");
        String numberStr = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        String numberInOutputRadix = toRadix(numberStr, inRadix, outRadix);

        System.out.printf("\"%s\" in radix %d is \"%s\" in radix %d.\n", numberStr, inRadix, numberInOutputRadix, outRadix);
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        testTrigonometric();
        testCustomSeries();
        calculateFactorialInt();
        calculateFactorialLong();
        testFibonacci();
        testNumberConversion(sc);
    }
}
