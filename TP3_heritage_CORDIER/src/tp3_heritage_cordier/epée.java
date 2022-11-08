/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_cordier;

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
        chaine_a_retourner = "L'arme " + nom + " a un niveau d'attaque de " + niveau_attaque + " et un indice de finesse " + finesse; 
        return chaine_a_retourner;
    }
}
