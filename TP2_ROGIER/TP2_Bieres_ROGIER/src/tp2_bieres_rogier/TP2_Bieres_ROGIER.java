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
public class TP2_Bieres_ROGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BouteilleBiere uneBiere = new BouteilleBiere() ; // création de la référence objet uneBiere
//        uneBiere.nom = "Cuvée des trolls";
//        uneBiere.degreAlcool = 7.0; //changement du type de variable (float ==> double)
//        uneBiere.brasserie = "Dubuisson";
//        uneBiere.ouverte = true; // La bière est considérée comme ouverte
//        uneBiere.lireEtiquette();
//       
//        BouteilleBiere uneDeuxiemeBiere = new BouteilleBiere(); //création de la deuxième référence objet uneDeuxièmeBiere
//        uneBiere.nom = " Leffe";
//        uneBiere.degreAlcool = 6.6;
//        uneBiere.brasserie = "Abbaye de Leffe";
//        uneBiere.ouverte = true; //pas précisé dans l'énoncé mais consédérons la biere comme ouverte
//        uneBiere.lireEtiquette();
    
//        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
//        uneBiere.ouvrirBiere();
//        uneBiere.lireEtiquette();
//        BouteilleBiere uneDeuxiemeBiere = new BouteilleBiere("Leffe Ruby",5.0 ,"Abbaye de Leffe") ;
//        uneBiere.ouvrirBiere();
//        uneDeuxiemeBiere.lireEtiquette();
//        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("John Bull",5.0 ,"Ind coope Ltd") ;
//        uneBiere.ouvrirBiere();
//        uneTroisiemeBiere.lireEtiquette();
//        BouteilleBiere uneDernièreBierePourLaRoute = new BouteilleBiere("Jeune gueule blonde",4.5 ,"La Brasserie Guyanaise") ;
//        uneBiere.ouvrirBiere();
//        uneDernièreBierePourLaRoute.lireEtiquette();
       
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        System.out.println(uneBiere) ;
        BouteilleBiere uneDeuxiemeBiere = new BouteilleBiere("Leffe Ruby",5.0 ,"Abbaye de Leffe") ;        
        System.out.println(uneDeuxiemeBiere) ;
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("John Bull",5.0 ,"Ind coope Ltd") ;
        System.out.println(uneTroisiemeBiere) ;
        BouteilleBiere uneDernièreBierePourLaRoute = new BouteilleBiere("Jeune gueule blonde",4.5 ,"La Brasserie Guyanaise") ;
        System.out.println(uneDernièreBierePourLaRoute) ;       
    }  
}
