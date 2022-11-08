/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_cordier;

/**
 *
 * @author Nina
 */
public class armes { /*creation de la classe arme*/
    String nom;
    int niveau_attaque;
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        String chaine_a_retourner;
        chaine_a_retourner = "L'arme " + nom + "a un niveau d'attaque de " + niveau_attaque;
        if (niveau_attaque <= 100 ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}
