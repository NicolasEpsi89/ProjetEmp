package Projet.Projet;

public class Developer extends Employee {
		 int salaire, Nbprojet;

		public Developer(String nomEp, String prenomEp, int idEp, int Nbprojet) {
			super(nomEp, prenomEp, idEp);
			this.salaire = 100*Nbprojet+1600;
			this.Nbprojet = Nbprojet;

		}
}