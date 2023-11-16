package gsb.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
import gsb.modele.dao.*;


public class JIFVisiteurAjouter extends JIFVisiteur implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton ajouter;
	
	public JIFVisiteurAjouter(MenuPrincipal uneFenetreContainer){
		
		ajouter = new JButton("Ajouter");
        pBoutons.add(ajouter);
        
        ajouter.addActionListener(this);
        
        
        
		
	}
	
	 public void actionPerformed(ActionEvent evt) { 
			Object source = evt.getSource();
			if (source == ajouter){
				// Récupérez les valeurs des champs de texte
	            String matricule = JTmatricule.getText();
	            String nom = JTnom.getText();
	            String prenom = JTprenom.getText();
	            String login = JTlogin.getText();
	            String mdp = JTmdp.getText();
	            String adresse = JTadresse.getText();
	            String codePostal = JTcodePostal.getText();
	            String ville = JTville.getText();
	            Date dateEntree = JTdateEntree.getText();
	            int prime =0;
	            if (JTprime.getValue() != null) {
	                prime = (int) ((Number) JTprime.getValue()).doubleValue();
	            }
	            String codeUnite = JTcodeUnite.getText();
	            String nomUnite = JTnomUnite.getText();

	            // Créez un objet Visiteur avec ces valeurs
	            Localite uneloc = new Localite(codePostal, ville);
	            Visiteur visiteur = new Visiteur(matricule, nom, prenom,login,mdp, adresse, uneloc, "", dateEntree, prime, codeUnite, nomUnite);

	            // Appelez la fonction creer de VisiteurDao
	            VisiteurDao.creer(visiteur);

	            // Videz les champs de texte après l'ajout
	            viderText();
			}
	 }
}
