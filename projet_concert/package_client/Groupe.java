package projet_concert;

import java.sql.Date;

public class Groupe {
	
	String nomGroupe;
	String genre;
	Date dateCreation;
	String description;

JouerConcert jouer = new JouerConcert();

	
	public JouerConcert getJouer() {
		return jouer;
	}
	
	public void setJouerConcert(JouerConcert jouer) {
		this.jouer = jouer;
	}	
	
	public void addConcert(Concert concert) {
		jouer.addGroupe(this);
		jouer.addConcert(concert);
	}

	
	public String toStringConcert() {
		return  "Groupe [concerts=" + jouer.concerts + "]";
	}
}
