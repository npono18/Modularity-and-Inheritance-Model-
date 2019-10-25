
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
        System.out.println("1. Cube.");
        System.out.println("2. Rectangular Based Prism.");
        System.out.println("3. Triangular Based Prism.");
        System.out.println("4. Cylinder.");
        System.out.println("5. Cone.");
        System.out.println("Which shape do you want to select?: ");
        int i = 0;
        while(i<100){
            try{
                int number =sc.nextInt();
                if (number < 0 || number>=6){
                    throw new Exception();                    
                }
                if (number == 1){
                    System.out.println("You have chosen a cube!");
                    cube cube1 = new cube();
                    cube.inputs();
                    cube.outputs();
                    break;
                }
                if (number == 2){
                    System.out.println("You have chosen a rectangular based prism!");
                    rectangular_prism rectangular_prism1 = new rectangular_prism();
                    rectangular_prism.inputs();
                    rectangular_prism.outputs();
                    break;
                }
                if (number == 3){
                    System.out.println("You have chosen a triangular based prism!");
                    triangular_prism triangular_prism1 = new triangular_prism();
                    triangular_prism.inputs();
                    triangular_prism.outputs();
                    break;
                }
                if (number == 4){
                    System.out.println("You have chosen a cylinder!");
                    break;
                }
                if (number == 6){
                    System.out.println("You have chosen a cone!");
                    break;
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                i++;
                System.out.println("Incorrect input!!");
                System.out.println("Please enter a correct input!");
        }
                }
        }
    }
