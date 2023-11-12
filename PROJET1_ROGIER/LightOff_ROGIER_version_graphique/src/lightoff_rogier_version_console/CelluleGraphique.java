/*
La classe CelluleGraphique permet de ...
 */
package lightoff_rogier_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import lightoff_rogier_version_console.CelluleLumineuse.Etat;

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
        int w = this.getWidth();
        int h = this.getHeight();

        if (celluleLumineuseAssociee.getEtat() == Etat.Eteint) {
            g.setColor(Color.red);
        } else if (celluleLumineuseAssociee.getEtat() == Etat.Allume) {
            g.setColor(Color.yellow);
        } else if (celluleLumineuseAssociee.getEtat() == Etat.Inter) {
            g.setColor(Color.black); // Choisissez une couleur pour l'état "Inter"
        }
        g.fillOval(2, 2, w - 4, h - 4);
    }
}

