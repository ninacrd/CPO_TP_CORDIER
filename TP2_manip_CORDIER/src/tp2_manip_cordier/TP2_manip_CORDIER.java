/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_cordier;

/**
 *
 * @author Nina
 */
public class TP2_manip_CORDIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500); /*creation d'une tartiflette*/
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
                
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        /*pour afficher le nombre de calories des tartiflettes crees*/
        /* question 4 : deux tartiflettes ont ete crees, assiette2 et assiette3 
        referencent la meme tartiflette */
        
        assiette2 = assiette1;
        assiette1 = assiette3;
        /* question 6 */        
        
        Moussaka [] tab = new Moussaka[10]; /*creation d'un tableau de 10 
        references de Moussaka*/
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka (100*(1+i));
            if (i == tab.length-1){
                System.out.println(tab[i]);
            }
            else {
                System.out.println(tab[i]);
            }
        }
                
    }
    
}
