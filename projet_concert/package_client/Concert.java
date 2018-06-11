package projet_concert;

public class Concert {
	
	String nomConcert;
	
	
	Lieu lieu = new Lieu();
	ReserverConcert reserver = new ReserverConcert();
	JouerConcert jouer = new JouerConcert();

	//LIEU : 
	public Lieu getLieu() {
		return lieu;
	}
	
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}	
	
	
	//RESERVER_CLIENT :
	public ReserverConcert getReserverConcert() {
		return reserver;
	}
	
	public void setReserverConcert(ReserverConcert reserver) {
		this.reserver = reserver;
	}
	
	public void addClient(Client client) {
		reserver.addConcert(this);
		reserver.addClient(client);
	}

	
	public String toStringConcert() {
		return  "Concert [clients=" + reserver.clients + "]";
	}
	
	//JOUER_GROUPE : 
	public JouerConcert getJouer() {
		return jouer;
	}
	
	public void setJouerConcert(JouerConcert jouer) {
		this.jouer = jouer;
	}
	
	public void addGroupe(Groupe groupe) {
		jouer.addConcert(this);
		jouer.addGroupe(groupe);
	}
	

	
	public String toStringGroupe() {
		return  "Concert [groupes=" + jouer.groupes + "]";
	}




	

	


}
