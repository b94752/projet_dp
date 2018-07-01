package fr.epsi.b3.ConcertProjet.application;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import fr.epsi.b3.ConcertProjet.domain.Client;
import fr.epsi.b3.ConcertProjet.domain.ClientRepository;

public class InscriptionClient implements Inscription
{
	private ClientRepository clientrepo;

	public InscriptionClient(ClientRepository clientrepo) 
	{
		super();
		this.clientrepo = clientrepo;
	}



	@Override
	public void Inscription() {
		// pas de scanner ici a mettre dans le main de java
		Scanner sc = new Scanner(System.in);
		Client client = new Client();
		
		System.out.println("votre nom : ");
		client.setNom(sc.nextLine());
		
		System.out.println("votre prenom");
		client.setPrenom(sc.nextLine());
		
		System.out.println("votre annee de naissance");
		String annee = sc.nextLine();
		System.out.println("votre mois de naissance");
		String mois = sc.nextLine();
		System.out.println("votre jour de naissance");
		String jour = sc.nextLine();
		Integer.parseInt(annee);
		Integer.parseInt(mois);
		Integer.parseInt(jour);
		
		
	    String target = jour+mois+annee;
	    DateFormat df = new SimpleDateFormat("dd MMM yyyy");
	    Date result;
		try {
			result = (Date) df.parse(target);
			System.out.println(result);
			client.setDdn(result);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		clientrepo.save(client);
	}
	


}
