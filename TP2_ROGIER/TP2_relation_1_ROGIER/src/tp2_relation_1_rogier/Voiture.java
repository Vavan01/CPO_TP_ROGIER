/*
ROGIER Evan
TDC
TP2
13/10/2023
 */
package tp2_relation_1_rogier;

/**
 *
 * @author Evan1204
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire; //ajout de l'attribut Proprietaire

    public Voiture(String Modele, String Marque, int PuissanceCV) { //Constructeur
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire = null; //Le mot clé null définit une référence nulle, c'est-à-dire ne désignant aucun objet en mémoire.
}
    @Override
    public String toString() {
        return Modele + " " + Marque + PuissanceCV + " "; //toString
    }
}
