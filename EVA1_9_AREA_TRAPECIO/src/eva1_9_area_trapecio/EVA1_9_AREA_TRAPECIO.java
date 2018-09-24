/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_area_trapecio;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA1_9_AREA_TRAPECIO {
    private static Scanner input = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teclea la base mayor");
        double Basemay;
        Basemay = input.nextDouble();
        
        System.out.println("teclea la mase menor");
        double basemen;
        basemen = input.nextDouble();
       
        System.out.println ("Teclea la altura");
        double altura;
        altura = input.nextDouble();
        
        double area;
        
        area = ((Basemay + basemen * altura)/2);
        System.out.println("El area de tu trapecio es: " + area);
        
        
        
    }
    
}
