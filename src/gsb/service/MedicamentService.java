package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentService {

	public static Medicament rechercherMedicament(String depotLegal) {
		Medicament unMedicament = MedicamentDao.rechercher(depotLegal);
		if (!isValidDepotLegal(unMedicament.getDepotLegal())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
        return MedicamentDao.rechercher(depotLegal);
    }
	
	public static int creerMedicament(Medicament medicament) {
        
		if (!isValidDepotLegal(medicament.getDepotLegal())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
	    
        return MedicamentDao.creer(medicament);
    }
	
	
	private static boolean isValidDepotLegal(String depotLegal) {
	    String depotLegalPattern = "[A-Z]{3}\\d{1,7}";
	    return depotLegal.matches(depotLegalPattern);
	}
}
