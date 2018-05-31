package projet_concert;

import java.util.ArrayList;
import java.util.Collection;

public class Concert {
	
Lieu lieu;
Collection<Client> clients = new ArrayList<Client>();
Collection<Groupe> groupes = new ArrayList<Groupe>();
	
	public Lieu getLieu() {
		return lieu;
	}
	
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public void addClient(Client client) {
		clients.add(client);
		
	}
	
	@Override
	public String toString() {
		return "Client [clients=" + clients + "]";
	}
	
	public void addGroupe(Groupe groupe) {
		groupes.add(groupe);
		
	}
	

}
