package gsb.vue;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JIFMedicamentAjout extends JIFMedicament implements ActionListener {

    private static final long serialVersionUID = 1L;
	private JButton ajouter;
    private JButton annuler;

    public JIFMedicamentAjout(MenuPrincipal uneFenetreContainer) {
        super();

        ajouter = new JButton("Ajouter");
        pBoutons.add(ajouter);
        ajouter.addActionListener(this);

        annuler = new JButton("Annuler");
        pBoutons.add(annuler);
        annuler.addActionListener(this);

        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Ajout Médicament");
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();

        if (source == ajouter) {
            Medicament newMedicament = new Medicament(
                    JTdepot.getText(),
                    JTnom.getText(),
                    JTcomposition.getText(),
                    JTeffets.getText(),
                    JTcontre.getText(),
                    Double.parseDouble(JTprix.getText()),
                    JTcode.getText(),
                    JTlibelle.getText()
            );

            int result = MedicamentDao.creer(newMedicament);

            if (result != 0) {
                JOptionPane.showMessageDialog(this, "Médicament ajouté avec succès !");
                viderText();
            } else {
                JOptionPane.showMessageDialog(this, "Échec lors de l'ajout du médicament");
            }
        } else if (source == annuler) {
            viderText();
        }
    }

    
    
}
