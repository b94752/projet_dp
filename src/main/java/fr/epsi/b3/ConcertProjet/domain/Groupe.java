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


	public void addGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}


	public void removeGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		
	}

	public Collection<Groupe> findByIdJouer(int Id_jouer) {
		// TODO Auto-generated method stub
		return null;
	}


}
