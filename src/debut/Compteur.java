package debut;

public class Compteur {
	private int niveau;

	public int getNiveau() {
		return niveau;
	}

	public void incrementer() {
		niveau++;
	}

	public void reinitialiser() {
		niveau = 0;
	}

}
