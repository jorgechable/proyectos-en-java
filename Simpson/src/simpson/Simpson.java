
package simpson;
  //@author Jorge Alberto Chable
import javax.swing.JOptionPane;
public class Simpson {

    public double f(double x){ //funcion de variable real
        return (x*x);
    }
    public double simple(double a, double b){ //Regla de simpson simple
        return ((b-a)/6)*(f(a)+f((a+b)/2)+f(b));
    }
    public double compuesto(double a, double b, long n){ //regla de simpson compuesta
        double i = a,suma=0;
        double h = (b-a)/n;
        while(i<=b){
            if(i+h<=b){
                suma = suma + simple(i,i+h);
            }
            i=i+h;
        }
        return suma;
    }
    public static void main(String[] args) {
        String ent;
        Simpson s = new Simpson();
       // System.out.println(
        JOptionPane.showMessageDialog(null,
          "El area es: " + s.compuesto(0, 1, 3000));
     
    }

}
