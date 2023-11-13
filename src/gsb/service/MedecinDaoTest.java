package gsb.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gsb.modele.*;
import gsb.modele.dao.*;

class MedecinDaoTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final static void testRechercherReussi() {
		assertNotNull(MedecinDao.rechercher("m001"));
	}
	
	@Test
	public final static void testRechercherEchoue() {
		assertNull(MedecinDao.rechercher("m000"));
	}

	@Test
	public final static void testCreeReussi(){
		Localite uneLoc = new Localite("cp", "ville");
		Medecin unMed = new Medecin("code","nom","prenom","adresse",uneLoc,"telephone","potentiel","specialite");
		assertEquals(1,MedecinDao.creer(unMed));
	}
	
	public final static void testCreeEchoue() {
		assertEquals(0,MedecinDao.creer(MedecinDao.rechercher("m001")));
	}

}
