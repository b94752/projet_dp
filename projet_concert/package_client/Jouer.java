package projet_concert;

import java.util.Collection;

public interface Jouer {
	
	//CONCERTS : 
	public void addConcert(Concert concert);
	public void removeConcert(Concert concert);
	
	//GROUPES : 
	public void addGroupe(Groupe groupe);
	public void removeGroupe(Groupe groupe);
	
	public Collection<Groupe> findByIdJouer (int Id_jouer);
	

	
	

}
