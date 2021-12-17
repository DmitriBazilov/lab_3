package classes;

import java.util.ArrayList;
import enums.Description;

public class Place implements Containable<Entity>, Contained<Place>{
	private String name;
	private ArrayList<Description> description = new ArrayList<>();
	private Place location;
	private ArrayList<Entity> container = new ArrayList<>();
	private ArrayList<Lamp> lamps = new ArrayList<>();
	
	public Place() {}
	
	public Place(String name) {
		this.name = name;
	}
	
	public Place(String name, Place location) {
		this.name = name;
		this.location = location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addDescription(Description description) {
		this.description.add(description);
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Description> getDescription() {
		return description;
	}
	
	public void outputDescription() {
		for (Description d : description) {
			System.out.print(d.getState() + " ");
		}
	}
	
	public void addLamp(Lamp lamp) {
		lamps.add(lamp);
	}
	
	public double getIllumination() {
		double result = 0;
		for (Lamp lamp : lamps) {
			result += lamp.getPower();
		}
		return result / lamps.size();
	}
	
	public void printIlluminaton() {
		double iLevel = getIllumination();
		if (iLevel < 20) {
			System.out.print("темно ");
		} else if (iLevel < 40) {
			System.out.print("темновато ");
		} else if (iLevel < 60) {
			System.out.print("норм по свету ");
		} else if (iLevel < 80) {
			System.out.print("светло");
		} else {
			System.out.print("очень светло ");
		}
	}
	
	@Override
	public void addObj(Entity Obj) {
		container.add(Obj);
	}
	
	@Override
	public void delObj(Entity Obj) {
		container.remove(Obj);
	}
	
	@Override
	public String getContainerName() {
		return name;
	}
	
	@Override
	public void outputContainer() {
		System.out.print("В " + this.getContainerName() + " находится: ");
		for (Entity entity : container) {
			entity.outputDescription();
			System.out.print(entity.getName() + " ");
		}
	}
	
	@Override
	public void changeLocation(Place location) {
		this.location = location;
	}
	
	@Override
	public Place getLocation() {
		return location;
	}

	
}
