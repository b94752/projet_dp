package fr.epsi.b3.ConcertProjet.domain;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String libelleLieu;
	String adresse;
	String codePostal;
	String ville;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLibelleLieu() {
		return libelleLieu;
	}


	public void setLibelleLieu(String libelleLieu) {
		this.libelleLieu = libelleLieu;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public void setConcerts(Collection<Concert> concerts) {
		this.concerts = concerts;
	}

	//CONCERTS : 
	@OneToMany
	Collection<Concert> concerts = new ArrayList<Concert>();
	
	public Collection<Concert> getConcerts(){
		return concerts;

	}

	
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setLieu(this);
		
	}
	
	public void removeConcert(Concert concert) {
		
	}
	
}
