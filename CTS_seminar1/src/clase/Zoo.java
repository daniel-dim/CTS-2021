package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeper ingrijitor;
	private List<Animal> animale;
	public Zoo(Zookeper ingrijitor, List<Animal> animale) {
		super();
		this.ingrijitor = ingrijitor;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.ingrijitor = new Zookeper("Gigel");
		this.animale = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal a) {
		animale.add(a);
	}
	
	public void feedAllAnimals() {
		for(Animal a: animale) {
			ingrijitor.feed(a);
		}
	}
	
}
