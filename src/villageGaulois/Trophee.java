package villageGaulois;

import personnages.Equipement;

public class Trophee {
String gaulois;
Equipement equipement;

public Trophee(String gaulois, Equipement equipement) {
	super();
	this.gaulois = gaulois;
	this.equipement = equipement;
}


public String getGaulois() {
	return gaulois;
}

public Equipement getEquipement() {
	return equipement;
}

}
