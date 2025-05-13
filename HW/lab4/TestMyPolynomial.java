package hus.oop.lab4;
public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(new double[]{1.0, 1.2, 2.3, 3.0});
        System.out.println("Polynomial 1: " + polynomial1);
        double[] coeffs2 = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs2);
        System.out.println("Polynomial 2: " + polynomial2);
        // Test getDegree
        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());
        // Test evaluate
        double x = 2.0;
        System.out.println("Evaluate Polynomial 1 at x = " + x + ": " + polynomial1.evaluate(x));
        System.out.println("Evaluate Polynomial 2 at x = " + x + ": " + polynomial2.evaluate(x));
        // Test add
        MyPolynomial sumResult = polynomial1.add(polynomial2);
        System.out.println("Sum of Polynomial 1 and Polynomial 2: " + sumResult);
        // Test multiply
        MyPolynomial multiplyResult = polynomial1.multiply(polynomial2);
        System.out.println("Product of Polynomial 1 and Polynomial 2: " + multiplyResult);
    }
}
