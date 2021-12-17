package classes;

import java.util.Objects;

public class Lamp extends Lifeless {
	private int power = 0;
	
	public Lamp() {}
	
	public Lamp(String name, int power) {
		super(name);
		this.power = power;
	}
	
	public Lamp(String name, Place location, int power) {
		super(name, location);
		this.power = power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " name: " + getName() + " power " + power 
				+ " location: " + getLocation() + " description: " + getStringDescription();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), power, getLocation(), getDescription());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lamp objLamp = (Lamp) obj;
		return getName().equals(objLamp.getName()) 
				&& power == objLamp.power
				&& getLocation().equals(objLamp.getLocation())
				&& getDescription().equals(objLamp.getDescription());
	}
	
	
}
