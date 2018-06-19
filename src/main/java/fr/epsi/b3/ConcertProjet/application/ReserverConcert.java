package fr.epsi.b3.ConcertProjet.application;

import java.util.Collection;

import fr.epsi.b3.ConcertProjet.domain.Client;
import fr.epsi.b3.ConcertProjet.domain.Concert;

public class ReserverConcert implements Reserver {

	@Override
	public void addConcert(Concert concert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeConcert(Concert concert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClient(Client client) {
		// TODO Auto-generated method stub
		
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

	@Override
	public float payer(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

}
