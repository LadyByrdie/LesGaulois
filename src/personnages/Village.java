package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	static int nbVillageoisMaximum;
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public Village(Chef chef,String nom, int nbVillageoisMaximum) {
		this.chef= chef;
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois]= gaulois;
			nbVillageois ++;
		} else {
			System.out.println("Village complet");
		}
	}
	
	public void trouverHabitant(int number) {
		if (number< nbVillageois) {
			System.out.println(villageois[number].getNom()); 
		}else{
			System.out.println("Villageois non existant");
		}
	}
	public void afficherVillageois(){
		System.out.println("Dans village du chef "+ chef.getNom() + " vivent les légendaires gaulois :" );
		for (int i=0; i<nbVillageois ; i++) {
			System.out.println("-"+ villageois[i].getNom());
		}	
	}
	
	public static void main(String[] args) {
		Village village;
		Gaulois asterix;
		Gaulois obelix;
		Chef abraracourcix;
		abraracourcix= new Chef("Abraracourcix", 5,1); 
		village= new Village(abraracourcix,"Village des Irréductibles",30);
		asterix= new Gaulois("Astérix",8);
		obelix= new Gaulois("Obélix",25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
//		village.trouverHabitant(0);
		village.afficherVillageois();
//	System.out.println();
	}
	
	
	
}
