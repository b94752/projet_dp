package projet_concert.test_admin;

public class ConcreteAdmin implements Concert_admin{

	public void update(Object object) {
		System.out.println("Je suis l'objet " + this + " qui re�oit : " + object + " en argument pour update.");
	}

	public void supprimer(Concert concert) {
		// TODO Auto-generated method stub
		System.out.println("Je suis l'objet " + this + " qui re�oit : " + concert + " en argument pour supp.");

	}

	public void ajouter(Concert concert) {
		// TODO Auto-generated method stub
		System.out.println("Je suis l'objet " + this + " qui re�oit : " + concert + " en argument. pour ajout");

	}

	public void modifier(Concert concert) {
		// TODO Auto-generated method stub
		System.out.println("Je suis l'objet " + this + " qui re�oit : " + concert + " en argument pour modif.");
	}

}


