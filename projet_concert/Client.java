package projet_concert;

public class Client {
	
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
	
	public String toStringClientToReserver() {
		return reserver.toStringClientToConcert();
	}
	
	public String toStringClient() {
		return  "Client [concerts=" + reserver.concerts + "]";
	}
}
