
package sdlc_assignment;
import java.util.Scanner;

/**
 *
 * @author S332629690
 */

public class cube {
    
    static Scanner sc = new Scanner(System.in);
    static double l;
    static double sa(double l){
        return(l*l*6);
    }
    static double vo(double l){
        return(l*l*l);
    }
        static void inputs(){
        System.out.println("Please enter a length for your cube in centimeters: ");
        l =sc.nextDouble();
    }
      static void outputs(){
          System.out.println("The surface area of your cube is: "+ sa(l)+ " cm");
          System.out.println("The volume of your cube is: "+ vo(l)+ " cm^3");
      }
}
       
