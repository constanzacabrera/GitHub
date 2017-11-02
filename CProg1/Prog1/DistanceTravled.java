import java.util.Scanner;

public class DistanceTravled
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        int speed;
        int hours;
        
        System.out.print("Please input amount of time traveled (in whole hours): ");
        hours = keyboard.nextInt();
        int variableForTime = hours;
        
        System.out.print("Please input speed at which the trip was travled " +
                            "(in whole miles): ");
        speed = keyboard.nextInt();
        
        while ((speed<0)||(speed<hours))
            {
                System.out.print("That is an invalid speed input. Please try again.");
                speed = keyboard.nextInt();
            }

        int variableForSpeed = speed;
       
        int distance = speed * variableForTime;
        System.out.println("Hours Traveled          Distance Traveled");
        System.out.println("-----------------------------------------");
        
        for (speed = variableForSpeed; speed <= distance;)
            {
                for (variableForTime = 1; variableForTime <= hours; variableForTime++)
                    {
                        System.out.println(variableForTime + "\t\t" + speed);
                        speed += variableForSpeed;
                    }
             }
    }
}