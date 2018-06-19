package fr.epsi.b3.ConcertProjet.domain;


import javax.persistence.ManyToOne;

public class Reservation{
	
@ManyToOne 
Concert concert;
@ManyToOne 
Client client;

	public Concert getConcert() {
		return concert;
	}
	public void setConcert(Concert concert) {
		this.concert = concert;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
