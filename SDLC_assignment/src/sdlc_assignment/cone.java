/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdlc_assignment;

import java.util.Scanner;

/**
 *
 * @author S332629690
 */
public class cone {
    
    static Scanner sc = new Scanner(System.in);
    static double r;
    static double h;
    static double sa(double r, double h){
        return(3.14*r*(r+(Math.sqrt((h*h)+(r*r)))));
    }
    static double vo(double r, double h){
        return(3.14159*r*r*(h/3));
    }
        void inputs(){
            while(true){
                try{
        System.out.println("Please enter a radius for your cylinder in centimeters: ");
        r =sc.nextDouble();
        System.out.println("Please enter a height for your cylinder in centimeters: ");
        h =sc.nextDouble();
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
          System.out.println("The surface area of your cylinder is: "+ Math.round(sa(r, h))+ " cm^2");
          System.out.println("The volume of your cylinder is: "+ Math.round(vo(r, h))+ " cm^3");
      }
}
