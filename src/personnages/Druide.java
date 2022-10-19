package personnages;

import java.util.Random;


public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peut aller d'une force" + effetPotionMin + "à"
				+effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	private String prendreParole() {
		return "Le druide" + nom + ":";
	}
	
	
	public void preparerPotion() {
		int newForce;
		Random forcePotion= new Random();
		newForce= forcePotion.nextInt(effetPotionMax);
		while (newForce<effetPotionMin) {
			newForce= forcePotion.nextInt(effetPotionMax);
		}
		if (newForce>7) {
			System.out.println(prendreParole()+"J'ai préparé une super potion de force "+newForce );
			
		} else {
			System.out.println(prendreParole()+"Je n'ai pas trouvé tous les ingrédients, ma potion et seumen de force "+newForce);
		}
		}
		
	

public void main(String[] args) {
	Druide panoramix;
	Druide panomarix= new Druide("Panomarix", 5, 10);
	panomarix.preparerPotion();
}
}



