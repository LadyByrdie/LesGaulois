package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	int nbVillageoisMaximum;
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public Village(String nom, int nbVillageoisMaximum) {
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
		if (nbVillageois > 0) {
			System.out.println(villageois[number]);
		} else {
			System.out.println("Le village est vide");
		}
		System.out.println(villageois[number]);
	}
	
	public static void main(String[] args) {
		Village village;
		village= new Village("Village des Irréductibles",30);
		
	}
	
	
	
}
