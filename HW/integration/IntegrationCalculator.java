package hus.oop.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial poly;

    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     * @param poly
     */
    public IntegrationCalculator(Polynomial poly) {
        this.poly = poly;
    }

    public IntegrationCalculator(Integrator integrator, Polynomial poly) {
        this.integrator = integrator;
        this.poly = poly;
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
    }

    public void setPoly(Polynomial poly) {
        this.poly = poly;
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     * @param
     * @param
     */



    public double integrate(double lower, double upper) {
        return integrator.integrate(poly, lower, upper);
    }
}
