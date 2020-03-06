package Projet.Projet;

public class Testeur extends Employee {
	int Nbheure, salaireT, nbProjetTest, primeParProjet, primeAnnuelle ;

	
	public Testeur(String nomEp, String prenomEp, int idEp, int Nbheure, int nbprojetTest, int primeParProjet) {
		super(nomEp, prenomEp, idEp);
		this.Nbheure = Nbheure;
		this.nbProjetTest = nbprojetTest;
		this.primeParProjet = primeParProjet;
		this.salaireT = 12*Nbheure+200;
	}
	
	public int calculprime() {
	
		this.primeAnnuelle = this.nbProjetTest * primeParProjet ;  
		return(primeAnnuelle);
	}
	
	/**
	 * @return the primeAnnuelle
	 */
	public int getPrimeAnnuelle() {
		
		return primeAnnuelle;
	}
	
}
