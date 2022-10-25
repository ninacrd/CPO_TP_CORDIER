/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_cordier;

/**
 *
 * @author Nina
 */
public class Personne { /*creation d'une nouvelle classe*/
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne(String unprenom, String unnom) {
        nom = unnom;
        prenom = unprenom;
        liste_voitures = new Voiture[3]; /*creation du tableau*/    
        
    }
    
    @Override
    public String toString() { /*methode similaire aux autres exos*/
        String chaine_a_retourner;
        chaine_a_retourner = "\nnom : " + nom + "\nprenom : " + prenom + 
        "\nnombre de voitures : " + nbVoitures;
        return chaine_a_retourner ; 
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire!=null){  
            System.out.println(voiture_a_ajouter + "déjà prise");
            return false;
        }
        else {
            if (this.nbVoitures == 3){
                System.out.println(this.nom + this.prenom+ "a déjà 3 voitures");
                return false;
            }
        
            else {
                this.liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.Proprietaire = this  ;
                return true;
                }
    }
    
    }
}
