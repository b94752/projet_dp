package fr.epsi.b3.ConcertProjet.application;

import java.util.Collection;

import fr.epsi.b3.ConcertProjet.domain.Concert;
import fr.epsi.b3.ConcertProjet.domain.Groupe;


public interface Jouer {
	
	//CONCERTS : 
	public void addConcert(Concert concert);
	public void removeConcert(Concert concert);
	
	//GROUPES : 
	public void addGroupe(Groupe groupe);
	public void removeGroupe(Groupe groupe);
	
	public Collection<Groupe> findByIdJouer (int Id_jouer);
	

	
	

}
