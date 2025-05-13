package hus.oop.decorator;

public abstract class Bread {
	protected String description;
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
