import java.io.File;
import java.util.Scanner;

public class Ass3
{
    public static void main(String[] args) throws Exception
    {
        File f = new File(args[0]);
        Scanner scan = new Scanner(f);
        int numInputs = 0;
        double sum = 0;
        //System.out.println("Please type in a number. Type 0 to quit.");
        double input = scan.nextDouble();
        //System.out.println(input);
        // This is the easiest way to make sure you don't miss a min or max.
        double max = input;
        double min = input;

        // Main loop
        while(input != 0)
        {
            sum += input;
            numInputs++;
            if(input < min)
            {
                min = input;
            }
            if(input > max)
            {
                max = input;
            }
            //System.out.println("Please type in a number. Type 0 to quit.");
            input = scan.nextDouble();
            //System.out.println(input);
        }

        // Input validation
        if(numInputs == 0)
        {
            System.out.println("You didn't type anything in.");
        }
        else
        {
            System.out.println("The sum of your inputs is: " + sum);
            System.out.println("The total number of inputs you provided was : " + numInputs);
            System.out.println("The average of your inputs is: " + (sum / numInputs));
            System.out.println("The highest number you input was: " + max);
            System.out.println("The lowest number you input was: " + min);
        }
    }
}
