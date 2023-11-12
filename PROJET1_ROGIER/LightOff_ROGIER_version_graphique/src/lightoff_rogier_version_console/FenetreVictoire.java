/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_rogier_version_console;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Evan1204
 */
public class FenetreVictoire extends javax.swing.JFrame {

    /**
     * Creates new form FenetreVictoire
     */
    public FenetreVictoire() {
        initComponents();
        //Affiche le message "Victore !"
        VICTOIRE.setLayout(new GridLayout(1, 1));
        getContentPane().add(VICTOIRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 500, 100));
        this.pack();
        this.revalidate();

        JLabel labelVictoire = new JLabel("V I C T O I R E  !!");
        labelVictoire.setFont(new Font("SansSerif", Font.BOLD, 24)); // Ajustez la police selon vos préférences
        labelVictoire.setHorizontalAlignment(JLabel.CENTER); // Centre le texte horizontalement
        labelVictoire.setVerticalAlignment(JLabel.CENTER); // Centre le texte verticalement
        VICTOIRE.add(labelVictoire);

        //créer le panneau pour le bouton relancer partie
        PanneauRejouer.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauRejouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 80, 40));
        this.pack();
        this.revalidate();

        JButton bouton_Rejouer = new JButton("Rejouer ?");
        ActionListener ecouteurClick1 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            FenetrePrincipale nouvelleFenetre = new FenetrePrincipale();
            nouvelleFenetre.setVisible(true);
            dispose();
            }
        };
        bouton_Rejouer.addActionListener(ecouteurClick1);
        PanneauRejouer.add(bouton_Rejouer);
        
        //créer le panneau pour quitter le jeu
        PanneauFermerJeu.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauFermerJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 230, 130, 40));
        this.pack();
        this.revalidate();

        JButton bouton_FermerJeu = new JButton("Fermer le jeu ?");
        ActionListener ecouteurClick2 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            dispose();
            }
        };
        bouton_FermerJeu.addActionListener(ecouteurClick2);
        PanneauFermerJeu.add(bouton_FermerJeu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauRejouer = new javax.swing.JPanel();
        PanneauFermerJeu = new javax.swing.JPanel();
        VICTOIRE = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauRejouer.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout PanneauRejouerLayout = new javax.swing.GroupLayout(PanneauRejouer);
        PanneauRejouer.setLayout(PanneauRejouerLayout);
        PanneauRejouerLayout.setHorizontalGroup(
            PanneauRejouerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        PanneauRejouerLayout.setVerticalGroup(
            PanneauRejouerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauRejouer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 56));

        PanneauFermerJeu.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout PanneauFermerJeuLayout = new javax.swing.GroupLayout(PanneauFermerJeu);
        PanneauFermerJeu.setLayout(PanneauFermerJeuLayout);
        PanneauFermerJeuLayout.setHorizontalGroup(
            PanneauFermerJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        PanneauFermerJeuLayout.setVerticalGroup(
            PanneauFermerJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauFermerJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        VICTOIRE.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout VICTOIRELayout = new javax.swing.GroupLayout(VICTOIRE);
        VICTOIRE.setLayout(VICTOIRELayout);
        VICTOIRELayout.setHorizontalGroup(
            VICTOIRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        VICTOIRELayout.setVerticalGroup(
            VICTOIRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(VICTOIRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 290, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreVictoire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreVictoire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreVictoire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreVictoire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreVictoire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauFermerJeu;
    private javax.swing.JPanel PanneauRejouer;
    private javax.swing.JPanel VICTOIRE;
    // End of variables declaration//GEN-END:variables
}