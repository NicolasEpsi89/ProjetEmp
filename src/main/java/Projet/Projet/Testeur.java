package Projet.Projet;

public class Testeur extends Employee {
<<<<<<< HEAD
	int Nbheure, salaire, nbProjetTest;
	
=======
	int Nbheure, salaireT;
>>>>>>> fbccda24d0563fd149b57038f9368e479e033e9f

	public Testeur(String nomEp, String prenomEp, int idEp, int Nbheure, int nbprojetTest ) {
		super(nomEp, prenomEp, idEp);
		this.Nbheure = Nbheure;
<<<<<<< HEAD
		this.nbProjetTest = nbprojetTest;
		this.salaire =12 * Nbheure+200;
	}
	
	public void primeParProjetTest (int nbprojetTest) {
		
=======
		this.salaireT =12*Nbheure+200;
>>>>>>> fbccda24d0563fd149b57038f9368e479e033e9f
	}
}
