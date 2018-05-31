package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class Groupe {

Collection<Concert> concerts = new ArrayList<Concert>();

	
	public Collection<Concert> getConcerts(){
		return concerts;

	}
	
	
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.addGroupe(this);
		
	}
	
	
	@Override
	public String toString() {
		return "Groupe [concerts=" + concerts + "]";
	}

}
