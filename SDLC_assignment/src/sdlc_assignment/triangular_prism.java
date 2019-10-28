
package sdlc_assignment;

import java.util.Scanner;

/**
 *
 * @author S332629690
 */
public class triangular_prism {
    
    static Scanner sc = new Scanner(System.in);
    static double l;
    static double b;
    static double h;
    static double s;
    static double sa(double l, double b, double h, double s){
        return((b*h)+(l*l*s)+ (l*b));
    }
    static double vo(double l, double h, double s){
        return(((s*l)/2)*h);
    }
        void inputs(){
            while(true){
                try{
        System.out.println("Please enter a length for your triangular prism in centimeters: ");
        l =sc.nextDouble();
        System.out.println("Please enter a side measurement for your triangular prism in centimeters: ");
        s =sc.nextDouble();
        System.out.println("Please enter a height for your triangular prism in centimeters: ");
        h =sc.nextDouble();
        System.out.println("Please enter a base for your triangular prism in centimeters: ");
        break;
        }
                catch(Exception e){
                 System.out.println("Incorrect input!");
                 System.out.println("Please enter a correct input!");
                 sc.nextLine();
                }
}
    }
      void outputs(){
          System.out.println("The surface area of your triangular prism is: "+ sa(l, b, h, s)+ " cm");
          System.out.println("The volume of your triangular prism is: "+ vo(l, s, h)+ " cm^3");
      }
}
