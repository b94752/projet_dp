package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
	
Collection<Concert> concerts = new ArrayList<Concert>();

	
	public Collection<Concert> getConcerts(){
		return concerts;

	}
	
	
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.addClient(this);
		
	}

	
	//public Collection<Client> selectAll(){
		//String requete = "SELECT * FROM clients;";
	//}
	
	@Override
	public String toString() {
		return "Client [concerts=" + concerts + "]";
	}

}
