package projet_concert.test_admin;

public class Main {

	public static void main(String[] args) {
		
		try {
		// erreur a corriger
			Concert_admin admin1 = new ConcreteAdmin(); 
			Concert_admin admin2 = new ConcreteAdmin(); 

			
			Concert concert1 = new ConcreteConcert();
			admin1.ajouter(concert1);
			
			Concert observer2 = new ConcreteConcert();
			admin2.modifier(concert1);
			
			//String s = "Bonjour";
			//subject2.notify(s);
			//subject2.notify(s);

			//Concert_admin.Ajouter();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
