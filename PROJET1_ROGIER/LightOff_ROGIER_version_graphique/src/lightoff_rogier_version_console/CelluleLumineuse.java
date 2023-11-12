/*
La classe CelluleLumineuse représente une cellule lumineuse qui peut être dans 
l'état "allumée" ou "éteinte".
 */
package lightoff_rogier_version_console;

/**
 *
 * @author Evan1204
 */
public class CelluleLumineuse {
    // Définition de l'énumération pour les états possibles
    public enum Etat {
        Allume, Eteint, Inter
    }

    private Etat etat;

    /**
     * Constructeur
     */
    public CelluleLumineuse() {
        this.etat = Etat.Eteint; // initialiser l'état de la cellule à "éteint"
    }

    /**
     * Méthode pour activer la cellule lumineuse en changeant son état
     */
    public void activerCellule() {
        if (etat == Etat.Eteint) {
            etat = Etat.Allume;
        } else if (etat == Etat.Allume) {
            etat = Etat.Inter;
        } else if (etat == Etat.Inter) {
            etat = Etat.Eteint;
        }
    }

    /**
     * Méthode pour éteindre la cellule lumineuse
     */
    public void eteindreCellule() {
        etat = Etat.Eteint;
    }

    /**
     * Méthode pour vérifier si la cellule est dans l'état "éteint"
     */
    public boolean estEteint() {
        return etat == Etat.Eteint;
    }

    /**
     * Méthode pour obtenir l'état actuel de la cellule
     */
    public Etat getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if (etat == Etat.Allume) {
            return "X";
        } else if (etat == Etat.Eteint) {
            return "O";
        } else if (etat == Etat.Inter) {
            return "A";
        }
        return null;
    }
}


