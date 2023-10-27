/*
La classe Partie représente une partie du jeu LightOff en utilisant une grille 
de cellules lumineuses. Cette classe facilite l'interaction entre le joueur et 
la grille, permettant de jouerau jeu LightOff.
 */
package lightoff_rogier_version_console;

import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class Partie {
    private GrilledeCellules grille;
    private int nbCoups;

    /**
     * Constructeur
     * @param nbLignes
     * @param nbColonnes
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilledeCellules(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
     * initialiserPartie() s’assure que la grille de jeu est bien mélangée et 
     * donc d'initialiser la partie.
     */
    public void initialiserPartie() {
        nbCoups = 0;
    }

    /**
     * lancerPartie() permet de jouer à LightOff en activant les lignes, les 
     * colonnes ou les diagonales correspondantes en fonction des valeurs rentrées 
     * par le joueur jusqu'à ce que toutes les cellules soient éteintes, puis 
     * elle affiche le nombre de coups nécessaires pour y parvenir.
     */
    public void LancerPartie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue et c'est l'heure de jouer à LightOff :");
        initialiserPartie();
        while (grille.cellulesToutesEteintes() == false) {
            System.out.println("A votre tour, choissisez qu'est-ce que vous voulez modifier:");
            System.out.println("1) Une Ligne");
            System.out.println("2) Une Colonne");
            System.out.println("3) Une diagonale Descendante");
            System.out.println("4) Une Diagonale Montante");
            System.out.println(grille);
            int modif = sc.nextInt();
            if (modif == 1) {
                System.out.println("Choissisez votre ligne à modifier");
                int numL = sc.nextInt();
                grille.activerLigneDeCellules(numL);
                System.out.println(grille);
                nbCoups++;
            } else if (modif == 2) {
                System.out.println("Choissisez votre colonne à modifier");
                int numC = sc.nextInt();
                grille.activerColonneDeCellules(numC);
                System.out.println(grille);
                nbCoups++;
            } else if (modif == 3) {
                grille.activerDiagonaleDescendante();
                System.out.println(grille);
                nbCoups++;
            }
            if (modif == 4) {
                grille.activerDiagonaleMontante();
                System.out.println(grille);
            }
            nbCoups++;
        }
    }
}

