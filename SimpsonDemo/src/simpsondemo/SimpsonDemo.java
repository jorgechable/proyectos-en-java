package simpsondemo;
/**
 *
 * @author Jorge Alberto Chable
 */
 import javax.swing.JOptionPane;
 public class SimpsonDemo {
     static int ncalls = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        double funcparms[] = {10.0}; double ans = doSimpson(0.0, 1.0, funcparms); double err = Math.abs(1 - ans); 
        //System.out.println(
        JOptionPane.showMessageDialog(null," Simpson err = "+err+";   ncalls = "+ncalls); 
    }

    static double func(double x, double parms[])
    {
        ncalls++; 
        double coef = parms[0]/(1 - Math.exp(-parms[0])); 
        return coef*Math.exp(-x*parms[0]);
    } 

    //-------Simpson package starts here----------------

    static int    JMAX=20; 
    static double TOL=1E-9;

    static double doSimpson(double a, double b, double fp[])
    // Press 1st Ed p.111
    {
        double t, tprev=-999;               // trapezoid values
        double p, pprev=-999;               // predicted values
        int nnext = 1; 
        t = 0.5*(b-a)*(func(a,fp) + func(b,fp));  // initial guess
        for (int j=1; j<JMAX; j++)
        {
            double delta = (b-a)/nnext; 
            double x = a + 0.5*delta; 
            double sum = 0.0;               
            for (int k=0; k<nnext; k++)
            {
                sum += func(x,fp); 
                x += delta; 
            }
            t = 0.5*(t + (b-a)*sum/nnext); 
            nnext *= 2; 

            p = (4*t - tprev)/3;           
            if (Math.abs(p-pprev)<TOL*(1+Math.abs(pprev)))
              return p;                    
            pprev = p; 
            tprev = t; 
        }
        return -999; 
    }        
}