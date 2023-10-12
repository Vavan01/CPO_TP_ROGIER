/*
ROGIER Evan
TDC
TP2
12/10/2023
 */
package tp2_convertisseurobjet_rogier;

/**
 *
 * @author Evan1204
 */
public class Convertisseur {
    int nbConversions;

//Convertisseur
    public Convertisseur () {
 nbConversions = 0;
} 
    
// Conversion de Celsius en Kelvin 
    public double CelciusVersKelvin (double tCelcius) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return tCelcius + 273.15;
    }
    
    // Conversion de Kelvin en Celsius
    public double KelvinVersCelcius(double tKelvin) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return tKelvin - 273.15;
    }

    // Conversion de Fahrenheit en Celsius
    public double FahrenheitVersCelcius(double tFahrenheit) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Conversion de Celsius en Fahrenheit
    public double CelciusVersFahrenheit(double tCelcius) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return (tCelcius * 9 / 5) + 32;
    }

    // Conversion de Kelvin en Fahrenheit
    public double KelvinVersFahrenheit(double tKelvin) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return (tKelvin - 273.15) * 9 / 5 + 32;
    }

    // Conversion de Fahrenheit en Kelvin
    public double fahrenheitVersKelvin(double tFahrenheit) {
        nbConversions += 1; //incrémentation de +1 à nbConversions à chaque utilisation de la méthode
        return (tFahrenheit - 32) * 5 / 9 + 273.15;
    }
    
    @Override
public String toString () {
return "nb de conversions "+ nbConversions; //renvoie nbConversions incrémenté de +1 en fonction du nombre d'utilisation de méthodes
}
}    
