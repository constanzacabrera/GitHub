import java.util.Scanner;
public class ArraysTest
{
    public static void main(String[] args)
    {
        int[] Int2DArray ={1, 2, 9, 8};

        ArraysTest array = new ArraysTest();
        System.out.println("These are the follwing arrays");
        DisplayArray(Int2DArray);
        System.out.println();
        System.out.println("The average is : " + getAverage(Int2DArray));
        System.out.println();

        System.out.println("The total of row  : " + getRowTotal(Int2DArray));
        System.out.println();

        System.out.println(getHighestRow(Int2DArray));
        System.out.println();
        System.out.println("The Lowest in row : " + getLowestRow(Int2DArray)); 
        System.out.println();
        System.out.println("isSorted Method " + isSorted(Int2DArray));
        System.out.println();
        System.out.println("findIt method " + findIt(Int2DArray, 9));
        System.out.println();
        System.out.println("Numbers higher than 'given number' are " + tenOrLarger(Int2DArray));

    }

    private static void DisplayArray(int[] array)
    {

        for (int row = 0; row < array.length; row++)
        {

            System.out.print(array[row] + "\t"); 

        }
    }

    public static int getAverage (int[] array)
    {
        int total = 0;
        int average = 0;

        for (int row = 0; row < array.length; row++)
        {
            total += array[row];
            average = total / (array.length);

        }

        return average;
    }

    public static int getRowTotal(int[] array)
    {
        int rowSum = 0;
        int col = 0;

        for (int c = 0; c < array.length; c++)
            rowSum += array[c];

        return rowSum;
    }

    public static int getHighestRow(int[] array)
    {
        int highest = array[0];

        for (int index =0; index < array.length; index++)
        {
            if (array[index]> highest){
                highest = array[index];
            }
        }

        return highest; 
    }
    
    public static int getLowestRow(int[] array)
    {
        int lowest = array[0];

        for (int index =0; index < array.length; index++){

            if ( array[index] < lowest){
                lowest = array[index];}
            else if (array[index] > lowest)
            {
                lowest = lowest;
            }

        }

        return lowest;
    }

    public static boolean isSorted(int[] array) 
    {

        for(int index = 0; index < array.length; index++){
            if (array[index] < array[index+1]) {
                return true;
            } else 
                return false;   

        }
        return true;
    }

    public static boolean findIt(int[] array, int number)
    {

        for (int index = 0; index < array.length; index++)
        {

            if (array[index] == number)
            {
                return true;
            }
        }

        return false;

    }

    public static int tenOrLarger(int[] array)
    {

        int large = 8;
        int count = 0;

        for (int index =0; index < array.length; index++)
        {

            if (array[index] >= large){
                count ++;

            }
        }

        return count; 
    }
}
