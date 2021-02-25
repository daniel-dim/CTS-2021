package clase;

import java.util.ArrayList;
import java.util.List;

import Interfete.ZooInterface;


// interfata se face daca nu ai atribute in clasa 
// daca ai atribute poti face clasa abstracta daca nu o faci abstracta trebuie mutat name
// in clasa Girafa si Zebra

public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	
	
	public Zoo() {
		animalList = new ArrayList<>();
		zookeeper = new Zookeeper("Ion");
	}



	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void adaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal:animalList ) {
			zookeeper.feed(animal);
		}
	}
	
}
