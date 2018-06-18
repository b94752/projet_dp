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
	
	@OneToMany
	Collection<Concert> concerts = new ArrayList<Concert>();
	
	public Collection<Concert> getConcerts(){
		return concerts;

	}

	
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setLieu(this);
		
	}
	
}
