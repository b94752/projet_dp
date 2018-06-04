package test_admin;

public class ConcreteAdmin implements Concert_admin{

	public void update(Object object) {
		System.out.println("Je suis l'objet " + this + " qui reçoit : " + object + " en argument.");
	}

}


