package gsb.service;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

class VisiteurDaoTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public final static void testRechercherReussi() {
		assertNotNull(VisiteurDao.rechercher("a17"));
	}
	
	@Test
	public final static void testRechercherEchoue() {
		assertNull(VisiteurDao.rechercher("null"));
	}
	
	@Test
	public final static void testCreerReussi() {
		Localite uneLocalite = new Localite("cp", "ville");
		Date date = new Date();
		Visiteur unVisiteur = new Visiteur("matricule", "nom", "prenom", "login", "mdp", "adresse", uneLocalite, "telephone", date, 0, "codeUnite", "nomUnite");
		assertEquals(1, VisiteurDao.creer(unVisiteur));
	}
	
	@Test
	public final static void testCreerEchoue() {
		assertEquals(0, VisiteurDao.creer(VisiteurDao.rechercher("a17")));
	}
	
	

	

}
