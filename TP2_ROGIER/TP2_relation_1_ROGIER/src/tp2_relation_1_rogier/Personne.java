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
        //test de l’attribut proprietaire de la voiture passée (null ou pas).
        if (voiture_a_ajouter.Proprietaire != null){
            System.out.println("la voiture a déjà un propriétaire");
            return false;
        //Si le propriétaire a déjà 3 voitures, return false.
        }if (nbVoitures >= 3){
            return false;
        //Sinon on ajoute une ou plusieurs voitures.
        } else {
            nbVoitures += 1;
            liste_voitures[nbVoitures] = voiture_a_ajouter;
            voiture_a_ajouter.Proprietaire = this ;
            return true;
        }
}

    @Override
    public String toString() { //toString
        return nom + " " + prenom + " ";
    }
}
