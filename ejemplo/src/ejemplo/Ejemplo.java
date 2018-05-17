/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import java.util.Scanner;

   public class Ejemplo{
     public static void main (String [] arg){

      /* declaras las variables */
      Scanner entrada = new Scanner(System.in);
      Scanner d= new Scanner(System.in);
      String nombre;                   /*recibe caracteres*/
     

      int a, b, c;                       /*recibe enteros*/

    
    System.out.println("Cual es tu nombre?");
    nombre = entrada.nextLine();
    
    System.out.println("Dame dato 1 a sumar");  /*se solicitan los valores desde teclado*/
     a= d.nextInt();
     System.out.println("Dame dato 2 a sumar");
     b= d.nextInt();
     c=a+b;   /*se realiza la operacion*/

     mensaje(nombre);
     System.out.print(c);
     /*resultado*/
}
     public static void mensaje (String nombre){

        System.out.println("Hola mi equipo es");
        System.out.println("Tranquilino Santiago Hugo");
        System.out.println("Chable Ramirez Jorge Alberto");
        System.out.println("Rosales Hernandez Heriberto");
       System.out.println(" Hola " + nombre + " fue un gusto ayudarte el resultaddo es.... " );

 }
}   



