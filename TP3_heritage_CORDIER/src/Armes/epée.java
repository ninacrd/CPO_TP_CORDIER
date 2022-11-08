/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.armes;

/**
 *
 * @author Nina
 */
public class epée extends armes {
    int finesse;
    
    public epée(String unNom, int un_niveau_attaque, int une_finesse) {
        /*creation d'un constructeur*/
        super (unNom, un_niveau_attaque);
        finesse = une_finesse;
    }
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        String chaine_a_retourner;
        chaine_a_retourner = "arme : " + nom + "\nniveau d'attaque de : " + niveau_attaque + "\nindice de finesse : " + finesse; 
        return chaine_a_retourner;
    }
}
