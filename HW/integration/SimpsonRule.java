package hus.oop.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int numOfSubIntervals = 2;
        double previousApproximation = 0.0;
        double currentApproximation = simpsonApproximation(poly, lower, upper, numOfSubIntervals);

        int iterations = 0;
        while (Math.abs(currentApproximation - previousApproximation) / 15 >= precision && iterations < maxIterations) {
            previousApproximation = currentApproximation;
            numOfSubIntervals *= 2;
            currentApproximation = simpsonApproximation(poly, lower, upper, numOfSubIntervals);
            iterations++;
        }

        return currentApproximation;
    }

    private double simpsonApproximation(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i < numOfSubIntervals; i += 2) {
            double x0 = lower + i * intervalWidth;
            double x1 = lower + (i + 1) * intervalWidth;
            double x2 = lower + (i + 2) * intervalWidth;

            double f0 = poly.evaluate(x0);
            double f1 = poly.evaluate(x1);
            double f2 = poly.evaluate(x2);

            sum += (f0 + 4 * f1 + f2);
        }

        return (intervalWidth / 3) * sum;
    }
}