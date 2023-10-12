package gsb.tests;

import gsb.modele.Visiteur;

public class AffichageModele {
	
	public static void afficher(Visiteur unVisiteur) {
		System.out.println(unVisiteur.getMatricule());
		System.out.println(unVisiteur.getNom());
		System.out.println(unVisiteur.getPrenom());
		System.out.println("-------------------------------------------");
	}
}
