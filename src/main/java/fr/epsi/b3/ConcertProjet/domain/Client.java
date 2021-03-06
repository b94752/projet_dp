package fr.epsi.b3.ConcertProjet.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String nom;
	String prenom;
	Date ddn;
	float solde = 0;
	@OneToMany(cascade=CascadeType.ALL) 
	Collection<Reservation> Concerts = new ArrayList<Reservation>();

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDdn() {
		return ddn;
	}
	public void setDdn(Date datedenaissance) {
		this.ddn = datedenaissance;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}

	public Collection<Reservation> getConcerts() {
		return Concerts;
	}
	public void setConcerts(Collection<Reservation> concerts) {
		Concerts = concerts;
	}
	
	public void addConcert(Concert concert) {
		
		Reservation reserverConcert = new Reservation();
		
		Concerts.add(reserverConcert);
		reserverConcert.setClient(this);
	
		concert.clientConcert.add(reserverConcert);
		reserverConcert.setConcert(concert);
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", ddn=" + ddn + ", solde=" + solde
				+ ", Concerts=" + Concerts + "]";
	}
	public void removeConcert(Concert concert) {
		
	}
	
}
