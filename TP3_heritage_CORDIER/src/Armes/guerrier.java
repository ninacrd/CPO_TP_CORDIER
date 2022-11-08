/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Nina
 */
public class guerrier extends personnage { /*herite de personnage*/
    boolean cheval;
    
    public guerrier(String unNom, int un_niveau_vie, boolean b) { /*initialisation des paramètres*/  
        /*creation d'un constructeur*/
        nom = unNom;
        niveau_vie = un_niveau_vie;
        cheval = b;
    }
}
