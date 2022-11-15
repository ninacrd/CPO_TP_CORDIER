/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_cordier;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;

/**
 *
 * @author Nina
 */
public class TP3_heritage_CORDIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        armes arme1 = new armes("Excalibur", 10) ; /*tests*/
        arme1.setAttaque(120);
            System.out.println(arme1) ;
            
        epée epee1 = new epée("Excalibur", 7,5) ;
            System.out.println(epee1) ;
        epée epee2 = new epée("Durandal",4,7);
            System.out.println(epee2) ;
        epée epee3 = new epée("acier",8,2);
            System.out.println(epee3);
            
        baton baton1 = new baton("Chêne", 4,5) ;
            System.out.println(baton1) ;
        baton baton2 = new baton("Charme", 5,6) ;
            System.out.println(baton2) ;
        baton baton3 = new baton("Bois",2,8);
            System.out.println(baton3);
            
        ArrayList <armes> nom_armes = new ArrayList <armes>(); /*creation du tableau dynamique*/
        nom_armes.add(epee1);
        nom_armes.add(epee2);
        nom_armes.add(baton1);
        nom_armes.add(baton2);
        
        int taille = nom_armes.size();
        int longueur = taille-1;
        for (int i = 0; i<longueur; i++){
            System.out.print(nom_armes.get(i)+", ");
        }
        
        System.out.println(nom_armes.get(taille-1));
        
        magicien magicien1 = new magicien("Gandalf", 65, true);
        magicien1.setConfirmé(true);
        System.out.println(magicien1) ;

        magicien magicien2 = new magicien("Garcimore", 55, false);
        magicien1.setConfirmé(false);
        System.out.println(magicien2) ;

        guerrier guerrier1 = new guerrier("Conan", 78, false);
        magicien1.setConfirmé(false);
        System.out.println(guerrier1) ;
        
        guerrier guerrier2 = new guerrier("Lannister", 45, true);
        magicien1.setConfirmé(true);
        System.out.println(guerrier2) ;
        
        ArrayList <personnage> nom_personnage = new ArrayList <personnage>(); /*creation du tableau dynamique*/
        nom_personnage.add(magicien1);
        nom_personnage.add(magicien2);
        nom_personnage.add(guerrier1);
        nom_personnage.add(guerrier2);
        
        taille = nom_personnage.size();
        longueur = taille-1;
        for (int i = 0; i<longueur; i++){
            System.out.print(nom_personnage.get(i)+", ");
        }
        
        System.out.println(nom_personnage.get(taille-1));
    
    
    guerrier1.ajouterarme(baton1);
    guerrier1.ajouterarme(epee1);
    guerrier1.ajouterarme(epee2);
    
    magicien1.ajouterarme(baton2);
    magicien1.ajouterarme(baton3);
    magicien1.ajouterarme(epee3);
    
    guerrier1.equiperarme("Excalibur");
        
    }
}
