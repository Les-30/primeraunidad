/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_formula_distancia;

import java.util.Scanner;

/**
 *
 * @author Leslie peña hernandez. 18550680
 */
public class EVA1_8_FORMULA_DISTANCIA {

    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teclea la velocidad inicial");
       double vinicial;
       
       vinicial = input.nextDouble();
       System.out.println("Teclea la velociada final");
       double vfinal;
       vfinal = input.nextDouble();
       System.out.println("Teclea el tiempo");
       double tiempo;
       tiempo = input.nextDouble();
       double dist;
       dist = ((vfinal + vinicial) / 2) * tiempo;
       System.out.println("La distancia es: " + dist);



    }
    
}
