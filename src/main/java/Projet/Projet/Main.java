package Projet.Projet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Developer Developer1 = new Developer("Nicolas","cosse","Java","licence DevOps", 1,7 );
			Developer Developer2 = new Developer("desChamp", "Didier", "C++", "Bts SN", 2, 3);
					
			Developer1.PrimeDev();
			Developer1.CalculesalaireD();
			Developer2.PrimeDev();
			Developer2.CalculesalaireD();
			
			System.out.println(Developer1.NomEp+" "+ Developer1.PrenomEp +" "+"a toucher un salaire de :"+ Developer1.salaired );
			System.out.println(Developer2.NomEp+" "+ Developer2.PrenomEp +" a toucher un salaire de :"+ Developer2.salaired );
			
			if(Developer1.salaired < Developer2.salaired) {
				System.out.println(Developer1.NomEp +" " +Developer1.PrenomEp +" "+ "as moin travaillez que :"+" "+Developer2.NomEp+ " "+ Developer2.PrenomEp );
			}
			
			else if(Developer1.salaired > Developer2.salaired) {
				System.out.println(Developer1.NomEp +" " +Developer1.PrenomEp +" " +"as plus travaillez que :"+" "+Developer2.NomEp+ " "+ Developer2.PrenomEp );
			}
			else {
				System.out.println(Developer1.NomEp +" " +Developer1.PrenomEp +" " +"on fais le meme travaille :"+" "+Developer2.NomEp+ " "+ Developer2.PrenomEp );
			}
			
			Testeur T1 = new Testeur("Robert", "Jean", 89898, 50, 28, 50);
			T1.calculprime();
			System.out.println("La prime annuelle du testeur" + T1.NomEp +" = " + T1.getPrimeAnnuelle() + " euro ");
			
			
		}
}

