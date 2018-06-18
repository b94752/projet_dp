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
	@OneToMany Collection<ReserverConcert> clientConcert = new ArrayList<ReserverConcert>();
	@OneToMany Collection<JouerConcert> groupesConcert = new ArrayList<JouerConcert>();
	@ManyToOne Lieu lieu;
	

	public Collection<ReserverConcert> getClientConcert() {
		return clientConcert;
	}

	public void setClientConcert(Collection<ReserverConcert> clientConcert) {
		this.clientConcert = clientConcert;
	}

	//LIEU : 
	public Lieu getLieu() {
		return lieu;
	}
	
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}	
	
	
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




	public Collection<JouerConcert> getGroupesConcert() {
		return groupesConcert;
	}

	public void setGroupesConcert(Collection<JouerConcert> groupesConcert) {
		this.groupesConcert = groupesConcert;
	}

	public void addConcert(Groupe groupe) {
		
		JouerConcert jouerConcert = new JouerConcert();
		
		groupesConcert.add(jouerConcert);
		jouerConcert.setConcert(this);
	
		groupe.jouer_s.add(jouerConcert);
		jouerConcert.setGroupe(groupe);
	}
	
	public void addConcert(Client client) {
		
		ReserverConcert reserverConcert = new ReserverConcert();
		
		clientConcert.add(reserverConcert);
		reserverConcert.setConcert(this);
	
		client.Concerts.add(reserverConcert);
		reserverConcert.setClient(client);
	}




	

	


}
