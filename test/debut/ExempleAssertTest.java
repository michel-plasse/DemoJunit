package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExempleAssertTest {

	@Test
	void testConstructeur() {
		// exemple de assert avec message
		double poids = -10;
		assert poids >= 0 : "Le poids doit être positif. Reçu " + poids;
	}

	@Test
	void test1() {
		System.out.println("test1");
	}

	@Test
	void testDev1() {
		System.out.println("dev1");
	}

	@Test
	void test2() {
		System.out.println("test2");
	}

	@Test
	void testDev2() {
		System.out.println("dev2");
	}
}
