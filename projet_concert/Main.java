package projet_concert;

public class Main {

	public static void main(String[] args) {

		
		Lieu Bercy = new Lieu();
		
		Concert Star80 = new Concert();
		Bercy.addConcert(Star80);
		
		Concert SoireeRock = new Concert();
		Bercy.addConcert(SoireeRock);
		
		System.out.println(Bercy);
				
		Client Emma = new Client();
		Star80.addClient(Emma);
		
		Client Adrien = new Client();
		Star80.addClient(Adrien);
		
		System.out.println(Star80);
		System.out.println(SoireeRock);
		
	}

}
