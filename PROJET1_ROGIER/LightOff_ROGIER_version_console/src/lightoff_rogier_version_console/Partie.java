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
    GrilleDeJeu grille;
    int nbCoups;

    /**
     * Constructeur
     * @param niveauDifficulte Le niveau de difficulté : "facile", "moyen" ou "difficile"
     */
    public Partie(String niveauDifficulte) {
        if (niveauDifficulte.equals("facile")) {
            grille = new GrilleDeJeu(5,5);
        } else if (niveauDifficulte.equals("moyen")) {
            grille = new GrilleDeJeu(7,7);
        } else if (niveauDifficulte.equals("difficile")) {
            grille = new GrilleDeJeu(10,10);
        }
        nbCoups = 0;
    }

    /**
     * initialiserPartie() s’assure que la grille de jeu est bien mélangée et
     * donc d'initialiser la partie.
     */
    public void initialiserPartie() {
    int tailleGrille = grille.getTailleGrille();
    if (tailleGrille == 5) {
        grille.melangerMatriceAleatoirement(5);
    } else if (tailleGrille == 7) {
        grille.melangerMatriceAleatoirement(7);
    } else if (tailleGrille == 10) {
        grille.melangerMatriceAleatoirement(10);
    }
}


    /**
     * lancerPartie() permet de jouer à LightOff en activant les lignes, les 
     * colonnes ou les diagonales correspondantes en fonction des valeurs rentrées 
     * par le joueur jusqu'à ce que toutes les cellules soient éteintes, puis 
     * elle affiche le nombre de coups nécessaires pour y parvenir.
     */
    public void LancerPartie() {
        initialiserPartie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue sur LightOff !");
        System.out.println(grille);
        while (grille.cellulesToutesEteintes() == false) {
            System.out.println("A toi de jouer ! que veux-tu modifier :\n1) Une Ligne ?\n2) Une Colonne ?\n3) Une diagonale Descendante ?\n4) Une Diagonale Montante ?");
            int A_modifier = sc.nextInt();
            if (A_modifier == 1) {
                System.out.println("Quelle ligne veux-tu modifier ?");
                int ligneL = sc.nextInt();
                grille.activerLigneDeCellules(ligneL);
                System.out.println(grille);
                nbCoups++;
            }else if (A_modifier == 2) {
                System.out.println("Quelle colonne veux-tu modifier ?");
                int colonneC = sc.nextInt();
                grille.activerColonneDeCellules(colonneC);
                System.out.println(grille);
                nbCoups++;
            }else if (A_modifier == 3) {
                grille.activerDiagonaleDescendante();
                System.out.println(grille);
                nbCoups++;
            }else{
                grille.activerDiagonaleMontante();
                System.out.println(grille);
                nbCoups++;
            }
        }
    }
}

// modif : ajouter un message de victoire + faire un système de niveau 

