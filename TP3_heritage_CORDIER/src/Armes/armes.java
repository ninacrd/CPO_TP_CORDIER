/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Nina
 */
public class armes { /*creation de la classe arme*/
    String nom;
    int niveau_attaque;
    int attaque;
    
    public armes(String unNom, int un_niveau_attaque) {
        /*creation d'un constructeur*/
        nom = unNom;
        niveau_attaque = un_niveau_attaque;
    }
    
    public void setAttaque(int attaque) {
        if (attaque > 0) {
            this.attaque = attaque;
        }
    }

    public String getNom() {
        return nom;
    }
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        return "Arme :" + " nom = " + nom + ", attaque = " + attaque;
    }
}
