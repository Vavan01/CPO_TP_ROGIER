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
public class Epee extends Arme {
    int finesse;

    public Epee(String nom,int Niveau_attaque, int finesse) {
        super(nom, Niveau_attaque);
        this.finesse = finesse;
        if (finesse > 100){
            finesse = 100;
            System.out.println("la finesse est trop élevée.");            
        }
    }
}

