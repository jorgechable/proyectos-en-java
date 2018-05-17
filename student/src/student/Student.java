/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Jorge Alberto Chable
 */
public class Student {

    private static Scanner reader;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {      
         //decalracion de valores
        
         Scanner leer = new Scanner (System.in);
        
        System.out.println("INTRODUCIR x");
        double x = leer.nextDouble();
        System.out.println("INTRODUCIR num_seg");
       double num_seg = leer.nextDouble();
       System.out.println("INTRODUCIR dof");
       double dof = leer.nextDouble();
        //apartado 1
        double W = (x / num_seg);
        System.out.println(W);
        //apartado 2
        double p2 = 1+((W*W)/dof);
        System.out.println(p2);
        //apartado 3
        double r = (-(dof+1)/2);
        double p3 = (double) Math.pow(p2,r);
        System.out.println(p3);
        //apartado 4
        /*double gam = 4.8;
         double r2 = dof*Math.PI;
       double p4 = (gam*(r));
       System.out.println(p4);
       */
    }
    
}
