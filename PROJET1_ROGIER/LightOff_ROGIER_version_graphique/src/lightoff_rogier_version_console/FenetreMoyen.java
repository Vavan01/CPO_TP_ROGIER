/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_rogier_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Evan1204
 */
public class FenetreMoyen extends javax.swing.JFrame {
    GrilleDeJeu grille;
    int nbCoups;
    int i;
    int j;
    private int tailleGrille;
    /**
     * Creates new form FenetreMoyen
     */
    public FenetreMoyen() {
        initComponents();
        this.tailleGrille = 7;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, tailleGrille * 40, tailleGrille * 40));
        this.pack();
        this.revalidate();
        this.grille = new GrilleDeJeu(tailleGrille, tailleGrille);
        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(tailleGrille, tailleGrille));
        for (int i = 0; i < tailleGrille; i++) {
            for (int j = 0; j < tailleGrille; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        // création du panneau de boutons verticaux (pour les lignes)
        PanneauBoutonsVerticaux.setLayout(new GridLayout(tailleGrille, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 1 * 40, tailleGrille * 40));
        this.pack();
        this.revalidate();
        
        for (i = 0; i < tailleGrille; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick1 = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    finDePartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick1);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        
        // création du panneau de boutons horizontaux (pour les colonnes)
            PanneauBoutonsHorizontaux.setLayout(new GridLayout(1,tailleGrille));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, tailleGrille * 40,1 * 40));
        this.pack();
        this.revalidate();
        
        for (j = 0; j < tailleGrille; j++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick2 = new ActionListener() {
                final int i = j;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(i);
                    repaint();
                    finDePartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick2);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }
        // création du panneau du bouton diagonale suppérieure
        PanneauBoutonDiagSup.setLayout(new GridLayout(1, 1));
        int xCoordinate = PanneauBoutonsHorizontaux.getX() + PanneauBoutonsHorizontaux.getWidth() + 5;
        getContentPane().add(PanneauBoutonDiagSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(xCoordinate, 80, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        JButton bouton_diagSup = new JButton();
        ActionListener ecouteurClick3 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();
                repaint();
                finDePartie();
            }
        };
        bouton_diagSup.addActionListener(ecouteurClick3);
        PanneauBoutonDiagSup.add(bouton_diagSup);
        
        // création du panneau du bouton diagonale inférieure        
            PanneauBoutonDiagInf.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonDiagInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

        JButton bouton_diagInf = new JButton();
        ActionListener ecouteurClick4 = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
                repaint();
                finDePartie();
            }
        };
        bouton_diagInf.addActionListener(ecouteurClick4);
        PanneauBoutonDiagInf.add(bouton_diagInf);
    }
    
    public int getTailleGrille() {
    return tailleGrille;
    }
    
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(7);
    }
    
    public void finDePartie(){
        if (grille.cellulesToutesEteintes() == true){
            btnLigne0.setEnabled(false);
            btnLigne1.setEnabled(false);
            btnLigne2.setEnabled(false);
            btnLigne3.setEnabled(false);       
            btnLigne4.setEnabled(false);
            btnLigne5.setEnabled(false);
            btnLigne6.setEnabled(false);
            btnLigne7.setEnabled(false);                                   
            btnColonne0.setEnabled(false);
            btnColonne1.setEnabled(false);                                      
            btnColonne2.setEnabled(false);                                           
            btnColonne3.setEnabled(false);                                      
            btnColonne4.setEnabled(false);                                       
            btnColonne5.setEnabled(false);
            btnColonne6.setEnabled(false);
            btnColonne7.setEnabled(false);
            btnDiagInf.setEnabled(false);
            btnDiagSup.setEnabled(false);
            FenetreVictoire f = new FenetreVictoire();
            f.setVisible(true);
            dispose();
        }else if (grille.CellulesToutesAllumees() == true){
            btnLigne0.setEnabled(false);
            btnLigne1.setEnabled(false);
            btnLigne2.setEnabled(false);
            btnLigne3.setEnabled(false);       
            btnLigne4.setEnabled(false);
            btnLigne5.setEnabled(false);
            btnLigne6.setEnabled(false);
            btnLigne7.setEnabled(false);                                   
            btnColonne0.setEnabled(false);
            btnColonne1.setEnabled(false);                                      
            btnColonne2.setEnabled(false);                                           
            btnColonne3.setEnabled(false);                                      
            btnColonne4.setEnabled(false);                                       
            btnColonne5.setEnabled(false);
            btnColonne6.setEnabled(false);
            btnColonne7.setEnabled(false);
            btnDiagInf.setEnabled(false);
            btnDiagSup.setEnabled(false);
            FenetreVictoire f = new FenetreVictoire();
            f.setVisible(true);
            dispose();
        }else if (grille.CellulesToutesInter() == true){
            btnLigne0.setEnabled(false);
            btnLigne1.setEnabled(false);
            btnLigne2.setEnabled(false);
            btnLigne3.setEnabled(false);       
            btnLigne4.setEnabled(false);
            btnLigne5.setEnabled(false);
            btnLigne6.setEnabled(false);
            btnLigne7.setEnabled(false);                                   
            btnColonne0.setEnabled(false);
            btnColonne1.setEnabled(false);                                      
            btnColonne2.setEnabled(false);                                           
            btnColonne3.setEnabled(false);                                      
            btnColonne4.setEnabled(false);                                       
            btnColonne5.setEnabled(false);
            btnColonne6.setEnabled(false);
            btnColonne7.setEnabled(false);
            btnDiagInf.setEnabled(false);
            btnDiagSup.setEnabled(false);        
            FenetreVictoire f = new FenetreVictoire();
            f.setVisible(true);
            dispose();
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        btnLigne7 = new javax.swing.JButton();
        btnLigne6 = new javax.swing.JButton();
        btnLigne5 = new javax.swing.JButton();
        btnLigne4 = new javax.swing.JButton();
        btnLigne3 = new javax.swing.JButton();
        btnLigne2 = new javax.swing.JButton();
        btnLigne1 = new javax.swing.JButton();
        btnLigne0 = new javax.swing.JButton();
        btnColonne0 = new javax.swing.JButton();
        btnColonne2 = new javax.swing.JButton();
        btnColonne1 = new javax.swing.JButton();
        btnColonne3 = new javax.swing.JButton();
        btnColonne4 = new javax.swing.JButton();
        btnColonne5 = new javax.swing.JButton();
        btnColonne6 = new javax.swing.JButton();
        btnColonne7 = new javax.swing.JButton();
        btnDiagSup = new javax.swing.JButton();
        btnDiagInf = new javax.swing.JButton();
        PanneauBoutonDiagInf = new javax.swing.JPanel();
        PanneauBoutonDiagSup = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(10, 10));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 250));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 40, 300));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 270, 30));

        btnLigne7.setText("jButton1");
        btnLigne7.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne7.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne7.setName(""); // NOI18N
        btnLigne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne6.setText("jButton2");
        btnLigne6.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne6.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne6.setName(""); // NOI18N
        btnLigne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne5.setText("jButton3");
        btnLigne5.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne5.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne5.setName(""); // NOI18N
        btnLigne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne4.setText("jButton4");
        btnLigne4.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne4.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne4.setName(""); // NOI18N
        btnLigne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne3.setText("jButton5");
        btnLigne3.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne3.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne3.setName(""); // NOI18N
        btnLigne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne2.setText("jButton6");
        btnLigne2.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne2.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne2.setName(""); // NOI18N
        btnLigne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne1.setText("jButton7");
        btnLigne1.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne1.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne1.setName(""); // NOI18N
        btnLigne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnLigne0.setText("jButton8");
        btnLigne0.setMaximumSize(new java.awt.Dimension(10, 10));
        btnLigne0.setMinimumSize(new java.awt.Dimension(10, 10));
        btnLigne0.setName(""); // NOI18N
        btnLigne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLigne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne0.setText("jButton9");
        btnColonne0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne0, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, -1));

        btnColonne2.setText("jButton11");
        btnColonne2.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne2.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne2.setName(""); // NOI18N
        btnColonne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne1.setText("jButton12");
        btnColonne1.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne1.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne1.setName(""); // NOI18N
        btnColonne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne3.setText("jButton13");
        btnColonne3.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne3.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne3.setName(""); // NOI18N
        btnColonne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne4.setText("jButton14");
        btnColonne4.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne4.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne4.setName(""); // NOI18N
        btnColonne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne5.setText("jButton15");
        btnColonne5.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne5.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne5.setName(""); // NOI18N
        btnColonne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne6.setText("jButton16");
        btnColonne6.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne6.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne6.setName(""); // NOI18N
        btnColonne6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnColonne7.setText("jButton17");
        btnColonne7.setMaximumSize(new java.awt.Dimension(10, 10));
        btnColonne7.setMinimumSize(new java.awt.Dimension(10, 10));
        btnColonne7.setName(""); // NOI18N
        btnColonne7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColonne7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnColonne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnDiagSup.setText("jButton18");
        btnDiagSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagSupActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        btnDiagInf.setText("jButton19");
        btnDiagInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagInfActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiagInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 20, 20));

        PanneauBoutonDiagInf.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout PanneauBoutonDiagInfLayout = new javax.swing.GroupLayout(PanneauBoutonDiagInf);
        PanneauBoutonDiagInf.setLayout(PanneauBoutonDiagInfLayout);
        PanneauBoutonDiagInfLayout.setHorizontalGroup(
            PanneauBoutonDiagInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonDiagInfLayout.setVerticalGroup(
            PanneauBoutonDiagInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 50));

        PanneauBoutonDiagSup.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout PanneauBoutonDiagSupLayout = new javax.swing.GroupLayout(PanneauBoutonDiagSup);
        PanneauBoutonDiagSup.setLayout(PanneauBoutonDiagSupLayout);
        PanneauBoutonDiagSupLayout.setHorizontalGroup(
            PanneauBoutonDiagSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonDiagSupLayout.setVerticalGroup(
            PanneauBoutonDiagSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLigne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne7ActionPerformed
        this.grille.activerLigneDeCellules(7);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne7ActionPerformed

    private void btnLigne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne6ActionPerformed
        this.grille.activerLigneDeCellules(6);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne6ActionPerformed

    private void btnLigne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne5ActionPerformed
        this.grille.activerLigneDeCellules(5);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne5ActionPerformed

    private void btnLigne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne4ActionPerformed
        this.grille.activerLigneDeCellules(4);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne4ActionPerformed

    private void btnLigne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne3ActionPerformed
        this.grille.activerLigneDeCellules(3);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne3ActionPerformed

    private void btnLigne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne2ActionPerformed
        this.grille.activerLigneDeCellules(2);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne2ActionPerformed

    private void btnLigne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne1ActionPerformed
        this.grille.activerLigneDeCellules(1);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne1ActionPerformed

    private void btnLigne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigne0ActionPerformed
        this.grille.activerLigneDeCellules(0);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnLigne0ActionPerformed

    private void btnColonne0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne0ActionPerformed
        this.grille.activerColonneDeCellules(0);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne0ActionPerformed

    private void btnColonne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne2ActionPerformed
        this.grille.activerColonneDeCellules(2);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne2ActionPerformed

    private void btnColonne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne1ActionPerformed
        this.grille.activerColonneDeCellules(1);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne1ActionPerformed

    private void btnColonne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne3ActionPerformed
        this.grille.activerColonneDeCellules(3);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne3ActionPerformed

    private void btnColonne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne4ActionPerformed
        this.grille.activerColonneDeCellules(4);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne4ActionPerformed

    private void btnColonne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne5ActionPerformed
        this.grille.activerColonneDeCellules(5);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne5ActionPerformed

    private void btnColonne6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne6ActionPerformed
        this.grille.activerColonneDeCellules(6);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne6ActionPerformed

    private void btnColonne7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColonne7ActionPerformed
        this.grille.activerColonneDeCellules(7);
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnColonne7ActionPerformed

    private void btnDiagSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagSupActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnDiagSupActionPerformed

    private void btnDiagInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagInfActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        finDePartie();
    }//GEN-LAST:event_btnDiagInfActionPerformed

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
            java.util.logging.Logger.getLogger(FenetreMoyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreMoyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreMoyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreMoyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreMoyen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonDiagInf;
    private javax.swing.JPanel PanneauBoutonDiagSup;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton btnColonne0;
    private javax.swing.JButton btnColonne1;
    private javax.swing.JButton btnColonne2;
    private javax.swing.JButton btnColonne3;
    private javax.swing.JButton btnColonne4;
    private javax.swing.JButton btnColonne5;
    private javax.swing.JButton btnColonne6;
    private javax.swing.JButton btnColonne7;
    private javax.swing.JButton btnDiagInf;
    private javax.swing.JButton btnDiagSup;
    private javax.swing.JButton btnLigne0;
    private javax.swing.JButton btnLigne1;
    private javax.swing.JButton btnLigne2;
    private javax.swing.JButton btnLigne3;
    private javax.swing.JButton btnLigne4;
    private javax.swing.JButton btnLigne5;
    private javax.swing.JButton btnLigne6;
    private javax.swing.JButton btnLigne7;
    // End of variables declaration//GEN-END:variables
}
