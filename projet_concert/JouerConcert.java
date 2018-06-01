package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class JouerConcert {
	
Collection<Concert> concerts = new ArrayList<Concert>();
Collection<Groupe> groupes = new ArrayList<Groupe>();
	
	//CONCERTS :
	public Collection<Concert> getConcerts(){
		return concerts;
	}

	public void addConcert(Concert concert) {
		concerts.add(concert);
		concert.setJouerConcert(this);
	}
	
	public void removeConcert(Concert concert) {
		concerts.remove(concert);
		concert.setJouerConcert(null);
	}
	
	
	//GROUPES :
	public Collection<Groupe> getGroupes(){
		return groupes;
	}
	
	public void addGroupe(Groupe groupe) {
		groupes.add(groupe);
		groupe.setJouerConcert(this);
	}
	
	public void removeGroupe(Groupe groupe) {
		groupes.remove(groupe);
		groupe.setJouerConcert(null);
	}

	public String toStringConcertToGroupe() {
		return groupes.toStringConcert();
	}

	public String toStringGroupeToConcert() {
		return concerts.toStringGroupe();
	}
}
