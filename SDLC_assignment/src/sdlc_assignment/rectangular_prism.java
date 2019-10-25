
package sdlc_assignment;

import java.util.Scanner;

/**
 *
 * @author S332629690
 */
public class rectangular_prism {
    
    static Scanner sc = new Scanner(System.in);
    static double l;
    static double w;
    static double h;
    static double sa(double l, double w, double h){
        return(2*((w*l)+(h*l)+(h*w)));
    }
    static double vo(double l, double w, double h){
        return(l*w*h);
    }
        static void inputs(){
        System.out.println("Please enter a length for your rectangular prism in centimeters: ");
        l =sc.nextDouble();
        System.out.println("Please enter a width for your rectangular prism in centimeters: ");
        w =sc.nextDouble();
        System.out.println("Please enter a height for your rectangular prism in centimeters: ");
        h =sc.nextDouble();
    }
      static void outputs(){
          System.out.println("The surface area of your rectangular prism is: "+ sa(l, w, h)+ " cm");
          System.out.println("The volume of your rectangular prism is: "+ vo(l, w, h)+ " cm^3");
      }
}
