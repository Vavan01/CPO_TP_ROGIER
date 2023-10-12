/*
ROGIER Evan
TDC
TP2
12/10/2023
 */
package tp2_bieres_rogier;

/**
 *
 * @author Evan1204
 */
class BouteilleBiere {
    String nom; //le nom de la bière 
    double degreAlcool; //son degré d’alcool (changement du type de variable) 
    String brasserie; //le nom de brasserie qui la produit 
    boolean ouverte; //si la bouteille a été ouverte (la valeur de ouverte sera à vrai), ou non (la valeur de ouverte sera à faux)
    
    
   public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
   }

  public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //changement du type de variable (float ==> double) 
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = true;
  }
   public boolean Décapsuleur() { //Création de la méthode décapsuleur
        if (ouverte == false) {
            return ouverte = true; // changement de la valeur de "ouverte"
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }
   
   @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés)ouverte ?" ;
if (ouverte == true ) chaine_a_retourner += " oui" ;
else chaine_a_retourner += " non" ;
return chaine_a_retourner ;
}
}




