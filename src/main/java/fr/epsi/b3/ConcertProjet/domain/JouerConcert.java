package fr.epsi.b3.ConcertProjet.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ManyToOne;


	public class JouerConcert {
	@ManyToOne	
	Concert concert;
	@ManyToOne
	Groupe groupe;
	
	
		public Concert getConcert() {
			return concert;
		}
		public void setConcert(Concert concert) {
			this.concert = concert;
		}
		public Groupe getGroupe() {
			return groupe;
		}
		public void setGroupe(Groupe groupe) {
			this.groupe = groupe;
		}
	


	

}
