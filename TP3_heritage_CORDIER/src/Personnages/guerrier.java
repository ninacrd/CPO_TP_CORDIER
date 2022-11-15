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
public class guerrier extends personnage { /*herite de personnage*/
    public static int nbGuerrier = 0;
    boolean cheval;
    
    public guerrier(String unNom, int un_niveau_vie, boolean b) { /*initialisation des paramètres*/  
        super(unNom, un_niveau_vie);
        /*creation d'un constructeur*/
        this.cheval = b;
        nbGuerrier ++;
    }

    public boolean isCheval() {
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        if (cheval == true){
            return "guerrier : nom : " + nom + ", niveau de vie : " + niveau_vie + ", " + "cheval";
        } else {
            return "guerrier : nom : " + nom + ", niveau de vie : " + niveau_vie + ", " + "à pied";
        }
    }
}
