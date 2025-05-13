package hus.oop.exercises;
import java.util.Scanner;
public class Matrix {
    static Scanner sc;
    public static int[][] print(int[][] matrix){
            for(int row = 0 ; row < matrix.length ; row++){
                for(int col = 0 ; col < matrix[0].length ; col++){
                    matrix[row][col] = sc.nextInt();
                }
            }
            return matrix;
    }
    public static void printResult(int[][] result){
        for(int row = 0 ; row < result.length ; row++){
            for(int col = 0 ; col < result[0].length ; col++){
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] print(double [][] matrix){
        for(int row = 0 ; row < matrix.length ; row++){
            for(int col = 0 ; col < matrix[0].length ; col++){
                matrix[row][col] = sc.nextDouble();
            }
        }
        return matrix;
    }
    public static void printResult(double[][] result){
        for(int row = 0 ; row < result.length ; row++){
            for(int col = 0 ; col < result[0].length ; col++){
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static boolean haveSameDimension(int[][] matrix1 , int[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return true;
        }
        return false;
    }
    public static boolean haveSameDimension(double[][] matrix1 , double[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return true;
        }
        return false;
    }
    public static int[][] add(int[][] matrix1 , int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
            for (int row = 0; row < result.length; row++) {
                for (int col = 0; col < result[0].length; col++) {
                    result[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        return result;
    }
    public static int[][] subtract(int[][] matrix1 , int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }
    public static int multiofmatrix(int row ,int[][] matrix1 ,int colum , int[][] matrix2){
        int sum = 0;
        for (int col = 0; col < matrix1[0].length; col++){
            sum= sum+ matrix1[row][col]*matrix2[col][colum];
        }
        return sum;
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int [][] matrix = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col =0; col < matrix1.length; col++){
                matrix[row][col]= multiofmatrix(row,matrix1,col,matrix2);
            }
        }
        return matrix;
    }
    public static double[][] add(double[][] matrix1 , double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }
    public static double[][] subtract(double[][] matrix1 , double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }
    public static double multiofmatrix(int row ,double[][] matrix1 ,int colum , double[][] matrix2){
        double sum = 0;
        for (int col = 0;  col < matrix1[0].length; col++){
            sum= sum+ matrix1[row][col]*matrix2[col][colum];
        }
        return sum;
    }
    public static double[][] multiply(double[][] matrix1 , double[][] matrix2){
        double [][] matrix = new double[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col =0; col < matrix1.length; col++){
                matrix[row][col]= multiofmatrix(row,matrix1,col,matrix2);
            }
        }
        return matrix;
    }

    public static void testArrayInt(){
        System.out.print("Enter the row of the matrix1: ");
        int rowNumber1 = sc.nextInt();
        System.out.print("Enter the col of the matrix1: ");
        int colNumber1 =  sc.nextInt();
        int[][] matrix1 = new int[rowNumber1][colNumber1];
        System.out.println("Enter values for matrix1:");
        print(matrix1);
        System.out.print("Enter the row of the matrix2: ");
        int rowNumber2 = sc.nextInt();
        System.out.print("Enter the col of the matrix2: ");
        int colNumber2 =  sc.nextInt();
        int[][] matrix2 = new int[rowNumber2][colNumber2];
        System.out.println("Enter values for matrix2:");
        print(matrix2);
        int[][] resultAdd = add(matrix1, matrix2);
        int[][] resultSubtract = subtract(matrix1, matrix2);
        int[][] resultMultiply = multiply(matrix1 , matrix2 );
        if (haveSameDimension(matrix1, matrix2)) {
            System.out.println("Result of method add :" );
            printResult(resultAdd);
            System.out.println("Result of method subtract :" );
            printResult(resultSubtract);
            System.out.println("Result of method multiply :" );
            printResult(resultMultiply);
        }else {
            System.out.println("Error" );
        }
    }
    public static void testArrayDouble(){
        System.out.print("Enter the row of the matrix1: ");
        int rowNumber1 = sc.nextInt();
        System.out.print("Enter the col of the matrix1: ");
        int colNumber1 =  sc.nextInt();
        double[][] matrix1 = new double[rowNumber1][colNumber1];
        System.out.println("Enter values for matrix1:");
        print(matrix1);
        System.out.print("Enter the row of the matrix2: ");
        int rowNumber2 = sc.nextInt();
        System.out.print("Enter the col of the matrix2: ");
        int colNumber2 =  sc.nextInt();
        double[][] matrix2 = new double[rowNumber2][colNumber2];
        System.out.println("Enter values for matrix2:");
        print(matrix2);
        double[][] resultAdd = add(matrix1, matrix2);
        double[][] resultSubtract = subtract(matrix1, matrix2);
        double[][] resultMultiply = multiply(matrix1 , matrix2 );
        if (haveSameDimension(matrix1, matrix2)) {
            System.out.println("Result of method add :" );
            printResult(resultAdd);
            System.out.println("Result of method subtract :" );
            printResult(resultSubtract);
            System.out.println("Result of method multiply :" );
            printResult(resultMultiply);
        }else {
            System.out.println("Error" );
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        testArrayInt();
        testArrayDouble();
    }
}
