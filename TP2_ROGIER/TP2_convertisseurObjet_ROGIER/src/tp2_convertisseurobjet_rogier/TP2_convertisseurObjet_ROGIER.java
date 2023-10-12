/*
 ROGIER Evan
TDC
TP2
12/10/2023
 */
package tp2_convertisseurobjet_rogier;

import java.util.Scanner;

/**
 *
 * @author Evan1204
 */
public class TP2_convertisseurObjet_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Référence objet 1 :
        Convertisseur Convert1 = new Convertisseur();
        Convert1.CelciusVersFahrenheit(34);
        Convert1.FahrenheitVersCelcius(23);
        Convert1.KelvinVersFahrenheit(100);
        System.out.println(Convert1);
        
        //Référence objet 2 :
        Convertisseur Convert2 = new Convertisseur();
        Convert2.KelvinVersCelcius(56);
        Convert2.CelciusVersFahrenheit(2);
        Convert2.KelvinVersFahrenheit(300);
        System.out.println(Convert2);
       
        Scanner sc = new Scanner(System.in); //même base que dans les TP0 et TP1
        System.out.println("\n Bonjour, saisissez une valeur :");
        double nb = sc.nextDouble(); // utilisation du type Double
        double valeur = nb;
        System.out.println(valeur);
        System.out.println("\n Saisissez la conversion que vous souhaiter effectuer : \nDe Celcius vers Kelvin, taper (1) \nDe Kelvin vers Celcius, taper(2) \nDe Fahrenheit vers Celcius, taper (3) \nDe Celcius vers Fahrenheit, taper (4) \nDe Kelvin vers Fahrenheit, taper (5) \nDe Farenheit vers Kelvin, taper (6)");
        int nb2 = sc.nextInt (); // attend une nouvelle valeur de l'utilisateur
        
        if (nb2 == 1) { // utilisation de if et else if pour comparer la valuer de nb2
            Convertisseur ConvertCelciusVersKelvin = new Convertisseur();
            ConvertCelciusVersKelvin.CelciusVersKelvin(valeur);
            double kelvin1 = ConvertCelciusVersKelvin.CelciusVersKelvin(valeur);
            System.out.println(valeur+ " degre(s) Celcius est egal a " + kelvin1 + " degre(s) Kelvin");
        } else if (nb2 == 2) {
            Convertisseur ConvertKelvinVersCelcius = new Convertisseur();
            ConvertKelvinVersCelcius.KelvinVersCelcius(valeur);
            double celcius1 = ConvertKelvinVersCelcius.KelvinVersCelcius(valeur);
            System.out.println(valeur+ " degre(s) Kelvin est egal a " + celcius1 + " degre(s) Celcius)");            
        } else if (nb2 == 3) {
            Convertisseur ConvertFahrenheitVersCelcius = new Convertisseur();
            ConvertFahrenheitVersCelcius.FahrenheitVersCelcius(valeur);
            double celcius2 = ConvertFahrenheitVersCelcius.FahrenheitVersCelcius(valeur);
            System.out.println(valeur+ " degre(s) Fahrenheit est egal a " + celcius2 + " degre(s) Celcius)");            
        } else if (nb2 == 4) {
            Convertisseur ConvertCelciusVersFahrenheit = new Convertisseur();
            ConvertCelciusVersFahrenheit.CelciusVersFahrenheit(valeur);
            double fahrenheit1 = ConvertCelciusVersFahrenheit.CelciusVersFahrenheit(valeur);
            System.out.println(valeur+ " degre(s) Celcius est egal a " + fahrenheit1 + " degre(s) Fahrenheit)");            
        } else if (nb2 == 5) {
            Convertisseur ConvertKelvinVersFahrenheit = new Convertisseur();
            ConvertKelvinVersFahrenheit.KelvinVersFahrenheit(valeur);
            double fahrenheit2 = ConvertKelvinVersFahrenheit.KelvinVersFahrenheit(valeur);
            System.out.println(valeur+ " degre(s) Kelvin est egal a " + fahrenheit2 + " degre(s) Fahrenheit)");            
        } else if (nb2 ==6) {
            Convertisseur ConvertfahrenheitVersKelvin = new Convertisseur();
            ConvertfahrenheitVersKelvin.fahrenheitVersKelvin(valeur);
            double kelvin2 = ConvertfahrenheitVersKelvin.fahrenheitVersKelvin(valeur);
            System.out.println(valeur+ " degre(s) Kelvin est egal a " + kelvin2 + " degre(s) Fahrenheit)");            
        } else if (nb2 < 1 || nb2 > 6) { // exclu les valeurs autres que 1, 2, 3, 4, 5 et 6
        System.out.println("Saisissez un entier comprise entre 1 et 6 ");
        }
}
}

