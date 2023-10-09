package gsb.modele;

public class Medecin {

	protected String codeMed;
	protected String nom;
	protected String prenom;
	protected String adresse;
	protected String telephone;
	protected String potentiel;
	protected String specialite;
	protected Localite uneLocalite;
	/**
	 * @param codeMed
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param potentiel
	 * @param specialite
	 * @param uneLocalite
	 */
	public Medecin(String codeMed, String nom, String prenom, String adresse, String telephone, String potentiel,
			String specialite, Localite uneLocalite) {
		this.codeMed = codeMed;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.potentiel = potentiel;
		this.specialite = specialite;
		this.uneLocalite = uneLocalite;
	}
	/**
	 * @return the codeMed
	 */
	public String getCodeMed() {
		return codeMed;
	}
	/**
	 * @param codeMed the codeMed to set
	 */
	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the potentiel
	 */
	public String getPotentiel() {
		return potentiel;
	}
	/**
	 * @param potentiel the potentiel to set
	 */
	public void setPotentiel(String potentiel) {
		this.potentiel = potentiel;
	}
	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	/**
	 * @return the uneLocalite
	 */
	public Localite getUneLocalite() {
		return uneLocalite;
	}
	/**
	 * @param uneLocalite the uneLocalite to set
	 */
	public void setUneLocalite(Localite uneLocalite) {
		this.uneLocalite = uneLocalite;
	}
	
	
}
