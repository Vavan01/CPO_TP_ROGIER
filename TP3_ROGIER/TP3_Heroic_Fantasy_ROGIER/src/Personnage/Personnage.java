/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Evan1204
 */
public abstract class Personnage {
   String nom;
   int PV;
   ArrayList<Arme> liste_Armes;
   Arme Arme_en_Main;

    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
        liste_Armes = new ArrayList<Arme>(5);
    }

    public int getPV() {
        return PV;
    }
    
    public void ajouter_Armes(Arme bigger_weapons){
       if (liste_Armes.size() >= 5 ){
           System.out.println("Mon sac est fait !");
       } else {
           liste_Armes.add(bigger_weapons);
       }
    }
    
    public void Arme_en_Main(int the_weapon){
        if (liste_Armes.get(the_weapon) == null){
            System.out.println("Le personnage n’est pas armée");
        }else{
            System.out.println("Le personnage personnage a l'arme " +liste_Armes.get(the_weapon)+ " en main");
        }
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    
    public void Equiper_perso(String nom_Arme){
        
    }
    
    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", PV=" + PV + '}';
    }
}
