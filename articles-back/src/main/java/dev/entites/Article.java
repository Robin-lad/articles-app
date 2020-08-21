/**
 * 
 */
package dev.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author robin
 *
 */
@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String libelle;
	private int prix;
	
	public Article() {
		super();
	}

	public Article(String libelle, int prix) {
		super();
		this.libelle = libelle;
		this.prix = prix;
	}

	/**
	 * Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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
	public double getPrix() {
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
