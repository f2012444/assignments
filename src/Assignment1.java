
import java.io.File;
import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args) throws Exception
    {
        File file = new File(args[0]);

        Scanner scan = new Scanner(file);
        
        System.out.println("Please enter the velocity of the canonball:");//feet per second
        double velocity = scan.nextDouble(); 
        
        System.out.println("Please enter the angle of the canonball where it will be shot at:");//in degrees
        double angle = scan.nextDouble();
        
        System.out.println("Please enter the distance to the target");
        double distance = scan.nextDouble();
        
        System.out.println("Please enter the elevation of the bottom of target from the ground");
        double elevation = scan.nextDouble();
        
        System.out.println("Please enter the size of the target");
        double size = scan.nextDouble(); 
        
        double velDenom = velocity*(Math.cos(Math.toRadians(angle)));
        if(velocity == 0)
        { 
            System.out.println("Canonball did not reach target.");
        } 
        else {
            System.out.println("Canonball hit the target.");
        }
        double time = (distance / (velocity*Math.cos(Math.toRadians(angle))));
        
        double height = (velocity * time * Math.sin(Math.toRadians(angle) - ((32.17 * Math.pow (time , 2)/2))));
        
        double elevHei = elevation + size; 
        
        if(height < 0)
        {
            System.out.println("The cannonball did not reach the target");
        }
        else if(height > 0 && height < elevation)
        {
            System.out.println("The cannonball went under the target " + height);
        }
        else if(height > elevation && height < elevHei)
        {
            System.out.println("The cannonball hit the target!");
        }
        else if (height > elevHei)
        {
            System.out.println("The cannonbal went over the top of the target " + height);
        }
    }
}
  