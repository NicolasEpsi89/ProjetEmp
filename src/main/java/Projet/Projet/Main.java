package Projet.Projet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Developer Developer1 = new Developer("Nicolas","cosse", 1,3 );
			Testeur Testeuse1 = new Testeur("Monier", "Cecile", 2, 150);
			int Ds1 = Developer1.salaire;
			int Ts1 = Testeuse1.salaire;
			if(Ts1 < Ds1) {
				System.out.println("");
			}
			else if(Ts1 > Ds1) {
				System.out.println("");
			}
			else {
				System.out.println("");
			}		
	}

}
