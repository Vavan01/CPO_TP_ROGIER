/*
ROGIER Evan
TDC
TP2
18/10/2023
 */
package Personnage;

/**
 *
 * @author Evan1204
 */
public class Guerrier extends Personnage {
    boolean A_cheval;
    static int nb_de_Guerrier;
    
    public Guerrier(boolean A_cheval, String nom, int PV) {
        super(nom, PV);
        this.A_cheval = A_cheval;
        nb_de_Guerrier++;
        if (A_cheval == true){
        System.out.println("Le guerrier " +nom+ " est à cheval");
    }else {
        System.out.println("Le guerrier " +nom+ " est à pied");      
    }
}

    public void setA_cheval(boolean A_cheval) {
        this.A_cheval = A_cheval;
    }
    
    public void finalize(){
        nb_de_Guerrier = nb_de_Guerrier-1;
    }
}
