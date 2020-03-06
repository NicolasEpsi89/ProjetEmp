package Projet.Projet;

public class Testeur extends Employee {
	int Nbheure, salaireT;

	public Testeur(String nomEp, String prenomEp, int idEp, int Nbheure) {
		super(nomEp, prenomEp, idEp);
		this.Nbheure = Nbheure;
		this.salaireT =12*Nbheure+200;
	}
}
