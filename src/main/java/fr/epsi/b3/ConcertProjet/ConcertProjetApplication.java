package fr.epsi.b3.ConcertProjet; 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.epsi.b3.ConcertProjet.domain.Client;
import fr.epsi.b3.ConcertProjet.domain.ClientRepository;
import fr.epsi.b3.ConcertProjet.domain.Reservation;

@SpringBootApplication
public class ConcertProjetApplication {

	@Autowired
	ClientRepository clientrepo;
	
private static final Logger log = LoggerFactory.getLogger(ConcertProjetApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConcertProjetApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(ClientRepository repository) {
		return (args) -> {
			
			Client client = new Client();
			
			Reservation reservation = new Reservation();
			client.getConcerts().add(reservation);
			reservation.setClient(client);
			
			clientrepo.save(client);
			for(Client c:clientrepo.findAll() )
			{
			System.out.println(c);
			}
			/*
			Conduire c = new ConduireTaxi(voitureRepository, passagerRepository);
			c.addPassager("tintin");
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date miseEnCirculation = df.parse("30/05/2018");
			
			Voiture voiture = new Voiture(miseEnCirculation, "11AA22");
			
			Passager passager = new Passager("Tintin", 50);
			voiture.addPassager(passager);
			
			repository.save(voiture);
			
			repository.findById("11AA22")
			.ifPresent(voit -> {
				log.info("Voiture found with findById(11AA22):");
				log.info("--------------------------------");
				log.info(voit.toString());
				log.info("");
			});*/
		};
	}
	
}
