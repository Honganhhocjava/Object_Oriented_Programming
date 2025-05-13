package hus.oop.lab7;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greeting() {
        System.out.println("Wooow");
    }
    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}
