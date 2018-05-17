/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.io.*;
import javax.swing.JOptionPane;

class Cuadrado
{
	public static void main(String arg[])throws IOException
	{
	
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
		int cantidad,semilla=5015;
		int tamano1,tamano2,i;
		String cadena,new_numero;
		cadena=String.valueOf(semilla);				// conversion de entero a cadena
		tamano1=cadena.length();					// tamaño de la cadena
		
		double semilla_cuadrada=0;
		
		cantidad=Integer.parseInt(JOptionPane.showInputDialog(" NUMEROS A GENERAR"));
	
				
		for(i=0; i<cantidad; i++)
		{
			semilla_cuadrada=Math.pow(semilla,2);
			new_numero=proceso_seleccion(semilla_cuadrada,tamano1);
			Integer entero=new Integer(new_numero);
			semilla=entero.intValue();
			System.out.println(semilla);
						
		}
		
	}
	
	static String proceso_seleccion(double recibe_semilla,int tamano1)
	{
		int tamano2,resta,contador=0;  int i,posicion=0;
		String new_cadena="",cadena;
		
		int semilla=(int)recibe_semilla;
		cadena=String.valueOf(semilla);	// conversion de entero a cadena
		tamano2=cadena.length();		// tamaño de la cadena
		
		resta=(tamano2)-tamano1;
		posicion=tamano2%tamano1;
		
		if (posicion==0)
		{	
			posicion=tamano2/tamano1;
			for(i=posicion; ; i++)
			{
				if (contador!=tamano1)
				{
					new_cadena+=cadena.charAt(i);
					contador++;
				}
				else
				{
					break;
				}
				
			}	
		}	
		else
		{				
			for(i=posicion-1; ; i++)
			{
				if (contador!=tamano1)
				{
					new_cadena+=cadena.charAt(i);
					contador++;
				}
				else
				{
					break;
				}
			}
			
		}
		return new_cadena;
	}
	static int tamano(double semilla)
	{
		int i=0,c=0;
		for(i=0; i<20; i++)
		{
			c++;
			semilla=semilla/10;
			 
			 if (semilla<10)
			 {
			 	c++;
				i=20;	
			 }
		}
		 return c;
	}
}
