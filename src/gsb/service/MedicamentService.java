package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentService {

	/**
	 * Recherche un médicament dans la base de données par son dépôt légal.
	 * 
	 * @param depotLegal Le dépôt légal du médicament à rechercher.
	 * @return Une instance de la classe Medicament correspondant au médicament trouvé.
	 * @throws IllegalArgumentException Si le dépôt légal du médicament est invalide.
	 */
	
	public static Medicament rechercherMedicament(String depotLegal) {
		Medicament unMedicament = MedicamentDao.rechercher(depotLegal);
		if (!isValidDepotLegal(unMedicament.getDepotLegal())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
        return MedicamentDao.rechercher(depotLegal);
    }
	
	/**
	 * Crée un nouveau médicament dans la base de données.
	 * 
	 * @param medicament Un objet Medicament contenant les informations du nouveau médicament.
	 * @return Le nombre de lignes affectées dans la base de données.
	 * @throws IllegalArgumentException Si le dépôt légal du médicament est invalide.
	 */
	
	public static int creerMedicament(Medicament medicament) {
        
		if (!isValidDepotLegal(medicament.getDepotLegal())) {
	        throw new IllegalArgumentException("Matricule invalide");
	    }
	    
        return MedicamentDao.creer(medicament);
    }
	
	
	/**
	 * Vérifie la validité du dépôt légal du médicament en utilisant une expression régulière.
	 * 
	 * @param depotLegal Le dépôt légal du médicament à vérifier.
	 * @return true si le dépôt légal du médicament est valide, sinon false.
	 */
	
	private static boolean isValidDepotLegal(String depotLegal) {
	    String depotLegalPattern = "[A-Z]{3}\\d{1,7}";
	    return depotLegal.matches(depotLegalPattern);
	}
}
