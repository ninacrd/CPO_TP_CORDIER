/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_cordier;

/**
 *
 * @author Nina
 */
public class BouteilleBiere { /*nouvelle classe cree*/
    String nom; /*ajout des attributs sous leurs formes respectives*/
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() { /*affiche les informations contenues sur  
        l'etiquette de la bouteille de biere*/
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie ) ;
    }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        /*creation d'un constructeur*/
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public boolean Décapsuler(){ /*creation d'une nouvelle methode*/
        if (ouverte == false) {
            ouverte = true;
        }
        else {
            System.out.println("erreur : biere déjà ouverte");
            ouverte = false;
        }
        return ouverte;
    }    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}
