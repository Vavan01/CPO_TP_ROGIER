/*
 ROGIER Evan
TDC
TP1
26/09/2023
 */

package tp1_convertisseur_rogier;

import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class TP1_convertisseur_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //même base que dans les TP0 et TP1
        System.out.println("\n Saisissez une valeur reel :");
        double nb = sc.nextDouble(); // utilisation du type Double
        double valeur = nb;
        System.out.println(valeur);
        double K;
        K = valeur + 273.15;
        System.out.println("la température en Kelvin est "+K);
    }
public static double CelciusVersKelvin (double tCelcius) {
    … // à completer
    }

