package gsb.service;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

public class MedecinService {

	
	
	public static Medecin rechercherMedecin(String codeMed) {
		Medecin unMedecin = MedecinDao.rechercher(codeMed);
		if (!isValidCodeMed(unMedecin.getCodeMed())) {
	        throw new IllegalArgumentException("Code Medecin invalide");
	    }
        return MedecinDao.rechercher(codeMed);
    }
	
	public static int creerMedecin(Medecin medecin) {
        
		if (!isValidTelephone(medecin.getTelephone())) {
	        throw new IllegalArgumentException("Numéro de téléphone invalide");
	    }
	    if (!isValidCodeMed(medecin.getCodeMed())) {
	        throw new IllegalArgumentException("Code Medecin invalide");
	    }
	    if (!isValidCp(medecin.getUneLocalite().getCodePostal())) {
	        throw new IllegalArgumentException("Code postal invalide");
	    }
	    
        return MedecinDao.creer(medecin);
    }
	
	private static boolean isValidCodeMed(String codeMed) {
		String codeMedPattern = "[a-z]\\d{3}";
	    return codeMed.matches(codeMedPattern);
	}
	
	private static boolean isValidCp(String cp) {
		String cpPattern = "\\d{5}";
	    return cp.matches(cpPattern);
	}
	
	private static boolean isValidTelephone(String telephone) {
	    String phoneNumberPattern = "\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}";
	    return telephone.matches(phoneNumberPattern);
	}
	
}
