
package FinalProject;
import java.util.*;

public class AirportBirdCounterStrikeProgram
{
    public static void main(String[] args) 
    {
        System.out.println("Airport Bird Counteir-Strike Program");
        System.out.println("-----------------------------------");
        System.out.println("This program will provide you with the information needed to avoid a bird strike.");
        System.out.println("\n"); 
        int w = 1;

        while (w==1)
        {
            System.out.println("If you would like to find out where to deploy your employees at this time, please press 1.");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1)
            {
                deployEmployee(w);
                employeeToDeploy();
            }
            else 
            {
                break;
            }
            System.out.println("If you would like to terminate the program and erase all information, please press 0. If not, press 1.");
            w = sc.nextInt();
        }
        System.out.println("You have terminated the program. All information has been deleted.");
    }

    public static int deployEmployee(int w)
    {
        System.out.println("Please input the time interval of the day out of the following 6 time intervals.");
        System.out.println("If the current time falls between 00:00 and 04:00, type in '1'.");
        System.out.println("If the current time falls between 04:00 and 08:00, type in '2'.");
        System.out.println("If the current time falls between 08:00 and 12:00, type in '3'.");
        System.out.println("If the current time falls between 12:00 and 16:00, type in '4'.");
        System.out.println("If the current time falls between 16:00 and 20:00, type in '5'.");
        System.out.println("If the current time falls between 20:00 and 24:00, type in '6'.");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1)
        {
            airportGrid1(w);
        }
        else if (i == 2)
        {
            airportGrid2(w);
        }
        else if (i == 3)
        {
            airportGrid3(w);
        }
        else if (i == 4)
        {
            airportGrid4(w);
        }
        else if (i == 5)
        {
            airportGrid5(w);
        }
        else if (i == 6)
        {
            airportGrid6(w);
        }
        else
        {
            System.out.println("You have input an incorrect time. Please try again.");
        }
        return w;
    }

    public static String employeeToDeploy()
    {
        Scanner sc = new Scanner(System.in);
        Queue<String> employeeToDeploy = new LinkedList<String>();
        System.out.println("Now you must deploy an employee.");
        int l = employeeToDeploy.size();
        while (l==0)
        {
            System.out.println("There are no employees listed. Please input the number of employees you have.");
            int e = sc.nextInt();            
            int x = 0;
            String employeeName;
            System.out.println("Then input the names of the employees in the order they clocked in.");
            while (x<=e)
            {
                employeeName = sc.nextLine();
                employeeToDeploy.add(employeeName);
                x++;
            }
            l = employeeToDeploy.size();
        }
        System.out.println("Please write the number of birdstrikes that have been reported today.");
        int f = sc.nextInt();            
        System.out.println("Based off this number, we will tell you which employee has to go out next.");
        int x = 0;
        while (x<=f)
        {
            employeeToDeploy.remove();
            x++;
        }
        System.out.println(employeeToDeploy.peek());
        return (employeeToDeploy.peek());
    }

    public static int airportGrid1(int w)
    {
        int i = 4;
        int [] AirportGrid1 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid1 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid.");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid1[a] = addedSection;
                System.out.println(AirportGrid1[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid1.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid1[j-1] > AirportGrid1[j]){
                        t = AirportGrid1[j-1];
                        AirportGrid1[j-1] = AirportGrid1[j];
                        AirportGrid1[j] = t;
                    }
                }
            }
        }
        return w;
    }

    public static int airportGrid2(int w)
    {
        int i = 4;
        int [] AirportGrid2 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid2 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid.");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid2[a] = addedSection;
                System.out.println(AirportGrid2[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid2.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid2[j-1] > AirportGrid2[j]){
                        t = AirportGrid2[j-1];
                        AirportGrid2[j-1] = AirportGrid2[j];
                        AirportGrid2[j] = t;
                    }
                }
            }
        }
        return w;
    }

    public static int airportGrid3(int w)
    {
        int i = 4;
        int [] AirportGrid3 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid3 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid.");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid3[a] = addedSection;
                System.out.println(AirportGrid3[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid3.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid3[j-1] > AirportGrid3[j]){
                        t = AirportGrid3[j-1];
                        AirportGrid3[j-1] = AirportGrid3[j];
                        AirportGrid3[j] = t;
                    }
                }
            }
        }
        return w;
    }

    public static int airportGrid4(int w)
    {
        int i = 4;
        int [] AirportGrid4 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid4 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid.");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid4[a] = addedSection;
                System.out.println(AirportGrid4[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid4.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid4[j-1] > AirportGrid4[j]){
                        t = AirportGrid4[j-1];
                        AirportGrid4[j-1] = AirportGrid4[j];
                        AirportGrid4[j] = t;
                    }
                }
            }
        }
        return w;
    }

    public static int airportGrid5(int w)
    {
        int i = 4;
        int [] AirportGrid5 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid5 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid.");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid5[a] = addedSection;
                System.out.println(AirportGrid5[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid5.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid5[j-1] > AirportGrid5[j]){
                        t = AirportGrid5[j-1];
                        AirportGrid5[j-1] = AirportGrid5[j];
                        AirportGrid5[j] = t;
                    }
                }
            }
        }
        return w;
    }

    public static int airportGrid6(int w)
    {
        int i = 4;
        int [] AirportGrid6 = new int[i];
        System.out.println("The airport has been divided into a grid of 4 sections: ");

        Scanner sc = new Scanner(System.in);
        if (AirportGrid6 == null)
        {
            System.out.println("No data was found for this grid. Please input the number of birds seen in each of the 4 areas in the grid, along with .");
            for (int a = 0; a < i; a++)
            {
                int addedSection = sc.nextInt();
                AirportGrid6[a] = addedSection;
                System.out.println(AirportGrid6[a]);
                System.out.println("\n");
            }
        }
        else
        {
            //RUN THE sortAirportGrid class
            int n = AirportGrid6.length;
            int t = 0;
            for(int m=0; m < n; m++){
                for(int j=1; j < (n-m); j++){
                    if(AirportGrid6[j-1] > AirportGrid6[j]){
                        t = AirportGrid6[j-1];
                        AirportGrid6[j-1] = AirportGrid6[j];
                        AirportGrid6[j] = t;
                    }
                }
            }
        }
        return w;
    }
}


