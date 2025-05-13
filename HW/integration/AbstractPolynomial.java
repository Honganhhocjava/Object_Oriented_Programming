package hus.oop.integration;


public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     *
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder polynomialString = new StringBuilder();
        double[] coeffs = coefficients();
        int degree = coeffs.length - 1;
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

    /**
     * Lấy đạo hàm đa thức.
     *
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coeffs = coefficients();
        if (coeffs.length == 0) {
            throw new IllegalArgumentException("Cannot calculate derivative of an empty polynomial");
        }
        double[] derivedCoefficients = new double[coeffs.length - 1];
        for (int i = 1; i < coeffs.length; i++) {
            derivedCoefficients[i - 1] = coeffs[i] * i;
        }
        return derivedCoefficients;
    }
}