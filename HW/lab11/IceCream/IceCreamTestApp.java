package hus.oop.lab11.IceCream;

public class IceCreamTestApp {
    public static void main(String[] args) {
        IceCream chocolateIceCream = new ChocolateIceCream();
        IceCream honeyTopping = new HoneyToppingDecorator(chocolateIceCream);
        System.out.println(honeyTopping.getDescription());

        IceCream strawberryCream = new StrawberryIceCream();
        IceCream nutsTopping = new NutsToppingDecorator(strawberryCream);
        System.out.println(nutsTopping.getDescription());
    }
}

