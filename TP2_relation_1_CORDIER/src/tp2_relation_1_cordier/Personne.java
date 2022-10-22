/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_cordier;

/**
 *
 * @author Nina
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne(String unprenom, String unnom) {
        nom = unnom;
        prenom = unprenom;
        liste_voitures = new Voiture[3];
        
        /* question 7 */
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "\nnom : " + nom + "\nprenom : " + prenom;
        return chaine_a_retourner ; 
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    // … a completer
    }
    
    /* question 10 */
    
}
