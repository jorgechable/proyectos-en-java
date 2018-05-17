/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumero;

import java.util.Scanner;

/**
 *
 * @author Jorge Alberto Chable
 */
public class FactorialNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PUTO EL QUE LO LEA :V
        
        long factorial=1; 
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un Numero: ");
        num = numero.nextInt();
        for (int i = num; 1 > 0; i--){
            factorial = factorial * i;
        }
        
        System.out.println("El factorial de " + num + "es: " + factorial);
      
        
    }
    
}
