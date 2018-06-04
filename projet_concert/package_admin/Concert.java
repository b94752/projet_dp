package test_admin;

import java.sql.Date;
import java.util.Collection;

public interface Concert {
	

	public void notify(Object object) throws Exception;
	public void supprimer(Concert concert);
	public void ajouter(Concert concert);
	public void modifier(Concert concert);
	public Collection<Concert> findConcertByDate(Date date);	
}
 