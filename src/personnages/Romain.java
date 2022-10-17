package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[][] equipement; 
	private int nbEquipement = 0;
	private enum Equipement{CASQUE("casque"), BOUCLIER("bouclier");
		private String nom;
		
		private Equipement(String nom) {
			this.nom = nom;
		}
		
		public String toString() {
			return nom;
		}
	};
	
	public void equipement() {
		System.out.println("Les équipement disponibles: ");
		for (Equipement equipement: Equipement.values()) {
			System.out.println("-" + equipement);
		}
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");		
	}
	
	private String prendreParole() {
		return "Le romain " + nom + ":";
	}
	
	public void recevoirCoup(int forceCoup) {
		int force2;
		assert force>0;
		force2= force- forceCoup;
		if (force>0) {
			parler("Aïe");
		assert force>force2;
			
		} else {
			parler("J'abandonne..."); 
		}
	}
	
	public void sEquiper(Equipement[]porter) {
		if(nbEquipement == 2) {
			System.out.println("Le soldat "+nom+ "est déjà bien protégé!")
		}if (nbEquipement == 1) {
			
			
		}
	}
	
		@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] arg) {
		Romain mercurius;
		mercurius = new Romain("Mercurius",6);
		mercurius.equipement();
		mercurius.parler("me frappe pas!");
		mercurius.recevoirCoup(3);
		
		
	}
	
}
