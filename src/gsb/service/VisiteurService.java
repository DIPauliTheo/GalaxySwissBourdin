package gsb.service;


import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

public class VisiteurService {

	public static void ajouterVisiteur(Visiteur unVisiteur) {
		VisiteurDao.creer(unVisiteur);
	}
}
