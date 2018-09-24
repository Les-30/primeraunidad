/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_pendiente;

import java.util.Scanner;

/**
 *
 * @author Leslie peña hernandez. 18550680.
 */
public class EVA1_12_PENDIENTE {
    private static Scanner input = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingresa el valor de Y2");
        double valory2;
        valory2 = input.nextDouble();
        
        System.out.println("Ingresa el valor de Y1");
        double valory1;
        valory1 = input.nextDouble();
        
        System.out.println("Ingresa el valor de X2");
        double valorx2;
        valorx2 = input.nextDouble();
        
        System.out.println("Ingresa el valor de X1");
        double valorx1;
        valorx1 = input.nextDouble();
        
        double pend;
        pend= ((valory2 - valory1) / (valorx2 - valorx1));
        
        System.out.println ("La pendiente es: " + pend);
        
        
        
        
        
        
        
        
        
    }
    
}
