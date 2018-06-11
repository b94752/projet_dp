package projet_concert.test_admin;

public interface Concert_admin {
	
	public void update(Object object) throws Exception;

	public void supprimer(Concert concert);
	public void ajouter(Concert concert);
	public void modifier(Concert concert);

}
