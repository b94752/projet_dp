package projet_concert.test_admin;

import java.sql.Date;
import java.util.Collection;

public interface Concert {
	

	public void notify(Object object) throws Exception;
	public Collection<Concert> findConcertByDate(Date date);	
}
 