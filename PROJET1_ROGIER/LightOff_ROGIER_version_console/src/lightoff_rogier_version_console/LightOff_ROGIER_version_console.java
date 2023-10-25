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
//Testez chacune de vos méthodes dans la fonction main() : créez une ou deux cellules
//lumineuses, affichez leur état, changez ce dernier, raffichez l’état pour vérifier que ce
//dernier a bien été mis à jour.

    CelluleLumineuse cel1 = new CelluleLumineuse();
    cel1.getEtat();
    System.out.println(cel1.getEtat());
    cel1.activerCellule();
    cel1.getEtat();
    System.out.println(cel1.getEtat());
    
    cel1.activerCellule();
    cel1.eteindreCellule();
    cel1.estEteint();
    cel1.getEtat();
    System.out.println(cel1.getEtat());

    
        int min = 0;
        int max = 2;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomInt);
    
    }
    
}
