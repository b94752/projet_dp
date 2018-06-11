package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class ReserverConcert implements Reserver{
	
Collection<Concert> concerts = new ArrayList<Concert>();
Collection<Client> clients = new ArrayList<Client>();
	
	//CONCERTS :
	public Collection<Concert> getConcerts(){
		return concerts;
	}

	@Override
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setReserverConcert(this);
	}
	
	@Override
	public void removeConcert(Concert concert) {
		concerts.remove(concert);
		concert.setReserverConcert(null);
	}
	

	
	
	//CLIENTS :
	public Collection<Client> getClients(){
		return clients;
	}
	
	public Client addClient(Client client) {
		clients.add(client);
		client.setReserverConcert(this);
		return client;
	}
	
	public void removeClient(Client client) {
		clients.remove(client);
		client.setReserverConcert(null);
	}

	@Override
	public float payer(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float payer(Client client, Concert concert) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Concert> findByIdResa(int ID_evnt) {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
