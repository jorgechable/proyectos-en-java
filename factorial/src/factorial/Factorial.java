/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;
 public class Factorial
{
   public static void main(String[] args)
   {
      Scanner leer = new Scanner(System.in);
    
     System.out.print("Numero: ");
       double num = leer.nextDouble();
       double factorial = 1;

  while(num !=0){
   factorial *= num;
  num--;
   }
  System.out.println("Factorial: " + factorial);
  }
}