package projet_concert;

import java.sql.Date;

@Entity
public class Client {
	
	String nom;
	String prenom;
	Date ddn;
	float solde;
	
	
ReserverConcert reserver = new ReserverConcert();

	//RESERVER_CLIENT :
	public ReserverConcert getReserverConcert() {
		return reserver;
	}
	
	public void setReserverConcert(ReserverConcert reserver) {
		this.reserver = reserver;
	}
	
	public void addConcert(Concert concert) {
		reserver.addClient(this);
		reserver.addConcert(concert);
	}
	
	
	public String toStringClient() {
		return  "Client [concerts=" + reserver.concerts + "]";
	}
}
