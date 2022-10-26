package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements; 
	private int nbEquipement = 0;
	private String texte;
	
	public void equipement() {
		System.out.println("Les équipement disponibles: ");
		for (Equipement equipement: Equipement.values()) {
			System.out.println("-" + equipement);
		}
	}

	public void sEquiper(Equipement equip) {
        switch (nbEquipement) {
        case 2: 
            System.out.println("Le soldat " + getNom() + " est bien équiper");
            break;
     
        case 1: 
            if (equipements[nbEquipement-1] == equip) {
                System.out.println("Le soldat " + getNom() + " possède déjà un " + equip.getNom());
            }
            else {
            	equipements[nbEquipement] = equip;
            	nbEquipement++;
            	
            }
            break;
        
        default:
        	equipements[nbEquipement] = equip;
            nbEquipement++;
            System.out.println("Le soldat " + getNom() + " s'équipe d'un " + equip.getNom());
            break;
        }
    }
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements= new Equipement[2];
		assert force>0;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");		
	}
	
	private String prendreParole() {
		return "Le romain " + nom + ":";
	}
	
//	public void recevoirCoup(int forceCoup) {
//		int force2;
//		assert force>0;
//		force2= force- forceCoup;
//		if (force>0) {
//			parler("Aïe");
//		assert force>force2;
//			
//		} else {
//			parler("J'abandonne..."); 
//		}
//	}
//	

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// Precondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:{
			parler("Aïe");
			break;
		}
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement > 0) {
		texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement;i++) {
		if(equipements[i] != null){
			if (equipements[i].equals(Equipement.BOUCLIER)) {
				System.out.println("Equipement bouclier");
				resistanceEquipement += 8;
			}else {
				System.out.println("Equipement casque");
				resistanceEquipement += 5;
			}
		}
		texte += resistanceEquipement + "!";
		parler(texte);
		forceCoup -= resistanceEquipement;
		}
		}
		return forceCoup;

	}
	
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i <nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
				}
				return equipementEjecte;
				}
		
		@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	public static void main(String[] arg) {
		Romain mercurius;
		mercurius = new Romain("Mercurius",6);
		mercurius.sEquiper(Equipement.BOUCLIER);
		mercurius.sEquiper(Equipement.BOUCLIER);
		mercurius.ejecterEquipement();
		mercurius.parler("me frappe pas!");
		mercurius.recevoirCoup(2);		
		
	}
	
}
