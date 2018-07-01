package fr.epsi.b3.ConcertProjet.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class JouerConcert {
	@Id
	int Id_JouerConcert;
	
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
