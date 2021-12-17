package classes;

import java.util.Objects;
import enums.Mood;

public class Human extends Character{
	private String gender;
	
	public Human() {}
	
	public Human(String name) {
		super(name);
	}
	
	public Human(String name, Place location) {
		super(name, location);
	}
	
	public Human(String name, Mood moodstate) {
		super(name);
		this.setMoodstate(moodstate);
	}
	
	public Human(String name, Place location, Mood moodState) {
		super(name, location, moodState);
	}
	
	public Human(String name, Place location, String gender) {
		this(name, location);
		this.gender = gender;
	}
	
	public Human(String name, Place location, Mood moodstate, String gender) {
		this(name, location, moodstate);
		this.gender = gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void countOpenDoors(Door[] doors) {
		int count = 0;
		for (Door d : doors) {
			if (d.getStatusOpen()) {
				count++;
			}
		}
		if (count == 0) {
			System.out.print("Все двери закрыты ");
		} else {
			System.out.print(count + " дверей открыто ");
		}
		
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " name: " + getName() + " gender: " + gender
				+ " mood: " + getMoodstate().getState() + " location: " + getLocation()
				+ " description: " + getStringDescription();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), gender, getMoodstate(), getLocation(), getDescription());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human objHuman = (Human) obj;
		return getName().equals(objHuman.getName()) 
				&& gender.equals(objHuman.gender)
				&& getMoodstate().equals(objHuman.getMoodstate()) 
				&& getLocation().equals(objHuman.getLocation())
				&& getDescription().equals(objHuman.getDescription());
	}
	
	
}
