/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_cordier;

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
            System.out.println(arme1) ;
            
        epée epee1 = new epée("Excalibur", 7,5) ;
            System.out.println(epee1) ;
        epée epee2 = new epée("Durandal",4,7);
            System.out.println(epee2) ;
            
        baton baton1 = new baton("Chêne", 4,5) ;
            System.out.println(baton1) ;
        baton baton2 = new baton("Charme", 5,6) ;
            System.out.println(baton2) ;

    }
    
}