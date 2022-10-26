package villageGaulois;

import personnages.Equipement;

public class Musee {
int nbTrophee=0;
Trophee[] tableau = new Trophee[200];

public void donnerTrophees(String gaulois, Equipement equipement){
	Trophee trophee = new Trophee(gaulois,equipement);
	tableau[nbTrophee]= trophee;
	nbTrophee++;
}

}
