package Projet.Projet;

public class Developer extends Employee {
		 int salaire, enciente;

		public Developer(String nomEp, String prenomEp, int idEp, int enciente) {
			super(nomEp, prenomEp, idEp);
			this.salaire = 100*enciente+1600;
			this.enciente = enciente;

		}
}