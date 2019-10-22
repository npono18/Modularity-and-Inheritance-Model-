/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdlc_assignment;

/**
 *
 * @author S332629690
 */
 
import java.util.Scanner;

public class SDLC_assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the surface area and volume calculator!");
        System.out.println("You have the choice of the following 3D shapes: ");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Based Prism");
        System.out.println("3. Triangular Based Prism");
        System.out.println("4. Cylinder");
        System.out.println("5. Cone");
        int number = sc.nextInt();
            do {
                System.out.println("Enter the corresponding number to the shape you want: ");
                while (!sc.hasNextInt()) {
                    System.out.println("That's not a correct number!");
                    sc.next();
                }
                number = sc.nextInt();
            } while (number<0 && number>=6);
            System.out.println("Thank you, you entered: " + number);
        
        
        
        
        
        //cube cube1 = new cube()

    }
    
}
