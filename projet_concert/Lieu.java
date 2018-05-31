package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class Lieu {
	
Collection<Concert> concerts = new ArrayList<Concert>();
	
	public Collection<Concert> getConcerts(){
		return concerts;

	}

	
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setLieu(this);
		
	}
	
	@Override
	public String toString() {
		return "Lieu [concerts=" + concerts + "]";
	}


}
