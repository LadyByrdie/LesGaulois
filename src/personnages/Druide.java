package personnages;


import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.random.RandomGenerator;


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
	
	
	public int preparerPotion() {
		//int forcePotion;
		Random forcePotion;
		forcePotion= new Random;
		next
		
		
	}

	private void Random() {
		
		
	}
	
	
}

