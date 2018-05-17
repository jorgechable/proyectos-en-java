
package integrales;

/**
 *
 * @author rafael
 */
public class Integrales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //instanciamos la clase Integral
        Integral integ=new Integral();
        //llamamos al metodo que nos calcula la integral
        integ.CalcularIntegral("sen x", "0", "1");
        //mostramos el resultado por la salida estandar
        System.out.println(integ.getArea());
    }
    
}
