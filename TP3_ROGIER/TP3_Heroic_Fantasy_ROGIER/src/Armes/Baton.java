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
public class Baton extends Arme {
    int age;

    public Baton( String nom, int Niveau_attaque, int age) {
        super(nom, Niveau_attaque);
        this.age = age;
        if (age > 100){
            age = 100;
            System.out.println("l'age est trop élevé.");            
        }
    }    
}

