package ro.cts.program;

//import ro.ase.cts.singleton.eager.ReceptieHotel;
import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Main {

	public static void main(String[] args) {
		
		//eager
		
//		ReceptieHotel receptie1 = ReceptieHotel.getInstanta();
//		ReceptieHotel receptie2 = ReceptieHotel.getInstanta();
//		
//		System.out.println("Receptie1: " + receptie1);
//		System.out.println("Receptie2: " + receptie2);
//		
//		receptie1.setNumeReceptioner("Andrei");
//		receptie2.setEtaj(5);
//		
//		System.out.println("Receptie1: " + receptie1);
//		System.out.println("Receptie2: " + receptie2);
		
		//lazy
		
		ReceptieHotel receptie3 = ReceptieHotel.getInstanta("Ion", 4, "Hotel1");
		ReceptieHotel receptie4 = ReceptieHotel.getInstanta("Andrei", 2, "Hotel2");
		
		System.out.println("Receptie1: " + receptie3);
		System.out.println("Receptie2: " + receptie4);
		
		receptie3.setNumeReceptioner("Andrei");
		receptie4.setEtaj(5);
		
		System.out.println("Receptie1: " + receptie3);
		System.out.println("Receptie2: " + receptie4);

	}

}
