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
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
                
        /* question 5 */
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        /* question 4 : deux tartiflettes ont ete crees, assiette2 et assiette3 
        referencent la meme tartiflette */
        
        /* question 6 */        
        
        int Moussaka [] = new int[10];
        
        /* question 7 */
        
    }
    
}
