/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_cordier;

/**
 *
 * @author Nina
 */
public class Moussaka { /*nouvelle classe cree*/
    int nbCalories;
    public Moussaka(int NbCalories) { /*constructeur qui analyse l'attribut nbCalories*/
        nbCalories = NbCalories;
    }
    
    @Override
    public String toString() { 
        return String.valueOf(nbCalories);
        /*methode qui permet de retourner la chaine de 
        caractere que l'on veut afficher quand l'objet est cree*/
    }
} 
