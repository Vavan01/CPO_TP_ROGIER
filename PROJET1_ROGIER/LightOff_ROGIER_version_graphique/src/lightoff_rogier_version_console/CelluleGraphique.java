/*
La classe CelluleGraphique permet de ...
 */
package lightoff_rogier_version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Evan1204
 */
public class CelluleGraphique extends JButton {
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;

    /**
     * constructeur (appelé depuis FenetrePrincipale).
     * @param celluleLumineuseAssociee
     * @param largeur
     * @param longueur
     */
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int longueur) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setText(celluleLumineuseAssociee.toString());
    }
}
