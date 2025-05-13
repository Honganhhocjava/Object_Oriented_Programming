package hus.oop.exercises;
import java.util.Scanner;

public class NestedLoopsExercise {
    static Scanner sc;
    //2.1
    public static void squarePattern(int size ){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void testSquarePattern(){
        System.out.print(" Enter the size : ");
        int size = sc.nextInt();
        squarePattern(size);
    }
    //2.2
    public static void checkPattern(int size ){
        for (int row = 1; row <= size ; row++) {
            for (int col = 1; col <= size ; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" ");
                    System.out.print("#");
                }else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void testCheckPattern(){
        System.out.print("Enter the size:");
        int size =  sc.nextInt();
        checkPattern(size);
    }
    //2.3
    public static void timetable(int size){
        System.out.print(" * |");
        int row1;
        for( row1 = 1 ; row1 <= size ; row1++){
            System.out.printf("%4d", row1);
        }
        System.out.println();
        for(int row2 = 0 ; row2 <= size  ; row2++){
            System.out.print("----");
        }
        System.out.println();

        for(int row = 1 ; row <= size ; row++){
            System.out.printf("%2d |", row);
            for(int col = 1 ; col <= size ; col++){
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
    public static void testTimeTable(){
        System.out.print("Enter the size:");
        int size =  sc.nextInt();
        timetable(size);
    }
    //2.4
    public static void triangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row < col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        if (size >= 0) {
            System.out.println("(a):");
            triangularPatternA(size);

            System.out.println("(b):");
            triangularPatternB(size);

            System.out.println("(c):");
            triangularPatternC(size);

            System.out.println("(d):");
            triangularPatternD(size);
        } else {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        }
    }
    //2.5
    public static void boxPatternA(int size){
        for(int row = 1 ; row <= size ; row++ ){
            for(int col = 1 ; col <= size ; col++){
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void boxPatternB(int size){
        for(int row = 1 ; row <= size ; row++ ){
            for(int col = 1 ; col <= size ; col++){
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void boxPatternC(int size){
        for(int row = 1 ; row <= size ; row++ ){
            for(int col = size ; col >= 1 ; col-- ){
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void boxPatternD(int size){
        for(int row = 1 ; row <= size ; row++ ){
            for(int col = 1 ; col <= size ; col++){
                if (row == 1 || row == size || row == col || row == size - col + 1 ) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void hillPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                double distance = size - col;
                if (Math.abs(distance) < row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void testBoxPattern(){
        System.out.print("Enter the size:");
        int size = sc.nextInt();
        if (size >= 0){
            System.out.println("(a):");
            boxPatternA(size - 1);

            System.out.println("(b):");
            boxPatternB(size - 1);

            System.out.println("(c):");
            boxPatternC(size - 1);

            System.out.println("(d):");
            boxPatternD(size - 1);
        }
    }
//2.6
    public static void hillPatternB(int size) {
        size = size + 1;
        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                double distance = size - col;
                if (Math.abs(distance) < (size - row + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int numRows) {
        hillPatternA(numRows);
        hillPatternB(numRows - 1);
    }
    public static void hillPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col < 2 * size; col++) {
                double distance = size - col;
                if (Math.abs(distance) < (row - 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++) {
            for (int col = 1; col < 2 * size; col++) {
                double distance = size - col;
                if (Math.abs(distance) < (size - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    public static void testHillPatternX(){
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.println("(a) : ");
        hillPatternA(size);
        System.out.println("(b) : ");
        hillPatternB(size);
        System.out.println("(c) : ");
        hillPatternC(size);
        System.out.println("(d) : ");
        hillPatternD(size);
    }
    public static void main(String[] args){
        sc = new Scanner(System.in);
        testSquarePattern();
        testCheckPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPatternX();
    }
}
