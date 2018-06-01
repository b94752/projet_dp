package projet_concert;

public class Main {

	public static void main(String[] args) {

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
		
		System.out.println(RnB.toStringConcertToJouer());
		System.out.println(Bercy);
		
	}
}
