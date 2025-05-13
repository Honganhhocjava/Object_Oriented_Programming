package hus.oop.lab5;
import java.math.BigInteger;

public class MyBigInteger {
    public static BigInteger add(BigInteger firstNumber, BigInteger secondNumber){
        return firstNumber.add(secondNumber);
    }

    public static void main(String[] args){
        BigInteger firstNumber  = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger secondNumber = new BigInteger("22222222222222222222222222222222222222222222222222");
        BigInteger sum = add(firstNumber, secondNumber);
        System.out.println("Sum: " + sum);
    }
}
