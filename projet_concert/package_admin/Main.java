package test_admin;

public class Main {

	public static void main(String[] args) {
		
		try {
		// erreur a corriger
			Concert_admin subject = new ConcreteAdmin(); 
			Concert_admin subject2 = new ConcreteAdmin(); 

			
			Concert observer1 = new ConcreteConcert();
			observer1.ajouter(subject);
			
			Concert observer2 = new ConcreteConcert();
			subject.supprimer(subject);
			
			//String s = "Bonjour";
			//subject2.notify(s);
			//subject2.notify(s);

			//Concert_admin.Ajouter();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
