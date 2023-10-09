package gsb.vue;

import javax.swing.*;
import java.awt.*;

public class JIFVisiteurAjouter extends JInternalFrame {
	
	private JLabel matriculeLabel = new JLabel("Matricule:");
    private JTextField matriculeTextField = new JTextField(10);

    private JLabel nomLabel = new JLabel("Nom:");
    private JTextField nomTextField = new JTextField(10);

    private JLabel prenomLabel = new JLabel("Prénom:");
    private JTextField prenomTextField = new JTextField(10);

    private JLabel loginLabel = new JLabel("Login:");
    private JTextField loginTextField = new JTextField(10);

    private JLabel motDePasseLabel = new JLabel("Mot de passe:");
    private JPasswordField motDePassePasswordField = new JPasswordField(10);

    private JLabel telephoneLabel = new JLabel("Téléphone:");
    private JTextField telephoneTextField = new JTextField(10);

    private JLabel adresseLabel = new JLabel("Adresse:");
    private JTextField adresseTextField = new JTextField(10);

    private JLabel dateEntreeLabel = new JLabel("Date d'entrée:");
    private JTextField dateEntreeTextField = new JTextField(10);

    private JLabel primeLabel = new JLabel("Prime:");
    private JTextField primeTextField = new JTextField(10);

    private JLabel codeUniteLabel = new JLabel("Code Unité:");
    private JTextField codeUniteTextField = new JTextField(10);

    private JLabel nomUniteLabel = new JLabel("Nom Unité:");
    private JTextField nomUniteTextField = new JTextField(10);

    private JButton ajouterButton = new JButton("Ajouter");

    public JIFVisiteurAjouter() {
        setTitle("Formulaire d'ajout d'employé");
        setSize(400, 400);
        setLayout(new GridLayout(12, 2));

        add(matriculeLabel);
        add(matriculeTextField);

        add(nomLabel);
        add(nomTextField);

        add(prenomLabel);
        add(prenomTextField);

        add(loginLabel);
        add(loginTextField);

        add(motDePasseLabel);
        add(motDePassePasswordField);

        add(telephoneLabel);
        add(telephoneTextField);

        add(adresseLabel);
        add(adresseTextField);

        add(dateEntreeLabel);
        add(dateEntreeTextField);

        add(primeLabel);
        add(primeTextField);

        add(codeUniteLabel);
        add(codeUniteTextField);

        add(nomUniteLabel);
        add(nomUniteTextField);

        add(new JLabel()); // espace vide
        add(ajouterButton);

        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
    }
}
