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
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur
     * @param le_nbLignes
     * @param le_nbColonnes
     */
    public GrilleDeJeu(int le_nbLignes, int le_nbColonnes) {
        this.nbLignes = le_nbLignes;
        this.nbColonnes = le_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int x=0 ; x<matriceCellules.length; x++){
            for (int y=0 ; y<matriceCellules.length; y++){
                matriceCellules[x][y] = new CelluleLumineuse();
            }
        }
    }

    /**
     * eteindreToutesLesCellules éteint toutes les cellules de la grille, en
     * passant chaque cellule en état "éteint".
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
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random nbAlea = new Random();
        int n = nbAlea.nextInt(4); // Génère un nombre aléatoire entre 0 et 3
        int la_Ligne = nbAlea.nextInt(nbLignes);
        int la_Colonne = nbAlea.nextInt(nbColonnes);
        if (n == 0) {
            activerLigneDeCellules(la_Ligne);
        } else if (n == 1) {
            activerColonneDeCellules(la_Colonne);
        } else if (n == 2) {
            activerDiagonaleMontante();
        } else if (n == 3) {
            activerDiagonaleDescendante();
        }
    }
    
    /**
     * melangerMatriceAleatoirement permet de générer un plateau de cellules 
     * lumineuses de manière aléatoire à partir d’un nombre spécifié de tours
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * activerLigneDeCellules active toutes les cellules d'une ligne
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        for (int y = 0; y < matriceCellules.length; y++) {
            matriceCellules[idLigne][y].activerCellule();
    }
    }
    
    /**
     * activerColonneDeCellules active toutes les cellules d'une colonne
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (int x = 0; x < matriceCellules.length; x++) {
            matriceCellules[x][idColonne].activerCellule();
    }
    }
    
    /**
     * activerDiagonaleDescendante active la diagonale descendante de la grille 
     * en allumant les cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int x = 0; x < matriceCellules.length; x++) {
            for (int y = 0; y < matriceCellules.length; y++) {
                if (x == y) {
                    matriceCellules[x][y].activerCellule();
                }
            }
        }
    }

    /**
     * activerDiagonaleMontante active la diagonale montante de la grille 
     * en allumant les cellules correspondantes.
     */
    public void activerDiagonaleMontante(){
        for (int x = 0; x < matriceCellules.length; x++) {
            for (int y = 0; y < matriceCellules.length; y++) {
                if (x == y) {            
                    matriceCellules[x][nbColonnes - 1 - y].activerCellule();
                }
            }
        }
    }   

    /**
     * vérifie si toutes les cellules de la grille sont éteintes :
     *  - retourne true si toutes les cellules sont éteintes
     *  - retourne false sinon
     * @return true ou false
     */
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
    
    /**
     * getTailleGrille permet d'avoir accès à la taille de la grille.
     * @return la taille de la grille.
     */
    public int getTailleGrille() {
    return matriceCellules.length;
}


    /**
     *
     * @return une grille générée aléatoirement dans la console
     */
    @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();
        gridString.append("  |");
        for (int y = 0; y < nbColonnes; y++) {
            gridString.append(" " + y + " |");
        }
        gridString.append("\n");
        for (int x = 0; x < nbLignes; x++) {
            gridString.append("-------------------------------\n");
            gridString.append(x+ " |");
            for (int y = 0; y < nbColonnes; y++) {
                gridString.append(" " + (matriceCellules[x][y].getEtat() ? "X" : "O") + " |");
            }
            gridString.append("\n");
        }
        gridString.append("-------------------------------\n");

        return gridString.toString();
    }
}
