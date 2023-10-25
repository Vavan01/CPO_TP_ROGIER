/*
La classe GrilleDeJeu représente une grille de cellules lumineuses. Cette grille 
est constituée de cellules lumineuses organisées en lignes et colonnes.
 */
package lightoff_rogier_version_console;

/**
 *
 * @author Evan1204
 */
public class GrilleDeJeu{
    matriceCellules CelluleLumineuse[][];
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes, boolean etat) {
        super(etat);
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
    }


}
