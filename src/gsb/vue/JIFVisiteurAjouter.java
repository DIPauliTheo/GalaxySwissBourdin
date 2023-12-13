package gsb.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
import gsb.modele.dao.*;
import gsb.service.VisiteurService;


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
	            String dateEntreeString = JTdateEntree.getText();
	            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
	            Date dateEntree = null;

	            try {
	                dateEntree = dateFormat.parse(dateEntreeString);
	            } catch (ParseException e) {
	                e.printStackTrace();
	                // Handle the exception as needed (show an error message, log, etc.)
	            }
	            
	            java.sql.Date sqlDate = new java.sql.Date(dateEntree.getTime());
	            
	            int prime =0;
	            if (JTprime.getValue() != null) {
	                prime = (int) ((Number) JTprime.getValue()).doubleValue();
	            }
	            String codeUnite = JTcodeUnite.getText();
	            String nomUnite = JTnomUnite.getText();

	            // Créez un objet Visiteur avec ces valeurs
	            Localite uneLoc = null;
	            if (LocaliteDao.rechercher(codePostal) == null) {
	            	uneLoc = new Localite(codePostal, ville);
	            }
	            else {
	            	uneLoc = LocaliteDao.rechercher(codePostal);
	            }
	            Visiteur visiteur = new Visiteur(matricule, nom, prenom,login,mdp, adresse, uneLoc, "", sqlDate, prime, codeUnite, nomUnite);

	            // Appelez la fonction creer de VisiteurDao
	            int result = VisiteurService.creerVisiteur(visiteur);

	            if (result != 0) {
	                JOptionPane.showMessageDialog(this, "Visiteur ajouté avec succès !");
	            } else {
	                JOptionPane.showMessageDialog(this, "Échec lors de l'ajout du visiteur");
	            }
	            // Videz les champs de texte après l'ajout
	            viderText();
			}
	 }
}
