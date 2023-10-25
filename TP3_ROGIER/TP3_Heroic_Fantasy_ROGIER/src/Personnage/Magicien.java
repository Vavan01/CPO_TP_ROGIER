/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package Personnage;

import Armes.Arme;

/**
 *
 * @author Evan1204
 */
public class Magicien extends Personnage {
    boolean confirme;
    static int nb_de_Magicien;
    
    public Magicien(boolean confirme, String nom, int PV) {
        super(nom, PV);
        this.confirme = confirme;
        nb_de_Magicien++;
        if (confirme == true){
            System.out.println(nom+ " est un magicien confirme");
        } else {
            System.out.println(nom+ " est un novice");
        }
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    public void finalize(){
        nb_de_Magicien = nb_de_Magicien-1;
    }
}
