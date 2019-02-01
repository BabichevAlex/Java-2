/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Random;

/**
 *
 * @author 1710502
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        double x = 2, a = -1.1, b = 4.2, c = -0.23;
        double y = Math.abs(x-a)/Math.log(Math.abs(Math.cbrt(b*x*x + c))) + x * Math.tan(((b*x)-a)/(x+c));
        double x1 = 1 +(10 - 1)* rand.nextDouble();
        double a1 = 1 +(10 - 1)* rand.nextDouble();
        double b1 = 1 +(10 - 1)* rand.nextDouble();
        double c1 = 1 +(10 - 1)* rand.nextDouble();
        
        double y1 = Math.abs(x1-a1)/Math.log(Math.abs(Math.cbrt(b1*x1*x1 + c1))) + x1 * Math.tan(((b1*x1)-a1)/(x1+c1));
        System.out.println(y);
        System.out.println(y1);
        
    }
    
}
