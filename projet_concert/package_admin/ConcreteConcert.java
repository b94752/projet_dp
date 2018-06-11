package projet_concert.test_admin;

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


	public Collection<Concert> findConcertByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}


}
