/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import javax.swing.JOptionPane;

       public class AreaTriangulo{
              public static void main(String sancor []){
                     String e;
                     float base, altura;
                     float area;
      
                     e=JOptionPane.showInputDialog(null,"Dame el valor de la base: ");
                     base= Float.parseFloat(e);

                     e=JOptionPane.showInputDialog(null,"Dame el valor de la altura: ");
                     altura= Float.parseFloat(e);

                     area= (base *altura) / 2;
                     JOptionPane.showMessageDialog(null,"el area del tringulo es: "+area);
              }
       }
     