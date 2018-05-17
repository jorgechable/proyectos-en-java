package alumno;

import javax.swing.JOptionPane;
public class Alumno{

public static void main(String sancor []){
String ent;
int calif;
ent=JOptionPane.showInputDialog(null,"Dame la calificacion de 1 a 100: ");
calif=Integer.parseInt(ent);

if(calif >= 70){
	JOptionPane.showMessageDialog(null,"APROBADO");
	}
	else
	JOptionPane.showMessageDialog(null,"REPROBADO");
}
}