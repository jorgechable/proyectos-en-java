/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ackerman;

import java.util.*;


public class Ackerman {

   
    public static Scanner leerTeclado; 
    
    public static int ackerman (int m, int n){
    if (m==0)
    return n+1;
    else if (n==0){
        return ackerman ( m-1,1);
}                 else
        return ackerman(m-1,(ackerman(m,n-1)));
}
    public static void main (String []args) {
        leerTeclado=new Scanner (System.in);
        int n,m;
        System.out.println("INTRODUCIR N; ");
        n= leerTeclado.nextInt();
        System.out.println("INTRODUCIR M");
        m=leerTeclado.nextInt();
        ackerman(m,n);
    }
        
    }