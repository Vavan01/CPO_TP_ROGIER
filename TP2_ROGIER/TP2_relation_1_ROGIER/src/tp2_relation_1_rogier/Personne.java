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
public class Personne {
    String nom;
    String prenom;
    int nbVoitures ; 
    Voiture [] liste_voitures; //ajout des attibuts "nbVoitures et "liste_voiture"

    
    public Personne(String nom, String prenom) { //Constructeur
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3] ;
        this.nbVoitures = 0;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter == Proprietaire){
            return false;
        } else {
            
        }
}

    @Override
    public String toString() { //toString
        return nom + " " + prenom + " ";
    }
}
