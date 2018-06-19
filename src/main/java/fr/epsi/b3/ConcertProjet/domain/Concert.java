package fr.epsi.b3.ConcertProjet.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Concert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String nomConcert;
	@OneToMany Collection<Reservation> clientConcert = new ArrayList<Reservation>();
	@OneToMany Collection<JouerConcert> groupesConcert = new ArrayList<JouerConcert>();
	@ManyToOne Lieu lieu;
	
	//RESERVER : 
	public Collection<Reservation> getClientConcert() {
		return clientConcert;
	}

	public void setClientConcert(Collection<Reservation> clientConcert) {
		this.clientConcert = clientConcert;
	}

	//LIEU : 
	public Lieu getLieu() {
		return lieu;
	}
	
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}	
	
	//CONCERT : 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomConcert() {
		return nomConcert;
	}

	public void setNomConcert(String nomConcert) {
		this.nomConcert = nomConcert;
	}



	//JOUER : 
	public Collection<JouerConcert> getGroupesConcert() {
		return groupesConcert;
	}

	public void setGroupesConcert(Collection<JouerConcert> groupesConcert) {
		this.groupesConcert = groupesConcert;
	}

	//ADD - REMOVE : 
	public void addConcert(Groupe groupe) {
		
		JouerConcert jouerConcert = new JouerConcert();
		
		groupesConcert.add(jouerConcert);
		jouerConcert.setConcert(this);
	
		groupe.jouer_s.add(jouerConcert);
		jouerConcert.setGroupe(groupe);
	}
	
	public void removeConcert(Groupe groupe) {
		
	}
	
	public void addConcert(Client client) {
		
		Reservation reserverConcert = new Reservation();
		
		clientConcert.add(reserverConcert);
		reserverConcert.setConcert(this);
	
		client.Concerts.add(reserverConcert);
		reserverConcert.setClient(client);
	}
	
	public void removeConcert(Client client) {
		
	}




	

	


}
