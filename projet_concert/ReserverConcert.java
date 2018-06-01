package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class ReserverConcert {
	
Collection<Concert> concerts = new ArrayList<Concert>();
Collection<Client> clients = new ArrayList<Client>();
	
	//CONCERTS :
	public Collection<Concert> getConcerts(){
		return concerts;
	}

	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setReserverConcert(this);
	}
	
	public void removeConcert(Concert concert) {
		concerts.remove(concert);
		concert.setReserverConcert(null);
	}
	

	
	
	//CLIENTS :
	public Collection<Client> getClients(){
		return clients;
	}
	
	public void addClient(Client client) {
		clients.add(client);
		client.setReserverConcert(this);
	}
	
	public void removeClient(Client client) {
		clients.remove(client);
		client.setReserverConcert(null);
	}
	
	
	public String toStringConcertToClient() {
		return ((Client) clients).toStringClient();
	}
	
	public String toStringClientToConcert() {
		return ((Concert) concerts).toStringConcert();
	}

}
