package hus.oop.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        ArrayPolynomial polynomial = new ArrayPolynomial();
        polynomial.append(2);
        polynomial.append(-3);
        polynomial.append(5);
        polynomial.append(4);

        System.out.println("=== ArrayPolynomial Test ===");
        System.out.println("Polynomial: " + polynomial);

        System.out.println("Degree is: " + polynomial.degree()) ;

        ArrayPolynomial polynomialAnother = new ArrayPolynomial();
        polynomialAnother.append(2.3);
        polynomialAnother.append(0);
        polynomialAnother.append(9);
        polynomialAnother.append(4);

        System.out.println("PolynomialAnother: " + polynomialAnother);

         //Test evaluating the polynomial for x = 2
        double x = 2;
        double result = polynomial.evaluate(x);
        System.out.println("Polynomial evaluated for x = " + x + ": " + result);

        ArrayPolynomial resultPlus = polynomial.plus(polynomialAnother);
        System.out.println("Test Plus:" + resultPlus);

        ArrayPolynomial resultMinus = polynomial.minus(polynomialAnother);
        System.out.println("Test Minus:" + resultMinus);

        ArrayPolynomial resultMultiply = polynomial.multiply(polynomialAnother);
        System.out.println("Test Multiply:" + resultMultiply);



        polynomial.set(-6,1);
        System.out.println("Modified Polynomial: " + polynomial);

        Polynomial resultDerivative = polynomial.derivative();
        System.out.println("Test derivative:" + resultDerivative);

    }

    public static void testListPolynomial() {
        ListPolynomial polynomial = new ListPolynomial();
        polynomial.append(3.0);
        polynomial.append(2.0);
        polynomial.append(8.0);
        polynomial.append(1.0);

        System.out.println("=== ListPolynomial Test ===");
        System.out.println("Polynomial: " + polynomial);

        // Kiểm tra phương thức coefficient()
        double coefficient = polynomial.coefficient(2);
        System.out.println("The coefficient of x^2 is: " + coefficient);


        // Kiểm tra phương thức degree()
        int degree = polynomial.degree();
        System.out.println("The degree of the polynomial is: " + degree);

        // Kiểm tra phương thức derivative()
        Polynomial derivative = polynomial.derivative();
        System.out.println("derivative: " + derivative);

        // Kiểm tra phương thức evaluate()
        double value = polynomial.evaluate(0.5);
        System.out.println("The value of the polynomial at x = 0.5 is: " + value);

        ListPolynomial polynomial2 = new ListPolynomial();
        polynomial2.append(1.0).append(0.0).append(4.0); // Q(x) = 4x^2 + 1

        // Kiểm tra phương thức minus()
        ListPolynomial minus = polynomial.minus(polynomial2);
        System.out.println("The minus is: " + minus);

        // Kiểm tra phương thức plus()
        ListPolynomial plus = polynomial.plus(polynomial2);
        System.out.println("The plus is: " + plus);

        // Kiểm tra phương thức multiply()
        ListPolynomial product = polynomial.multiply(polynomial2);
        System.out.println("The product  is: " + product);
    }

        public static void testIntegrationCalculator () {
            System.out.println("IntegrationCalculator test:");
            StringBuilder result = new StringBuilder();
            ArrayPolynomial polynomial = new ArrayPolynomial();
            polynomial.append(1).append(2).append(1);

            // Giả sử khoảng [0, 1] và số phân đoạn là 100
            double interval = 1.0;
            int subintervals = 100;

            // Quy tắc Trung điểm
            IntegrationCalculator calculator = new IntegrationCalculator(new MidpointRule(interval, subintervals), polynomial);
            double resultMidpoint = calculator.integrate(0, 1);
            result.append("Midpoint Rule integration of ArrayPolynomial from 0 to 1: ").append(resultMidpoint).append("\n");

            // Quy tắc Hình thang
            calculator = new IntegrationCalculator(new TrapezoidRule(interval, subintervals), polynomial);
            double resultTrapezoid = calculator.integrate(0, 1);
            result.append("Trapezoid Rule integration of ArrayPolynomial from 0 to 1: ").append(resultTrapezoid).append("\n");

            // Quy tắc Simpson
            calculator = new IntegrationCalculator(new SimpsonRule(interval, subintervals), polynomial);
            double resultSimpson = calculator.integrate(0, 1);
            result.append("Simpson Rule integration of ArrayPolynomial from 0 to 1: ").append(resultSimpson).append("\n");

            System.out.println(result.toString());

        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        }
    }