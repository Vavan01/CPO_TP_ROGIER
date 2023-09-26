/*
 ROGIER Evan
TDC
TP1
26/09/2023
 */
package tp1_manipnombresint_rogier;

import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class TP1_manipNombresInt_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisissez l'entier 1 :");
        int nb = sc.nextInt(); //on demande à l'utilisateur de donner un 1er entier
        int entier1 = nb; // initialisation de entier1 et affectation en une ligne
        System.out.println("\n Saisissez l'entier 2 :");
        int nb2 = sc.nextInt(); //on demande à l'utilisateur de donner un 2e entier 
        int entier2 = nb2;
        System.out.println(entier1);
        System.out.println(entier2);
        System.out.println("la somme est : "+(entier1+entier2)+" ; la difference est : "+(entier1-entier2)+" ; le produit est : "+ (entier1*entier2)); //toutes les opérations sont compilés en une seule ligne, et pour différencier les "+" de concaténation, les opérations sont séparées par des parenthèses
        System.out.println("le quotien est : " +(entier1/entier2)+ " ; le reste de "+entier1+" par "+entier2+" est : "+(entier1%entier2)); //même méthode que pour le print précédent
    }
}