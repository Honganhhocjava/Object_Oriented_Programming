package hus.oop.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int numOfSubIntervals = 1;
        double previousApproximation = 0.0;
        double currentApproximation = trapezoidApproximation(poly, lower, upper, numOfSubIntervals);

        int iterations = 0;
        while (Math.abs(currentApproximation - previousApproximation) / 3 >= precision && iterations < maxIterations) {
            previousApproximation = currentApproximation;
            numOfSubIntervals *= 2;
            currentApproximation = trapezoidApproximation(poly, lower, upper, numOfSubIntervals);
            iterations++;
        }

        return currentApproximation;
    }

    private double trapezoidApproximation(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double intervalWidth = (upper - lower) / numOfSubIntervals;
        double sum = 0.0;

        for (int i = 0; i < numOfSubIntervals; i++) {
            double x0 = lower + i * intervalWidth;
            double x1 = lower + (i + 1) * intervalWidth;

            double f0 = poly.evaluate(x0);
            double f1 = poly.evaluate(x1);

            sum += (f0 + f1);
        }

        return (intervalWidth / 2) * sum;
    }
}