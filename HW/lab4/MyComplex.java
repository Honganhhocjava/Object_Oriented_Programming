package hus.oop.lab4;

public class MyComplex {
    private double real ;
    private double imag;
    public MyComplex(){
//        this.real = 0.0 ;
//        this.imag = 0.0 ;
        this(0.0,0.0);
    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real , double imag){
        this.real =real;
        this.imag = imag ;
    }
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
    public boolean isReal(){
        return imag == 0.0 ;
    }
    public boolean isImaginary(){
        return  real == 0.0 ;
    }
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }
    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }
    public double magnitude(){
        return Math.sqrt(real * real + imag * imag);
    }
    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public MyComplex subtractInto(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }
    public MyComplex multiply(MyComplex right) {
        double tempReal = this.real * right.real - this.imag * right.imag;
        double tempImag = this.real * right.imag + this.imag * right.real;
        this.real = tempReal;
        this.imag = tempImag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        double tempReal = (this.real * right.real + this.imag * right.imag) / divisor;
        double tempImag = (this.imag * right.real - this.real * right.imag) / divisor;
        this.real = tempReal;
        this.imag = tempImag;
        return this;
    }
    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
