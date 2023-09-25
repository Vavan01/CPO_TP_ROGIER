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
        int nb1; // nombre dentiers a additionner
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb1 = sc.nextInt(); // On demande a sc de donner le prochain entier
        int operateur = nb1;
        int nb3; // nombre dentiers a additionner
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb2 = sc.nextInt(); // On demande a sc de donner le prochain entier
        int operateur = nb2;
    }
}