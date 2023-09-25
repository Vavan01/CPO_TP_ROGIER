/*
 ROGIER Evan
TDC
TP0
25/09/2023
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Please enter the operator: \n1) add \n2) substract \n3) multiply \n3) divide \n3) modulo");
        int nb;
        int nb1;
        int nb2;
        double resultat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier
        int operateur = nb;
        System.out.println("\n Entrer le nombre 1 :");
        nb1 = sc.nextInt();
        int operande1 = nb1;
        System.out.println("\n Entrer le nombre 2 :");
        nb2 = sc.nextInt();
        int operande2 = nb2;
        
        if (operateur == 1) {
            resultat = operande1 + operande2;
       
        } else if (operateur == 2) {      
            resultat = operande1 - operande2;
       
        } else if (operateur == 3) {
            resultat = operande1 * operande2;
       
        } else if (operateur == 4) {
            resultat = operande1 / operande2;
       
        } else if (operateur == 5) {
            resultat = operande1 % operande2;
            
        } else if (operateur <1 & operateur >5) {
            System.out.println("\n Erreur, cela doit être compris entre 1 et 5");
        }System.out.println("le résultat est :"+resultat);
    }
}