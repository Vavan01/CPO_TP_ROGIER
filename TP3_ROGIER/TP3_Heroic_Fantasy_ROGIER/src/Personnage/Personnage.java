/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_rogier.etreVivant;

/**
 *
 * @author Evan1204
 */
public abstract class Personnage implements etreVivant{
   String nom;
   int PV;
   ArrayList<Arme> liste_Armes;
   Arme Arme_en_Main;
   static int nb_de_Perso;
   
    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
        liste_Armes = new ArrayList<Arme>(5);
        nb_de_Perso++;
    }
    
    public int getPV() {
        return PV;
    }
    
    public void ajouter_Armes(Arme bigger_weapons){
       if (liste_Armes.size() >= 5 ){
           System.out.println("Mon sac est fait !");
       } else {
           liste_Armes.add(bigger_weapons);
           System.out.println(nom+ " a ajouté " +bigger_weapons+ " a son inventaire");
       }
    }
    
    public void Arme_en_Main(int the_weapon){
        if (liste_Armes.get(the_weapon) == null){
            System.out.println("Le personnage n’est pas armée");
        }else{
            System.out.println("Le personnage personnage a l'arme " +liste_Armes.get(the_weapon)+ " en main");
        }
    }
    
    public void Equiper_perso(String nom_Arme) {
        Arme arme_a_Equiper = null;
        for (Arme arme : liste_Armes) {
            if (arme.getNom().equals(nom_Arme)) {
                arme_a_Equiper = arme;
                break;
            }
        }
        if (arme_a_Equiper != null) {
            Arme_en_Main = arme_a_Equiper;
            System.out.println("Arme équipée : " + arme_a_Equiper.getNom());
        } else {
            System.out.println("L'arme n'est pas dans l'inventaire.");
        }
    }
    
    public void seFatiguer() {
        PV -= 10;// Réduit les points de vie du personnage de 10
    }

    public boolean estVivant() {
        return PV > 0;// Un personnage est vivant s'il a des points de vie positifs
    }
    
    public void estAttaque(int points) {
        PV -= points;// Réduit les points de vie du personnage en fonction de l'attaque reçue
    }
    

    public void finalize(){
        nb_de_Perso = nb_de_Perso-1;
    }
    
        
    @Override
    public String toString() {
        String infoPersonnage = "Personnage{" + "nom=" + nom + ", PV=" + PV + '}';
        if (Arme_en_Main != null) {
            infoPersonnage += "\nArme en main : " + Arme_en_Main.getNom();
        }
        return infoPersonnage;
    }
}
