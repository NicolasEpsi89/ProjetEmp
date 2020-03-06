package Projet.Projet;

public class Testeur extends Employee {
	int Nbheure, salaire;

	public Testeur(String nomEp, String prenomEp, int idEp, int Nbheure) {
		super(nomEp, prenomEp, idEp);
		this.Nbheure = Nbheure;
		this.salaire =12*Nbheure+200;
	}
}
