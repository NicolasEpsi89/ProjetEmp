package Projet.Projet;

import static org.junit.Assert.assertTrue;

public class TestTesteur {
	public void testtesteur () throws Exception{
		System.out.println("le test testtesteur commence");
		Testeur T1 = new Testeur("Robert", "Jean", 89898, 50, 28, 50);
		assertTrue(T1.calculprime()>0);
	}

}
