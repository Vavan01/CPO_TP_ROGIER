/*
ROGIER Evan
TDC
TP1
04/10/2023
 */
package tp1_guessmynumber_nom1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class TP1_guessMyNumber_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100); // Génère un nombre aléatoire n entre 0 et 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 0 et 100 :");
        int nb = sc.nextInt();
        int compteur = 0; // initialisation du compteur de tour de jeu
        while (nb != n) { // tant que nb est différent de n
            compteur = compteur + 1; // a chaque tout de boucle le compteur compte un tour de plus
            System.out.println("\nVous avez fait " +compteur+ " tours de jeu\n"); 
            if (nb < n) {
                System.out.println("Trop petit");
                System.out.println("Saisissez un nombre entre 0 et 100 :"); // propose à l'utilisateur de saisir une nouvelle valeur
                nb = sc.nextInt(); // nouvelle valeur de nb donnée par l'utilisateur

            } else if (nb > n) {
                System.out.println("Trop grand");
                System.out.println("Saisissez un nombre entre 0 et 100 :");
                nb = sc.nextInt(); // nouvelle valeur de nb donnée par l'utilisateur
                
            } else if (nb == n) {
            break; // quand la valeur recherchée est atteinte on sort diretctement de la boucle
        }
    }System.out.println("gagné !"); // l'affichage de "gagné" ne fonctionnait pas dans la boucle while. Le message ne voulait pas s'afficher
}
}
