package classes;

public abstract class Lifeless extends Entity {
	public Lifeless() {}
	
	public Lifeless(String name) {
		super(name);
	}
	
	public Lifeless(String name, Place location) {
		super(name, location);
	}
	
}
