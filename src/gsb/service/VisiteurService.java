package gsb.service;

import gsb.modele.dao.VisiteurDao;
import gsb.modele.Visiteur;

public class VisiteurService {

	
	
	
	public static Visiteur rechercherVisiteur(String matricule) {
		Visiteur unVisiteur = VisiteurDao.rechercher(matricule);
		if (!isValidMatricule(unVisiteur.getMatricule())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
        return VisiteurDao.rechercher(matricule);
    }
	
	public static int creerVisiteur(Visiteur visiteur) {
        
		if (!isValidTelephone(visiteur.getTelephone())) {
	        throw new IllegalArgumentException("Numéro de téléphone invalide");
	    }
	    if (!isValidMatricule(visiteur.getMatricule())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
	    if (!isValidCp(visiteur.getUneLocalite().getCodePostal())) {
	        throw new IllegalArgumentException("Code postal invalide");
	    }
	    if (!isValidCodeUnit(visiteur.getCodeUnite())) {
	        throw new IllegalArgumentException("Code unité invalide");
	    }
	    
        return VisiteurDao.creer(visiteur);
    }
	
	public static int modifierVisiteur(String matricule, Visiteur visiteur) {
        
		if (!isValidTelephone(visiteur.getTelephone())) {
	        throw new IllegalArgumentException("Numéro de téléphone invalide");
	    }
	    if (!isValidMatricule(visiteur.getMatricule())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
	    if (!isValidCp(visiteur.getUneLocalite().getCodePostal())) {
	        throw new IllegalArgumentException("Code postal invalide");
	    }
	    if (!isValidCodeUnit(visiteur.getCodeUnite())) {
	        throw new IllegalArgumentException("Code unité invalide");
	    }
	    
        return VisiteurDao.modifier(matricule,visiteur);
    }
	
	
	private static boolean isValidTelephone(String telephone) {
	    String phoneNumberPattern = "\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}";
	    return telephone.matches(phoneNumberPattern);
	}
	
	private static boolean isValidMatricule(String matriule) {
		String matriculePattern = "[a-z]\\d{2,3}";
	    return matriule.matches(matriculePattern);
	}
	
	private static boolean isValidCp(String cp) {
		String cpPattern = "\\d{5}";
	    return cp.matches(cpPattern);
	}
	
	private static boolean isValidCodeUnit(String codeUnit) {
		String codeUnitPattern = "[A-Z]{2,4}";
	    return codeUnit.matches(codeUnitPattern);
	}
}
