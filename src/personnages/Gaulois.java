package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" +texte + "»");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(prendreParole()+ "envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}
	
	public void boirePotion(int newPotion) {
		parler("Merci Druide, je sens que ma force est "+newPotion+" fois décuplé ");
		effetPotion=newPotion;
	}
//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}
//	
	public static void main (String[] args) {
			Gaulois asterix;
			asterix= new Gaulois("Astérix",8);
			//System.out.println(asterix);
			
			Romain brutus;
			brutus = new Romain("Brutus",4);
			//System.out.println(brutus);

			asterix.parler("Regard la bas!");
			asterix.prendreParole();
			asterix.frapper(brutus);
			
	}


}

