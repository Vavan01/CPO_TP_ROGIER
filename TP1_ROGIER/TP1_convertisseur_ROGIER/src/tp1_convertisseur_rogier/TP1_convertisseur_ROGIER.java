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
        System.out.println("\n Bonjour, saisissez une valeur :");
        double nb = sc.nextDouble(); // utilisation du type Double
        double valeur = nb;
        System.out.println(valeur);
        System.out.println("\n Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Fahrenheit vers Celcius \n4) De Celcius vers Fahrenheit \n5)De Kelvin vers Fahrenheit \n6) De Farenheit vers Kelvin");
        int nb2 = sc.nextInt (); // attend une nouvelle valeur de l'utilisateur
        if (nb2 == 1) { // utilisation de if et else if pour comparer la valuer de nb2
            System.out.println(valeur+ " degres Celcius est egal a " + CelciusVersKelvin(valeur) + " degre Kelvin");  
        } else if (nb2 == 2) {
            System.out.println(valeur+ " degres Kelvin est egal a " + KelvinVersCelcius(valeur) + " degre Celcius");
        } else if (nb2 == 3) {
            System.out.println(valeur+ " degres Fahrenheit est egal a " + FahrenheitVersCelcius(valeur) + " degre Celcius");        
        } else if (nb2 == 4) {
            System.out.println(valeur+ " degres Celsius est egal a " + CelciusVersFahrenheit(valeur) + " degre Fahrenheit");
        } else if (nb2 == 5) {
        System.out.println(valeur+ " degres Kelvin est egal a " + KelvinVersFahrenheit(valeur) + " degre Fahrenheit");
        } else if (nb2 ==6) {
        System.out.println(valeur+ "degres Fahrenheit est egal a " + fahrenheitVersKelvin(valeur) + " degre Kelvin");
        } else if (nb2 < 1 || nb2 > 6) { // exclu les valeurs autres que 1, 2, 3, 4, 5 et 6
        System.out.println("Saisissez un entier comprise entre 1 et 6 ");
        }
}
    

    
    // Conversion de Celsius en Kelvin 
    public static double CelciusVersKelvin (double tCelcius) {
        return tCelcius + 273.15;
    }
    
    // Conversion de Kelvin en Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Conversion de Fahrenheit en Celsius
    public static double FahrenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Conversion de Celsius en Fahrenheit
    public static double CelciusVersFahrenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Conversion de Kelvin en Fahrenheit
    public static double KelvinVersFahrenheit(double tKelvin) {
        return (tKelvin - 273.15) * 9 / 5 + 32;
    }

    // Conversion de Fahrenheit en Kelvin
    public static double fahrenheitVersKelvin(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9 + 273.15;
    }
}
