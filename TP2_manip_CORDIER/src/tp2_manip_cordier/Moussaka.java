/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_cordier;

/**
 *
 * @author Nina
 */
public class Moussaka {
    int nbCalories;
    public Moussaka(int NbCalories) {
        nbCalories = NbCalories;
    }
    
    @Override
    public String toString() {
        return String.valueOf(nbCalories);
    }
} 
