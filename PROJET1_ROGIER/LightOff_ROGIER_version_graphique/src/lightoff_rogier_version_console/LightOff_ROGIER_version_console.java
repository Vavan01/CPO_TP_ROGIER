/*
ROGIER Evan
TDC
Projet 1
25/10/2023
 */
package lightoff_rogier_version_console;

import java.util.Random;

/**
 *
 * @author Evan1204
 */
public class LightOff_ROGIER_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    CelluleLumineuse cel1 = new CelluleLumineuse();
    cel1.getEtat();
    //System.out.println(cel1.getEtat());
    cel1.activerCellule();
    cel1.getEtat();
    //System.out.println(cel1.getEtat());
    
    cel1.activerCellule();
    cel1.eteindreCellule();
    cel1.estEteint();
    cel1.getEtat();
    //System.out.println(cel1.getEtat());

    
    Partie partie1 = new Partie("moyen");
    partie1.LancerPartie();
    }
}
