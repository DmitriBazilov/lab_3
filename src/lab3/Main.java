package lab3;

import classes.Door;
import classes.Human;
import classes.Key;
import classes.Lamp;
import classes.Place;
import classes.Rabbit;
import classes.Table;
import enums.Color;
import enums.Description;
import enums.Material;
import enums.Mood;

public class Main {
	public static void main(String[] args) {
		Place dungeon = new Place("Подземелье");
		dungeon.addDescription(Description.LOW);
		dungeon.addDescription(Description.LONG);
		Human alice = new Human("Алиса", Mood.PANIC);
		Rabbit whiteRabbit = new Rabbit("Кролик");
		whiteRabbit.setColor(Color.WHITE);
	
		Door[] doors = new Door[5];
		for (int i = 0; i < doors.length; i++) {
			doors[i] = new Door("Дверь", dungeon);
		}
		
		Table table = new Table("Столик", dungeon, Material.GLASS);
		table.addDescription(Description.SMALL);
		Key key = new Key("Ключик");
		key.setMaterial(Material.GOLD);
		table.addObj(key);
		
		for (int i = 0; i < 8; i++) {
			Lamp lamp = new Lamp("Лампа", dungeon, 30);
			dungeon.addLamp(lamp);
		}
		
		alice.moodStateInfo();
		whiteRabbit.changeLocation(null);
		alice.changeLocation(dungeon);
		dungeon.outputDescription();
		dungeon.printIlluminaton();
		alice.getAround();
		alice.countOpenDoors(doors);
		alice.getAround();
		alice.countOpenDoors(doors);
		alice.setMoodstate(Mood.DEPRESSION);
		alice.moodStateInfo();
		alice.moveThere();
		alice.bangAgainst(table);
		table.outputDescription();
		table.infoMaterial();
		table.outputContainer();
				
	}
}
