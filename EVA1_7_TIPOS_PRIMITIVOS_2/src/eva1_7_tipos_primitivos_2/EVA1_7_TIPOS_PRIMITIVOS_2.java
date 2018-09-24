/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_tipos_primitivos_2;

import java.util.Scanner;
/**
 *
 * @author Leslie peña hernandez. 18550680.
 */
public class EVA1_7_TIPOS_PRIMITIVOS_2 {

    public static Scanner input = new Scanner (System.in);
   
    
    public static void main(String[] args) {
        System.out.println("Teclea tu nombre");
        String nombre;
        nombre = input.nextLine();
        System.out.println("Teclea tu edad");
        int miEdad;
        miEdad = input.nextInt();
        int año;
        año = 2018 - miEdad;
        System.out.println("Tu nombre es " + nombre);
        System.out.println("y tu año de nacimiento es " + año);
        
        
    }
    
}
