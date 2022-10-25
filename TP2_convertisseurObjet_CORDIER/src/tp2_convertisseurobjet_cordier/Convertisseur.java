/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_cordier;

/**
 *
 * @author Nina
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur() {
        int nbConversions = 0;        
    }
    
    /**
     *
     * @return
     */
    
    public double CelciusVersKelvin (double tcelcius) {
        /*creation de la variable qui va convertir la temperature dans l'unite 
        voulue*/
        double tKelvin = tcelcius + 273.15; /*ajoute 273.15 pour passer de 
        celcius a kelvin*/
        nbConversions += 1; /*ajoute 1 au nombre de conversions effectuees*/
        return tKelvin;
    }
    
    
    public double KelvinVersCelcius(double tkelvin){

        double tcelcius = tkelvin - 273.15;
        nbConversions +=1 ;
        return tcelcius;
        
    }
    
    
    public double FarenheitVersCelcius(double tfarenheit){

        double tcelcius = (tfarenheit - 32) / 1.8;
        nbConversions +=1;
        return tcelcius;

    }


    public double CelciusVersFarenheit(double tcelcius){

        double tfarenheit = (tcelcius * 1.8) + 32;
        nbConversions +=1;
        return tfarenheit;
        
    }
    
    
    public double KelvinVersFarenheit(double tkelvin){

        double tfarenheit = CelciusVersFarenheit(KelvinVersCelcius(tkelvin));
        nbConversions +=1;
        return tfarenheit;
        
    }
    
    
    public double FarenheitVersKelvin(double tfarenheit){

        double tkelvin = CelciusVersKelvin(FarenheitVersCelcius(tfarenheit));
        nbConversions +=1;
        return tkelvin;
        
    }
    @Override
    public String toString () {
    return "le nombre de conversions est : "+ nbConversions;
    } 
}
