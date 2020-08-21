/**
 * 
 */
package dev.dto;

import com.sun.istack.NotNull;

/**
 * @author robin
 *
 */
public class CreerArticleDto {

	@NotNull
	private String libelle;
	
	@NotNull
	private int prix;

	/**
	 * Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}	
}
