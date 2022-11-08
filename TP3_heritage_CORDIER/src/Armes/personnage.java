/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Nina
 */
public class personnage {
    String nom;
    int niveau_vie;
    
    public personnage(String unNom, int un_niveau_vie) { /*initialisation des paramètres*/  
        /*creation d'un constructeur*/
        nom = unNom;
        niveau_vie = un_niveau_vie;
    }
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        String chaine_a_retourner;
        chaine_a_retourner = "nom : " + nom + "\nniveau de vie : " + niveau_vie;
        return chaine_a_retourner;
    }

}
