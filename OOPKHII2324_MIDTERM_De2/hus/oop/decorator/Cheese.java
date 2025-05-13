package hus.oop.decorator;

public class Cheese extends ToppingDecorator {
	public Cheese(Bread bread) {
		/* TODO */
	}
 
	public String getDescription() {
		return bread.getDescription() + " + Cheese";
	}
 
	public double cost() {
		return bread.cost() + 1.0;
	}

	@Override
	public String toString() {
		/* TODO */
	}
}
