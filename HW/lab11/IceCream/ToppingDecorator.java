package hus.oop.lab11.IceCream;

public abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;

    // Constructor để thiết lập iceCream
    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    // Ghi đè phương thức getDescription nếu cần thiết
    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    // Phương thức trừu tượng để thêm topping
    public abstract String addTopping();
}