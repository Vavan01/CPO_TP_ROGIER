/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package tp3_heroic_fantasy_rogier;

import Personnage.Epee;
import Armes.Arme;
import Armes.Baton;
import Personnage.Guerrier;
import Personnage.Magicien;
import Personnage.Personnage;
import java.util.ArrayList;

/**
 *
 * @author Evan1204
 */
public class TP3_Heroic_Fantasy_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur",7,5);
        Epee Durandal = new Epee("Durandal",4,7);
        
        Baton Chêne = new Baton("Chêne", 4, 5);
        Baton Charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> lesArmes = new ArrayList<Arme>();
        lesArmes.add(Excalibur);
        lesArmes.add(Durandal);
        lesArmes.add(Chêne);
        lesArmes.add(Charme);
        System.out.println(lesArmes.size());

        Magicien Gandalf = new Magicien(true,"Gandalf",65);
        Magicien Garcimore = new Magicien(false,"Garcimore",44);

        Guerrier Conan =new Guerrier(false,"Conan",78);
        Guerrier Lannister = new Guerrier(true,"Lannister",45);
        
        ArrayList<Personnage> lesPersonnages = new ArrayList<Personnage>();
        lesPersonnages.add(Gandalf);
        lesPersonnages.add(Garcimore);
        lesPersonnages.add(Conan);
        lesPersonnages.add(Lannister);
        System.out.println(lesPersonnages);
        
        Guerrier Lanfeust = new Guerrier(false,"Lanfeust",50);
        Magicien Cixi = new Magicien(true,"Cixi",25);
        
        Epee Sabre_laser = new Epee("Sabre_laser",20,60);
        Epee Katana = new Epee("Katana",10,70);
        Epee Epee_longue = new Epee("Epee_longue",30,7);
        
        Baton Baton_Ether = new Baton("Baton_Ether", 10, 13);
        Baton Baton_Feu = new Baton("Baton_Feu", 14, 40);
        Baton Baton_Glace = new Baton("Baton_Glace", 7, 12);
        
        Lanfeust.ajouter_Armes(Epee_longue);
        Lanfeust.ajouter_Armes(Sabre_laser);
        Lanfeust.ajouter_Armes(Baton_Glace);
        Lanfeust.Equiper_perso("Epee_longue");
        
        Cixi.ajouter_Armes(Baton_Ether);
        Cixi.ajouter_Armes(Baton_Feu);
        Cixi.ajouter_Armes(Katana);
        
        
}
}
