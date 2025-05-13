package hus.oop.lab11.IceCream;

public class HoneyToppingDecorator extends ToppingDecorator {

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    // Ghi đè phương thức để thêm " Honey" vào mô tả
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Honey";
    }

    // Phương thức trả về mô tả với topping
    @Override
    public String addTopping() {
        return getDescription();
    }
}

