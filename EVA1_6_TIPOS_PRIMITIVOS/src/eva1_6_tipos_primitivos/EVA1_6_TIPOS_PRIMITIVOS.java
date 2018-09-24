/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_tipos_primitivos;

import java.util.Scanner;

/**
 *
 * @author Leslie peña hernandez. 18550680.
 */
public class EVA1_6_TIPOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Introduce tu nombre");
    String nombre;//declarando
    Scanner captura;//declarando
    //SCANNER ES UNA CLASE, PARA USAR CLASES SE HACE A TRAVES DE OBJETOS Y ESTOS SE 
    //CREAN CON LA PALABRA new
    captura = new Scanner(System.in);
    nombre = captura.nextLine();//se ejecuta al momento de dar enter
    System.out.println("tu nombre es " + nombre); 
    }
    
}
