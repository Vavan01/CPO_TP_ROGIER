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
public class TP2_relation_1_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("\nla premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        bob.liste_voitures[0] = une2008 ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        reno.liste_voitures[0] = uneClio ;
        reno.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        reno.liste_voitures[0] = une2008 ;
        reno.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[0] ) ;
        
        
}
}

//        Voiture uneClio = new Voiture("Clio", "Renault", 5);
//        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
//        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
//        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
//
//        Personne bob = new Personne("Bobby", "Sixkiller");
//        Personne reno = new Personne("Reno", "Raines");
//
//        bob.ajouter_voiture(uneClio);
//        bob.ajouter_voiture(uneAutreClio);
//        reno.ajouter_voiture(une2008);
//        reno.ajouter_voiture(uneMicra);
//
//        System.out.println("Bob possède les voitures :");
//        for (int i = 0; i < bob.nbVoitures; i++) {
//            System.out.println(bob.liste_voitures[i]);
//        }
//
//        System.out.println("Reno possède les voitures :");
//        for (int i = 0; i < reno.nbVoitures; i++) {
//            System.out.println(reno.liste_voitures[i]);
//        }
//    }