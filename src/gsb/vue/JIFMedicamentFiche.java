package gsb.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class JIFMedicamentFiche extends JIFMedicament implements ActionListener{

		private static final long serialVersionUID = 1L;
		private JButton modifier;

		public JIFMedicamentFiche(Medicament unMedicament) {
			super();
			this.remplirText(unMedicament);
			
			modifier = new JButton("Modifier");
	        pBoutons.add(modifier);
	        
	        modifier.addActionListener(this);

		}
		
		public void actionPerformed(ActionEvent evt) { 
			
		
			Object source = evt.getSource();
			if (source == modifier){
				
				String depot = JTdepot.getText();
	            String nom = JTnom.getText();
	            String composition = JTcomposition.getText();
	            String effets = JTeffets.getText();
	            String contre = JTcontre.getText();
	            String prixString = JTprix.getText();
	            String code = JTcode.getText();
	            String libelle = JTlibelle.getText();
	            Double prix = null;

	            try {
	                prix = Double.parseDouble(prixString);
	            } catch (NumberFormatException e) {
	                e.printStackTrace();
	                // Handle the exception as needed (show an error message, log, etc.)
	            }
	            
	            
	            Medicament Medicament = new Medicament(depot, nom,composition,effets,contre, prix, code, libelle);
	            int result = MedicamentDao.modifier(depot,Medicament);
	            
	            if (result != 0) {
	                JOptionPane.showMessageDialog(this, "Medicament modifié avec succès !");
	            } else {
	                JOptionPane.showMessageDialog(this, "Échec lors de la modification du médicament");
	            }
	            // Videz les champs de texte après l'ajout
	            
				
			}
		}
		

	}
