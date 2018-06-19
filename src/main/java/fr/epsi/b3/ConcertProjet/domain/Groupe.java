package fr.epsi.b3.ConcertProjet.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Groupe{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String nomGroupe;
	String genre;
	Date dateCreation;
	String description;
	@OneToMany 
	Collection<JouerConcert> jouer_s = new ArrayList<JouerConcert>();

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomGroupe() {
		return nomGroupe;
	}


	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Collection<JouerConcert> getJouer_s() {
		return jouer_s;
	}


	public void setJouer_s(Collection<JouerConcert> jouer_s) {
		this.jouer_s = jouer_s;
	}


	public void addGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}


	public void removeGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}
	
	public void addConcert(Concert concert) {
		
		JouerConcert jouerConcert = new JouerConcert();
		
		jouer_s.add(jouerConcert);
		jouerConcert.setGroupe(this);
	
		concert.groupesConcert.add(jouerConcert);
		jouerConcert.setConcert(concert);
	}
	
	public void removeConcert(Concert concert) {
		// TODO Auto-generated method stub
		
	}



}
