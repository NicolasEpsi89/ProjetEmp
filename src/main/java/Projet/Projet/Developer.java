package Projet.Projet;

public class Developer extends Employee
{
		 int salaired, Nbprojet , Prime;
		 String comptetence , diplome ;
		public Developer(String nomEp, String prenomEp,String comptetence,String diplome, int idEp, int Nbprojet) {
			super(nomEp, prenomEp, idEp);
			this.Nbprojet = Nbprojet;
		}
		
		public int PrimeDev() {
			if(Nbprojet < 5 ) {
				Prime = 200;	
			}
			else if(Nbprojet < 10) {
				Prime = 400;
			}
			else{
				Prime = 600;
				
			}
			return Prime;
		}
		
		public int CalculesalaireD() 
		{
			this.salaired = Prime+1800;
			
			return salaired;
		}
		
}