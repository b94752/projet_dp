package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class JouerConcert implements Jouer {
	
Collection<Concert> concerts = new ArrayList<Concert>();
Collection<Groupe> groupes = new ArrayList<Groupe>();
	
	//CONCERTS :
	public Collection<Concert> getConcerts(){
		return concerts;
	}

	@Override
	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setJouerConcert(this);
	}
	
	@Override
	public void removeConcert(Concert concert) {
		concerts.remove(concert);
		concert.setJouerConcert(null);
	}
	
	
	//GROUPES :
	public Collection<Groupe> getGroupes(){
		return groupes;
	}
	
	@Override
	public void addGroupe(Groupe groupe) {
		groupes.add(groupe);
		groupe.setJouerConcert(this);
	}
	
	@Override
	public void removeGroupe(Groupe groupe) {
		groupes.remove(groupe);
		groupe.setJouerConcert(null);
	}

	@Override
	public Collection<Groupe> findByIdJouer(int Id_jouer) {
		// TODO Auto-generated method stub
		return null;
	}

}
