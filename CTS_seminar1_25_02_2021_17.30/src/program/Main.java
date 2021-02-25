package program;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Girafa girafa1 = new Girafa("girafa1");
		Girafa girafa2 = new Girafa("girafa2");
		
		zoo.adaugaAnimal(girafa1);
		zoo.adaugaAnimal(girafa2);
		
		zoo.feedAllAnimals();
		
		Zebra zebra1 = new Zebra("zebra1");
		Zebra zebra2 = new Zebra("zebra2");
		
		zoo.adaugaAnimal(zebra1);
		zoo.adaugaAnimal(zebra2);
		
		zoo.feedAllAnimals();
				

	}

}
