/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_cordier;

/**
 *
 * @author Nina
 */
public class TP2_BIERES_CORDIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();
    uneBiere.Décapsuler();
    
    BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
    uneBiere2.lireEtiquette();
    uneBiere2.Décapsuler();
    
    BouteilleBiere uneBiere3 = new BouteilleBiere("Heineken", 5 ,"Pélican") ;
    uneBiere3.lireEtiquette();
    uneBiere3.Décapsuler();
    
    BouteilleBiere uneBiere4 = new BouteilleBiere("Desperados", 5.9 ,"Fischer") ;
    uneBiere4.lireEtiquette();
    uneBiere4.Décapsuler();
    
    System.out.println(uneBiere) ;
    System.out.println(uneBiere2) ;
    System.out.println(uneBiere3) ;
    System.out.println(uneBiere4) ;
    
    boolean test;
    test = uneBiere.Décapsuler(); /* biere decapsulee plus tot donc pour 
    verifier que la fonction qui affiche erreur marche */
    System.out.println(uneBiere);
    }
}

