package projet_concert;

import java.util.Collection;

public interface Reserver {
	
	//CONCERTS : 
	public void addConcert(Concert concert);
	public void removeConcert(Concert concert);
	
	//CLIENTS :
	public Client addClient(Client client);
	public void removeClient(Client client);
	public float payer(Client client, Concert concert);
	
	public Collection<Concert> findByIdResa (int ID_evnt);
	float payer(Client client);


}
