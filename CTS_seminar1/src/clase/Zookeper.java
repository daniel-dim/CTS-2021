package clase;

public class Zookeper {
	private String nume;
	
	public Zookeper(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void feed(Animal a) {
		System.out.println(nume + " feeds the animal " + a.getName());
	}
}
