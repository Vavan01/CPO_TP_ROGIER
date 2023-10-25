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
    public void activerLigneColonneOuDiagonaleAleatoire(int ete){
        int[] tabAlea = new int[3]; // Initialisation du tableau pour deux résultats possibles
        Random nbAlea = new Random();
        for (int i = 0; i < matriceCellules.length; i++) {
            int n = nbAlea.nextInt(3); // Génère un nombre aléatoire entre 0 et 2
            tabAlea[n]++; // Incrémente la case correspondant au résultat du lancer
            if (tabAlea[n] == 1) {
                matriceCellules[x][y].activerLigneDeCellules(int idLigne);
                }
            } else if (tabAlea[n] == 1) {
                for (int y = 0; y < matriceCellules.length; y++) {
                    matriceCellules[0][y].activerCellule();
                }
            } else if (tabAlea[n] == 2) {
                for (int x = 0; x < matriceCellules.length; x++) {
                    for (int y = 0; y < matriceCellules.length; y++) {
                        if (x == y) {
                            matriceCellules[x][y].activerCellule();
                        }
                    }
                }
            }
        }
    }

    public int melangerMatriceAleatoirement(int nbTours){
        
    }
    
    public void activerLigneDeCellules(int idLigne){
        for (int x = 0; x < matriceCellules.length; x++) {
            matriceCellules[idLigne][0].activerCellule();
    }
    
    public void activerColonneDeCellules(int idColonne){
        
    } 
}

