/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.armes;
import java.util.ArrayList;
import tp3_heritage_cordier.etreVivant;

/**
 *
 * @author Nina
 */
public class personnage implements etreVivant { /*implementation des méthodes de etreVivant*/
    public static int nbPersonnages = 0;
    String nom;
    int niveau_vie;
    ArrayList<armes> tableau = new ArrayList<armes>(); /*creation du tableau dynamique*/
    armes Arme_en_main; /*arme portée par le personnage*/
    
    public personnage(String unNom, int un_niveau_vie) { /*initialisation des paramètres*/  
        /*creation d'un constructeur*/
        nom = unNom;
        niveau_vie = un_niveau_vie;
        Arme_en_main = null; /*pas d'arme en main au départ*/
        nbPersonnages++;
    }
    
    public void ajouterarme (armes arme_a_ajouter){ /*un personnage peut posséder jusqu'à 5 armes*/
        if (tableau.size()<5) {
            tableau.add(arme_a_ajouter);
        }
    }
    
    public armes getArme_en_main() { /*ajour d'un getter, méthode sans paramètre 
        qui retourne une référence vers cette arme*/
        return Arme_en_main;
    }
    
    public void equiperarme (String nom_armes){
        for (int k = 0; k < tableau.size(); k++){
            if (tableau.get(k).getNom().equals("nom_armes")){
                Arme_en_main=tableau.get(k);
                System.out.println("l'arme a été trouvée et équipée");
            }
        }
    }
    
    String cdt; 
    
    @Override
    public String toString() { /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
        String chaine_a_retourner;
        chaine_a_retourner = "nom : " + nom + "\nniveau de vie : " + niveau_vie + "\n arme en main : " + Arme_en_main; 
        return chaine_a_retourner;
    }

    @Override
    public void seFatiguer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estVivant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void estAttaqué(int points) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
