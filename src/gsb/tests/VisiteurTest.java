package gsb.tests;


import java.util.ArrayList;

import gsb.modele.*;
import gsb.modele.dao.*;

public class VisiteurTest {
	public static void main(String[] args) {
		ArrayList<Visiteur> lesVisiteurs = VisiteurDao.rechercherTout();
		for(Visiteur unVisiteur : lesVisiteurs) {
			AffichageModele.afficher(unVisiteur);
		}
		
		

}
}
