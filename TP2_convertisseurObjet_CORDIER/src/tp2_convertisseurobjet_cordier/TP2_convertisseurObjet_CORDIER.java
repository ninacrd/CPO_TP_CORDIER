/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_cordier;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class TP2_convertisseurObjet_CORDIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperature; /*cree la variable temperature*/
        double indice; /*cree la variable indice qui va etre incluse dans notre menu*/
        double resultat; /*resultat de la temperature apres conversion*/
        Convertisseur conversion = new Convertisseur();
        
        Scanner sc; /*utilisation du scanner*/
        sc = new Scanner (System.in);
        System.out.println("Saisissez la valeur de la temperature :");
        temperature = sc.nextDouble(); /*insertion de la valeur*/
        System.out.println("Saisissez le numero de la conversion voulue : \n1) Celcius vers Kelvin \n2) Kelvin vers Celcius "
                + "\n3) Farenheit vers Celcius \n4) Celcius vers Farenheit \n5) Kelvin vers Farenheit \n6) Farenheit vers Kelvin ");
        /*creation des indices correspondant aux conversions possibles*/
        indice = sc.nextDouble(); /*insertion du numero de la conversion voulue*/
        
        if (indice==1) { /*si on a choisi la conversion n1*/
            resultat = conversion.CelciusVersKelvin(temperature); /*converti la valeur entree*/
            System.out.println(resultat + " Kelvin"); /*affiche le resultat*/
        }
        else if (indice==2) {
            resultat = conversion.KelvinVersCelcius(temperature);
            System.out.println(resultat + " Celcius");
        }
        else if (indice==3) {
            resultat = conversion.FarenheitVersCelcius(temperature);
            System.out.println(resultat + " Celcius");
        }
        else if (indice==4) {
            resultat = conversion.CelciusVersFarenheit(temperature);
            System.out.println(resultat + " Farenheit");
        }
        else if (indice==5) {
            resultat = conversion.KelvinVersFarenheit(temperature);
            System.out.println(resultat + " Farenheit");
        }
        else if (indice==6) {
            resultat = conversion.FarenheitVersKelvin(temperature);
            System.out.println(resultat + " Kelvin");
        }
    }
    
}
