package Projet.Projet;

import static org.junit.Assert.assertTrue;

public class TestDeveloper{
	public void testdev () throws Exception{
		System.out.println("le test testdev commence");
		Developer Developer1 = new Developer("Nicolas","cosse","Java","licence DevOps", 1,7 );
		assertTrue(Developer1.PrimeDev()>0);
		assertTrue(Developer1.CalculesalaireD()>1800);
	}

}
