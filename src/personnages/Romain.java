package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements; 
	private int nbEquipement = 0;
	
	public void equipement() {
		System.out.println("Les équipement disponibles: ");
		for (Equipement equipement: Equipement.values()) {
			System.out.println("-" + equipement);
		}
	}

	public void sEquiper(Equipement equipement) {
        switch (this.nbEquipement) {
        case 2: {
            System.out.println("Le soldat " + this.nom + " est bien équiper");
            break;
        }
        case 1: {
            if (this.equipements[0] == equipement) {
                System.out.println("Le soldat " + this.nom + " possède déjà un " + equipement);
                break;
            }
        }
        default:
            this.equipements[this.nbEquipement] = equipement;
            this.nbEquipement += 1;
            System.out.println("Le soldat " + this.nom + " s'équipe d'un " + equipement);
            break;
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
	

		@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] arg) {
		Romain mercurius;
		mercurius = new Romain("Mercurius",6);
		mercurius.parler("me frappe pas!");
		mercurius.recevoirCoup(3);		
	}
	
}
