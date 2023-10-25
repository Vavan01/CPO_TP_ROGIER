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
    private boolean etat;

    /**
     * Constructeur
     * @param aucun
     */
    public CelluleLumineuse() {
        this.etat = false; //initialise l'état de la cellule. La cellule est initialement éteinte
        }
    
    /**
     * activerCellule permet d'activer la cellule lumineuse en inversant son
     * état actuel : 
     *  - si état = allumé -> état = éteint
     *  - si état = éteint -> état = allumé
     * @param aucun
     */
    public void activerCellule(){
        if (etat == false){
            etat = true;
        }else{
            etat = false;
        }
    }
    
    /**
     * eteindreCellule permet d'éteindre la cellule en la mettant dans l'état
     * "éteinte" (false).
     * @param aucun
     */
    public void eteindreCellule(){
        if (etat == true){
            etat = false;
        }
    }
    
    /**
     * estEteint renvoie true si la cellule est éteinte et false si elle est
     * allumée.Cette méthode permet de déterminer l'état actuel de la cellule.
     * @param aucun
     * @return true ou false
     */
    public boolean estEteint(){
        if (etat == false){
            return true;
        } else {
            return false;
        }
    }

    /**
     * getEtat renvoie l'état actuel de la cellule
     * @param aucun
     * @return l'état de la cellule (allumée ou éteinte)
     */
    public boolean getEtat(){
            return etat;
    } 
}


