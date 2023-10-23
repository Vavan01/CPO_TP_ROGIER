/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package Armes;

/**
 *
 * @author Evan1204
 */
public abstract class Arme {
    String nom;
    int Niveau_attaque;

    public Arme(String nom,int Niveau_attaque){
        this.nom = nom;
        this.Niveau_attaque = Niveau_attaque;
        if (Niveau_attaque > 100){
            Niveau_attaque = 100;
            System.out.println("le niveau d'attaque est trop élevé.");
        }
    }

    public int getNiveau_attaque() {
        return Niveau_attaque;
    }

@Override
    public String toString() { //toString
        return nom + " " + Niveau_attaque + " ";
    }
}