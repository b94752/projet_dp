package fr.epsi.b3.ConcertProjet.domain;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long>{
	
	Client findByNom(String nom);
	Client findByPrenom(String prenom);
	
	
}
