package personnages;

import villageGaulois.Musee;


public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	private int nbtrophees;
	private Equipement[] trophees = new Equipement[100];
	
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
//	private String prendreParole() {
//		return "Le gaulois " + nom + ": ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
//	public void frapper(Romain romain) {
//		System.out.println(prendreParole()+ "envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force/3)*effetPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbtrophees++) {
		this.trophees[nbtrophees] = trophees[i];
		}
		}
	
	public void boirePotion(int newPotion) {
		parler("Merci Druide, je sens que ma force est "+newPotion+" fois décuplé ");
		effetPotion=newPotion;
	}
	
	public void faireUneDonnation(Musee muse) {
		if (nbtrophees>0) {
			parler("Je donne au musee tous mes trophees :");
			do {
				if(trophees[nbtrophees] != null) {
				muse.donnerTrophees(nom,trophees[nbtrophees]);
				System.out.println("-" + trophees[nbtrophees]);
				trophees[nbtrophees]= null;
				}
				nbtrophees--;
			}while(nbtrophees>0);
				}
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
			brutus.sEquiper(Equipement.BOUCLIER);
			brutus.sEquiper(Equipement.BOUCLIER);
			asterix.frapper(brutus);
			
			Musee musee = new Musee();
			asterix.faireUneDonnation(musee);
			
	}


}

