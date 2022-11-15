/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.personnage;

/**
 *
 * @author Nina
 */
public class magicien extends personnage { /*herite de personnage*/
    public static int nbMagiciens = 0;
    boolean confirmé;
    
    
    public magicien(String unNom, int un_niveau_vie, boolean a) { /*initialisation des paramètres*/  
        /*creation d'un constructeur*/
        super(unNom, un_niveau_vie);
        this.confirmé = a;
        nbMagiciens++;
    }

    public boolean isConfirmé() {
        return confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        if (confirmé == true){
            return "magicien : nom : " + nom + ", niveau de vie = " + niveau_vie + ", " + "confirmé";
        } else {
            return "magicien : nom : " + nom + ", niveua de vie = " + niveau_vie + ", " + "novice";
        }
    }
    
}
