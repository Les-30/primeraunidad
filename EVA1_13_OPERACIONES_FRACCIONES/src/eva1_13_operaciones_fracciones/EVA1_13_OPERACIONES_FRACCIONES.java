/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_operaciones_fracciones;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class EVA1_13_OPERACIONES_FRACCIONES {
 private static Scanner input = new Scanner(System.in);
   
 
  
     public static void main(String[] args) {
            System.out.println("inserta el numerador de la fraccion1");
            int numF1;

            numF1 = input.nextInt();
            System.out.println("inserta el valor del denominador de la fraccion 1");
            int denomF1;

            denomF1 = input.nextInt();
            System.out.println("inserta el valor del numerador de la fraccion 2");
            int numF2;

            numF2 = input.nextInt();
            System.out.println("inserta el valor del denominador de la fraccion 2 ");
            int denomF2;

            denomF2 = input.nextInt();
            double mNumera;

            mNumera = numF1 * numF2;
            double mDeno;

            mDeno = denomF1 * denomF2;
            System.out.println("La multiplicacion da como resultado: " + mNumera + "/" + mDeno);
            double divNumera;

            divNumera = numF1 * denomF2;
            double divDeno;

            divDeno = denomF1 * numF2;
            System.out.println("La division tiene como resultado: " + divNumera + "/" + divDeno);
            int sumaNum;

            sumaNum = numF1 * denomF2 + denomF1 * numF2;
            int sumaDenom;

            sumaDenom = denomF1 * denomF2;
            System.out.println("La suma da como resultado: " + sumaNum + "/" + sumaDenom);
            int restaNum;

            restaNum = numF1 * denomF2 - denomF1 * numF2;
            int restaDenom;

            restaDenom = denomF1 * denomF2;
            System.out.println("La resta da como resultado: " + restaNum + "/" + restaDenom);
        }
    }

    
    

