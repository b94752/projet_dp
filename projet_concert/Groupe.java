package projet_concert;

public class Groupe {

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

	
	public String toStringGroupeToJouer() {
		return jouer.toStringGroupeToConcert();
	}
	
	public String toStringConcert() {
		return  "Groupe [concerts=" + jouer.concerts + "]";
	}
}
