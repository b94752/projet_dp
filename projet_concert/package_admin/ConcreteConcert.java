package test_admin;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConcreteConcert implements Concert
{

	List<Concert_admin> observers = new ArrayList<Concert_admin>();
	

	public void notify(Object object) throws Exception{
		for(Concert_admin observer: observers) {
			observer.update(object);
			System.out.println("Je suis l'objet " + this + " qui reçoit : " + object + " en argument.");
		}
	}

	public void supprimer(Concert concert) {
		// TODO Auto-generated method stub
		observers.remove(concert);
		System.out.println("Suppresion de l'objet " + this + " qui reçoit : " + concert + " en argument.");

	}

	public void ajouter(Concert concert) {
		// TODO Auto-generated method stub
		observers.add((Concert_admin) concert);
		System.out.println("Ajout de l'objet '' " + this + " '' qui reçoit : " + concert + " 'en argument.' ");

	}

	public Collection<Concert> findConcertByDate(Date date) {
		// TODO implements date of concert
		return null;
	}

	public void modifier(Concert concert) {
		// TODO Auto-generated method stub
		
	}


}
