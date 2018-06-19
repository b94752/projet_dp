package fr.epsi.b3.ConcertProjet.domain;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

<<<<<<< HEAD
@Entity
=======
	@Entity
>>>>>>> 1906 2.0 with interface
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
