package gsb.vue;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import gsb.modele.Visiteur;

public class JIFVisiteur extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	
	protected JLabel JLmatricule;
	protected JLabel JLnom;
	protected JLabel JLprenom;
	protected JLabel JLlogin;
	protected JLabel JLmdp;
	protected JLabel JLadresse;
	protected JLabel JLcodePostal;
	protected JLabel JLville;
	protected JLabel JLdateEntree;
	protected JLabel JLprime;
	protected JLabel JLcodeUnite;
	protected JLabel JLnomUnite;
	
	protected JTextField JTmatricule;
	protected JTextField JTnom;
	protected JTextField JTprenom;
	protected JTextField JTlogin;
	protected JTextField JTmdp;
	protected JTextField JTadresse;
	protected JTextField JTcodePostal;
	protected JTextField JTville;
	protected JTextField JTdateEntree;
	protected JFormattedTextField JTprime;
	protected JTextField JTcodeUnite;
	protected JTextField JTnomUnite;
	
	protected SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public JIFVisiteur() {
		p = new JPanel();  // panneau principal de la fen�tre
		pBoutons = new JPanel();    // panneau supportant les boutons
        pBoutons.setBackground(Color.blue);
		pTexte = new JPanel(new GridLayout(12,2));
        pTexte.setBackground(Color.red);
        
        JLmatricule = new JLabel("Matricule");
        JLnom = new JLabel("Nom");
        JLprenom = new JLabel("Prénom");
        JLlogin = new JLabel("Identitifiant");
        JLmdp = new JLabel("Mot de Passe");
        JLadresse = new JLabel("Adresse");
        JLcodePostal = new JLabel("Code Postal");
        JLville = new JLabel("Ville");
        JLdateEntree = new JLabel("Date d'entrée");
        JLprime = new JLabel("prime");
        JLcodeUnite = new JLabel("Code Unité");
        JLnomUnite = new JLabel("Nom Unité");
        
        JTmatricule = new JTextField(20);
        JTmatricule.setMaximumSize(JTmatricule.getPreferredSize());
        JTnom = new JTextField();
        JTprenom = new JTextField();
        JTlogin = new JTextField();
        JTmdp = new JTextField();
        JTadresse = new JTextField();
        JTcodePostal = new JTextField();
        JTville = new JTextField();
        JTdateEntree = new JTextField();
        JTprime = new JFormattedTextField();
        JTcodeUnite = new JTextField();
        JTnomUnite = new JTextField();
        
        pTexte.add(JLmatricule);
        pTexte.add(JTmatricule);
        pTexte.add(JLnom);
        pTexte.add(JTnom);
        pTexte.add(JLprenom);
        pTexte.add(JTprenom);
        pTexte.add(JLlogin);
        pTexte.add(JTlogin);
        pTexte.add(JLmdp);
        pTexte.add(JTmdp);
        pTexte.add(JLadresse);
        pTexte.add(JTadresse);
        pTexte.add(JLcodePostal);
        pTexte.add(JTcodePostal);
        pTexte.add(JLville);
        pTexte.add(JTville);
        pTexte.add(JLdateEntree);
        pTexte.add(JTdateEntree);
        pTexte.add(JLprime);
        pTexte.add(JTprime);
        pTexte.add(JLcodeUnite);
        pTexte.add(JTcodeUnite);
        pTexte.add(JLnomUnite);
        pTexte.add(JTnomUnite);
        
        p.add(pTexte);
        p.add(pBoutons);
        Container contentPane = getContentPane();
        contentPane.add(p);
	}
        
        public void remplirText(Visiteur unVisiteur)
        
        {  // m�thode qui permet de remplir les zones de texte � partir des valeurs pass�es en param�tres
        	JTmatricule.setText(unVisiteur.getMatricule());        
            JTnom.setText(unVisiteur.getNom());
            JTprenom.setText(unVisiteur.getPrenom());
            JTadresse.setText(unVisiteur.getAdresse());
            JTcodePostal.setText(unVisiteur.getUneLocalite().getCodePostal());
            JTville.setText(unVisiteur.getUneLocalite().getVille());
            JTdateEntree.setText(dateFormatter.format(unVisiteur.getDateEntree()));
            JTprime.setValue(unVisiteur.getPrime());
            JTcodeUnite.setText(unVisiteur.getCodeUnite());
            JTnomUnite.setText(unVisiteur.getNomUnite());
         
        }
        

		public void viderText() {
        	JTmatricule.setText("");        
            JTnom.setText("");
            JTprenom.setText("");
            JTadresse.setText("");
            JTcodePostal.setText("");
            JTville.setText("");
            JTdateEntree.setText("");
            JTprime.setText("");
            JTcodeUnite.setText("");
            JTnomUnite.setText("");
        }

}
