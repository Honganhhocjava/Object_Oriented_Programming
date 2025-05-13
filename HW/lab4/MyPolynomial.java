package hus.oop.lab4;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double ... coeffs){
        this.coeffs = coeffs;
    }
    public int getDegree() {
        int degree = coeffs.length - 1;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                break;
            }
            degree--;
        }
        return degree;
    }
    public String toString() {
        StringBuilder polynomialString = new StringBuilder();
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i < degree && coeffs[i] > 0) {
                    polynomialString.append(" + ");
                } else if (i < degree && coeffs[i] < 0) {
                    polynomialString.append(" ");
                }
                polynomialString.append(coeffs[i]);
                if (i > 0) {
                    polynomialString.append("x");
                    if (i > 1) {
                        polynomialString.append("^").append(i);
                    }
                }
            }
        }

        return polynomialString.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        double temp = 1.0 ;
        int degree = getDegree();
        for (int i = 0; i <= degree ; i++) {
            result += coeffs[i] * temp ;
            temp *= x ;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int maxDegree = Math.max(thisDegree, anotherDegree);
        double[] resultCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= thisDegree; i++) {
            resultCoeffs[i] += coeffs[i];
        }
        for (int i = 0; i <= anotherDegree; i++) {
            resultCoeffs[i] += another.coeffs[i];
        }
        this.coeffs = resultCoeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int thisDegree = getDegree();
        int anotherDegree = another.getDegree();
        int resultDegree = thisDegree + anotherDegree;
        double[] resultCoeffs = new double[resultDegree + 1];
        for (int i = 0; i <= thisDegree; i++) {
            for (int j = 0; j <= anotherDegree; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}
