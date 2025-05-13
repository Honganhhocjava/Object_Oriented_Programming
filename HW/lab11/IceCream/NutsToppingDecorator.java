package hus.oop.lab11.IceCream;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    // Ghi đè phương thức để thêm "Nuts" vào mô tả
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Nuts";
    }

    // Phương thức trả về mô tả với topping
    @Override
    public String addTopping() {
        return getDescription();
    }
}
