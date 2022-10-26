package personnages;

import java.util.Random;


public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int newPotion = 1;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + "et ma potion peut aller d'une force " + effetPotionMin + " à "
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
		Random forcePotion= new Random();
		newPotion= forcePotion.nextInt(effetPotionMax);
		while (newPotion<effetPotionMin-1) {
			newPotion= forcePotion.nextInt(effetPotionMax);
		}
		if (newPotion>7) {
			System.out.println(prendreParole()+"J'ai préparé une super potion de force "+newPotion);
			
		} else {
			System.out.println(prendreParole()+"Je n'ai pas trouvé tous les ingrédients, ma potion et seulment de force "+newPotion);
			}
		}
	
	public void booster(Gaulois person){
		String nomGaulois = person.getNom();
		if("Obélix".equals(nomGaulois)) {
			parler("Non, Obélix! ... Tu n'auras pas de potion magique!");
		}else {
			preparerPotion();
			person.boirePotion(newPotion);
		}
	}
		
		
	

public static void main(String[] args) {
	Gaulois asterix;
	asterix = new Gaulois("Astérix", 8);
	Druide panomarix= new Druide("Panomarix", 5, 10);
	panomarix.booster(asterix);
}
}



