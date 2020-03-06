package Projet.Projet;

public class Testeur extends Employee {
	int Nbheure, salaire, nbProjetTest;
	

	public Testeur(String nomEp, String prenomEp, int idEp, int Nbheure, int nbprojetTest ) {
		super(nomEp, prenomEp, idEp);
		this.Nbheure = Nbheure;
		this.nbProjetTest = nbprojetTest;
		this.salaire =12 * Nbheure+200;
	}
	
	public void primeParProjetTest (int nbprojetTest) {
		
	}
}
