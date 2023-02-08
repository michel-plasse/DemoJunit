package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteurTest {

	@Test
	void testConstructeur() {
		// Given
		Compteur instance = new Compteur();
		// When vide : on teste le constructeur
		// Then
		int expected = 0;
		int result = instance.getNiveau();
		assertEquals(expected, result);
	}
	
	@Test
	void testIncrementer() {
		// Given
		Compteur instance = new Compteur();
		// When
		instance.incrementer();
		// Then
		assertEquals(1, instance.getNiveau());
	}
	
	@Test
	void testIncrementer3Fois() {
		// Given
		Compteur instance = new Compteur();
		// When
		instance.incrementer();
		instance.incrementer();
		instance.incrementer();
		// Then
		assertEquals(3, instance.getNiveau());
	}

	@Test
	void testReinitialiser() {
		// Given
		Compteur instance = new Compteur();
		// When
		instance.incrementer();
		instance.incrementer();
		instance.incrementer();
		instance.reinitialiser();
		// Then
		assertEquals(0, instance.getNiveau());
	}
	
}
