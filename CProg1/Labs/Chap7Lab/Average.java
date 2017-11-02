//Constanza Cabrera
//11.10.15

import java.util.Scanner;
public class Average
{
    private int[] data;
    private double mean;
    public Average()
    {
        data = new int[5];
        System.out.println("Please enter 5 scores");
        System.out.println("---------------------");
        for (int ix = 0; ix < data.length; ix++)
        {
            System.out.println("Please enter score #" + (ix+1));
            Scanner scnr = new Scanner(System.in);
            data[ix] = scnr.nextInt();

        }
        selectionSort();
        calculateMean();
    }

    public void calculateMean()
    {
        double total = 0.0;
        for (int ix = 0; ix < data.length; ix++)
        {
            total += data[ix];
        }
        mean = total / data.length;
    }

    public String toString()
    {
        String a ="";
        for(int ix = 0; ix < data.length; ix++) 
        {
            a += data[ix] + " ";
        }
        a += "The average is " + mean;
        return a;
    }

    public void selectionSort()
    {
        int maxIx;
        int maxValue;
        for (int scan = 0; scan < data.length-1; scan++)
        {
            maxIx = scan;
            maxValue = data[scan];
            for (int ix = scan + 1; ix < data.length; ix++)
            {
                if (data[ix] > maxValue)
                {
                    maxValue = data[ix];
                    maxIx = ix;
                }
            }
            data[maxIx] = data[scan];
            data[scan] = maxValue;
        }
    }
}

