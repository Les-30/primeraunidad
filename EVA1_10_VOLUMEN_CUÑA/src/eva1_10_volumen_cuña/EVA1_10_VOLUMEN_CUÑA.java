/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_volumen_cuña;

import java.util.Scanner;

/**
 *
 * @author Leslie peña hernandez. 18550680.
 */
public class EVA1_10_VOLUMEN_CUÑA {
    private static Scanner input = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teclea los grados");
        double grados;
        grados = input.nextDouble();
        
        System.out.println("Teclea el radio");
        double radio;
        radio = input.nextDouble();
        double vol;
        
        vol = (((4/3) * (3.14 * (radio*radio*radio)) / 360) * grados);
        System.out.println("El volumen es: " + vol);
    }
    
}
