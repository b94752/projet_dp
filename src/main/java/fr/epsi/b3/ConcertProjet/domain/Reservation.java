package fr.epsi.b3.ConcertProjet.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int Id_resa;

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
	
	public int getId_resa() {
		return Id_resa;
	}
	public void setId_resa(int id_resa) {
		Id_resa = id_resa;
	}

}
