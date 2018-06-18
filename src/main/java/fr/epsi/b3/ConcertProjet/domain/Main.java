package fr.epsi.b3.ConcertProjet.domain;

public class Main {

	public static void main(String[] args) {
		
		try {

		//DECLARATIONS : 
		Lieu Bercy = new Lieu();
		Concert RnB = new Concert();
		Groupe Rihanna = new Groupe();
		Client Emma = new Client();
		Client Adrien = new Client();
		
		//LIENS : 
		Bercy.addConcert(RnB);
		Rihanna.addConcert(RnB);
		Emma.addConcert(RnB);
		Adrien.addConcert(RnB);
		
		System.out.println(Rihanna);
		System.out.println(Emma);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
