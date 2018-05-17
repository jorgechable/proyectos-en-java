/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azarapp;

import java.util.Random;
/**
 *
 * @author Jorge Alberto Chable
 */
public class AzarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] ndigitos = new int[10];
    int n;
    
    Random rnd = new Random();

// Inicializar el array
    for (int i = 0; i < 10; i++) {
        ndigitos[i] = 0;
    }

// verificar que los números aleatorios están uniformente distribuídos
    for (long i=0; i < 100000L; i++) {
// genera un número aleatorio entre 0 y 9
        n = (int)(rnd.nextDouble() * 10.0);
//Cuenta las veces que aparece un número
        ndigitos[n]++;
    }

// imprime los resultados
    for (int i = 0; i < 10; i++) {
        System.out.println(i+": " + ndigitos[i]);
    }

//Dos secuencias de 5 número (distinta semilla)
    System.out.println("Primera secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    System.out.println("Segunda secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

//Dos secuencias de 5 número (misma semilla)
    rnd.setSeed(3816L);
    System.out.println("Primera secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    rnd.setSeed(3816);
    System.out.println("Segunda secuencia");
    for (int i = 0; i < 5; i++) {
        System.out.print("\t"+rnd.nextDouble());
    }
    System.out.println("");

    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
    }
    
}
