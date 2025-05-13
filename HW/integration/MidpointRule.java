package hus.oop.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int numOfSubIntervals = 1;
        double previousApproximation = 0.0;
        double currentApproximation = midpointApproximation(poly, lower, upper, numOfSubIntervals);

        int iterations = 0;
        while (Math.abs(currentApproximation - previousApproximation) / 3 >= precision && iterations < maxIterations) {
            previousApproximation = currentApproximation;
            numOfSubIntervals *= 2;
            currentApproximation = midpointApproximation(poly, lower, upper, numOfSubIntervals);
            iterations++;
        }

        return currentApproximation;
    }

    private double midpointApproximation(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i < numOfSubIntervals; i++) {
            double midpoint = lower + (i + 0.5) * intervalWidth;
            sum += poly.evaluate(midpoint);
        }

        return sum * intervalWidth;
    }
}