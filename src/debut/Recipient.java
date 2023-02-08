package debut;

public class Recipient {

	private int espaceLibre, quantite;
	
	/**
	 * Initialise un récipient de quantité quantite et de capacité capacite.
	 * <br>Requiert quantite >= 0; quantite &lt;= capacite; 
	 * @param quantite quantité. Doit être >= 0
	 * @param capacite capacité. Doit être >= quantite
	 */
	public Recipient(int quantite, int capacite) {
		this.espaceLibre = capacite - quantite;
		this.quantite = quantite;
	}

	/**
	 * Nombre d'éléments dans le récipient.
	 * <br>est >= 0; est &lt;< getCapacite()
	 * @return
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * Nombre maximal d'éléments que peut contenir le récipient
	 * <br>est >= getQuantite()
	 * @return
	 */
	public int getCapacite() {
		return quantite + espaceLibre;
	}

	/**
	 * Nombre d'emplacements pas occupés dans le récipient
	 * (capacité - quantité)
	 * @return
	 */
	public int getEspaceLibre() {
		return espaceLibre;
	}
	
	public boolean isPlein() {
		return espaceLibre == 0;
	}

	public boolean isVide() {
		return quantite == 0;
	}

	/**
	 * Déplace un élément du récipient dans autre.
	 * <br>Requiert !isVide(); !autre.isPlein()
	 * <br>Garantit getQuantite() == old getQuantite() -1;
	 * autre.getQuantite() == old autre.getQuantite() + 1
	 * @param autre récipient cible
	 */
	public void mettreUnDans(Recipient autre) {
		quantite--;
		autre.quantite++;
		espaceLibre++;
		autre.espaceLibre--;
	}

	/** Remplit autre.
	 * <br>Requiert getQuantite() >= autre.getEspaceLibre()
	 * <br>Garantit autre.isPlein(); 
	 * getQuantite() == old getQuantite() - old autre.getEspaceLibre(); 
	 * @param autre
	 */
	public void remplir(Recipient autre) {
		quantite -= autre.espaceLibre;
		espaceLibre += autre.espaceLibre;
		autre.quantite += autre.espaceLibre;
		autre.espaceLibre = 0;
	}

	/**
	 * Vider dans autre
	 * <br>Requiert getQuantite() &lt;= autre.getEspaceLibre()
	 * <br>Garantit isVide();
	 * autre.getQuantite() == old autre.getQuantite() + old espaceLibre()
	 * @param autre
	 */
	public void viderDans(Recipient autre) {
		autre.quantite += quantite;
		autre.espaceLibre -= quantite;
		espaceLibre += quantite;
		quantite = 0;
	}

	/** Ce qui doit être vérifié à tout moment par l'instanc est-il ok ?
	 *  
	 * @return
	 */
	public boolean isInvariantOk() {
		assert getCapacite() == getQuantite() + getEspaceLibre();
		assert isPlein() == (getQuantite() == getCapacite());
		assert isVide() == (getQuantite() == 0);
		return true;
	}

}
