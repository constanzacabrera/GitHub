//Constanza Cabrera
//11.3.15
/*
 ___________________________________
|                                   |
|   RainFallClass                   |
|___________________________________|
|                                   |
| +months:String[]                  |   
| +rainFallAmount:double[]          |
|___________________________________|
|                                   |
| +getTableRainFall():void          |
| +getTotalAnnualRainFall():void    |
| +getAnnualAverageRainFall():double|
| +getMaxAnnualRainFall():double    |
| +getMinAnnualRainFall():double    |
|___________________________________|
 */

import java.lang.Math;

public class RainFallClass
{
    String[] months={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    double[] rainFallAmounts={0.40, 0.94, 3.21, 3.74, 1.73, 1.03, 1.27, 2.58, 6.98, 6.90, 2.80, 2.53};
    public static void main(String[] args)
    {
        RainFallClass tx = new RainFallClass();
        System.out.println("Austin TX RainFall ~ 2009");
        tx.getTableRainFall();
        System.out.println("Total : " + tx.getTotalAnnualRainFall());
        System.out.println("Max : " + tx.getMaxAnnualRainFall());
        System.out.println("Min : " + tx.getMinAnnualRainFall());

    }

    public void getTableRainFall()
    {
        for (int i=0; i<rainFallAmounts.length; i++)
            System.out.println(months[i]+"\t"+rainFallAmounts[i]);
    }

    public double getTotalAnnualRainFall()
    {
        double totalAnnualRainFall=0; 
        for(int i=0; i<rainFallAmounts.length; i++)
            totalAnnualRainFall = totalAnnualRainFall + rainFallAmounts[i];
        return totalAnnualRainFall;
    }

    public double getAverageAnnualRainFall()
    {
        double averageAnnualRainFall=0;
        double totalAnnualRainFall=0; 
        for(int i=0; i<rainFallAmounts.length; i++)
            totalAnnualRainFall=totalAnnualRainFall+rainFallAmounts[i];
        averageAnnualRainFall=totalAnnualRainFall/12;
        return averageAnnualRainFall;    
    }

    public double getMaxAnnualRainFall()
    {
        double monthMaxRainFall=rainFallAmounts[0];
        for (int i=0; i<rainFallAmounts.length; i++)
            if (rainFallAmounts[i]>monthMaxRainFall)
                monthMaxRainFall=rainFallAmounts[i];
        return monthMaxRainFall;    
    }

    public double getMinAnnualRainFall()
    {
        double monthMinRainFall=rainFallAmounts[0];
        for (int i = 0; i<rainFallAmounts.length; i++)
            if (rainFallAmounts[i]<monthMinRainFall)
                monthMinRainFall=rainFallAmounts[i];
        return monthMinRainFall;    
    }

}