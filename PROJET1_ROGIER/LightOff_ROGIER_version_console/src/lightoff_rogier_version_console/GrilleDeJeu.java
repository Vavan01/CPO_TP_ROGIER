/*
La classe GrilleDeJeu représente une grille de cellules lumineuses. Cette grille 
est constituée de cellules lumineuses organisées en lignes et colonnes.
 */
package lightoff_rogier_version_console;

import java.util.Random;

/**
 *
 * @author Evan1204
 */
public class GrilleDeJeu{
    CelluleLumineuse[][] matriceCellules = null;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur
     * @param nbLignes
     * @param nbColonnes
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        for (int x=0 ; x<matriceCellules.length; x++){
            for (int y=0 ; y<matriceCellules.length; y++){
                matriceCellules[x][y] = new CelluleLumineuse();
            }
        }
    }

    /**
     * eteindreToutesLesCellules éteint toutes les cellules de la grille, en
     * passant chaque cellule en état "éteint".
     * @param aucun
     */
    public void eteindreToutesLesCellules(){
        for (int x=0 ; x<matriceCellules.length; x++){
            for (int y=0 ; y<matriceCellules.length; y++){
               matriceCellules[x][y].eteindreCellule(); 
            }
        }
    }
    
    /**
     * activerLigneColonneOuDiagonaleAleatoire active de manière aléatoire soit 
     * une ligne, soit une colonne, soit une diagonale de cellules dans la grille
     * @param aucun
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int[] tabAlea = new int[3]; // Initialisation du tableau pour deux résultats possibles
        Random nbAlea = new Random();
        int idLigne = nbAlea.nextInt(matriceCellules.length);
        int idColonne = nbAlea.nextInt(matriceCellules[0].length);
        for (int i = 0; i < matriceCellules.length; i++) {
            int n = nbAlea.nextInt(4); // Génère un nombre aléatoire entre 0 et 2
            tabAlea[n]++; // Incrémente la case correspondant au résultat du lancer
            if (tabAlea[n] == 0){
                activerLigneDeCellules(idLigne);
            } else if (tabAlea[n] == 1) {
                activerColonneDeCellules(idColonne);             
            } else if (tabAlea[n] == 2) {
                activerDiagonaleMontante();
            } else if (tabAlea[n] == 3) {
                activerDiagonaleDescendante();
            }

        }
    }
    
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    public void activerLigneDeCellules(int idLigne){
        for (int y = 0; y < matriceCellules.length; y++) {
            matriceCellules[idLigne][y].activerCellule();
    }
    }
    
    
    public void activerColonneDeCellules(int idColonne){
        for (int x = 0; x < matriceCellules.length; x++) {
            matriceCellules[x][idColonne].activerCellule();
    }
    }
    
    
    public void activerDiagonaleDescendante() {
        for (int x = 0; x < matriceCellules.length; x++) {
            for (int y = 0; y < matriceCellules.length; y++) {
                if (x == y) {
                    matriceCellules[x][y].activerCellule();
                }
            }
        }
    }

    public void activerDiagonaleMontante(){
        for (int x = 0; x < matriceCellules.length; x++) {
            for (int y = 0; y < matriceCellules.length; y++) {
                if (x == y) {            
                    matriceCellules[x][nbColonnes - 1 - y].activerCellule();
                }
            }
        }
    }   

    public boolean cellulesToutesEteintes() {
        for (int x = 0; x < matriceCellules.length; x++) {
            for (int y = 0; y < matriceCellules.length; y++) {
                if (matriceCellules[x][y].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "GrilleDeJeu{" + "matriceCellules=" + matriceCellules + ", nbLignes=" + nbLignes + ", nbColonnes=" + nbColonnes + '}';
    }




}
