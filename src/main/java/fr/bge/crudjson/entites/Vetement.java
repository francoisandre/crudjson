package fr.bge.crudjson.entites;

public class Vetement extends EntiteEnregistrable {

	private String taille;
	private String couleur;
	private Fabricant fabricant;

	public String getCouleur() {
		return couleur;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(final String taille) {
		this.taille = taille;
	}

	public void setCouleur(final String couleur) {
		this.couleur = couleur;
	}

	public Fabricant getFabricant() {
		return fabricant;
	}

	public void setFabricant(final Fabricant fabricant) {
		this.fabricant = fabricant;
	}

}
