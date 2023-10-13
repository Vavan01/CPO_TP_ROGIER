/*
ROGIER Evan
TDC
TP2
12/10/2023
 */
package tp2_manip_rogier;

/**
 *
 * @author Evan1204
 */
public class TP2_manip_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        //Une nouvelle tartiflette n'est pas crée. "assiette3" renvoie vers la même tartiflette que "assiette2".
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette() ;
        
        //Réponse : 
        //Ligne 1 : La ligne "Moussaka assiette666 = assiette1" est fausse car "assiette1" est de type Tartiflette, et non pas de type Moussaka. La référence objet déjà existante ne peut pas changer son type. 
        //ligne 2 : La ligne "Moussaka assiette667 = new Tartiflette()" est fausse car elle essaye de créer une référence objet de Tartiflette mais de type Moussaka.
        
        //Réponse :
        //Non, car le type de référence d'un objet est fixé dès sa déclaration et ne peut pas être changé par la suite.
        
        Tartiflette assiette = assiette1;//Création d'un objet "assiette" qui prend les données de "assiette1&
        assiette1 = assiette2; //"assiette1" prend les données de "assiette2"
        assiette2 = assiette; //Les données ont été inversées
        
        Moussaka[] assiettes = new Moussaka[10]; //Création d'un tableau de 10 référence de Moussaka
        for (int i = 0; i < assiettes.length; i++) {
        assiettes[i] = new Moussaka();
        
        //Réponse :
        //Oui, un objet peut-être un attribut d'un autre objet. On parle alors de compossitions d'objets. On peut donc modéliser des relations entre objets et ranger les données de manière hiérarchique.
    }
}   
}
