/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
public class Arreglos {
    
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
    
        int[]x=new int[5];
        int dato,a,b;
        
        for(a=0;a<=4;a++)
        {
            System.out.println(" dato a insertar ");
            dato=Leer.nextInt();
            x[a]=dato;
        }
        for(b=0;b<=4;b++)
        {
            System.out.println(x[b]);
        }
        
        System.out.println();
        
        // busqueda de un dato dentro de mi arreglo
        a=0;
        System.out.println(" porfavor ingrese el dato a buscar");
        dato=Leer.nextInt();
        
        while (x[a]<=dato) // solamente busca
        {
        System.out.println(" el dato se encuentra " + " en la posicion numero " + x[a]);
        System.out.println(" dato encontrado ");
           a++;
        }
        
       
        
        System.out.println();
                
    }
    
}
