//Constanza Cabrera
//11.12.15

public class Two_Dimensional_Array
{
    public static void main(String[] args)
    {
        System.out.println("Processing array of numbers...");
        System.out.println("");
        int[][] numbers = {{2,1,9},
                           {7,3,4},
                           {5,6,8}};
        System.out.println("The values in the array are");    
        showArray(numbers);
        
        System.out.println("The sum of the values is " + arraySum(numbers));
        System.out.println();
        
        System.out.println("The average of the values in the array is " + arrayAvg(numbers));    
        System.out.println();

        for (int r = 0; r < numbers.length; r++)
            System.out.println("The sum of row  " + r + " = " + sumRow(numbers, r));
        System.out.println("");
        for (int c = 0; c < numbers[0].length; c++)
            System.out.println("The sum of col  " + c + " = " + sumCol(numbers, c));
        System.out.println("");
        for (int c = 0; c < numbers[0].length; c++)
            System.out.println("The highest in row " + c + " = " + highestInRow(numbers, c));
        System.out.println("");
        for (int c = 0; c < numbers[0].length; c++)
            System.out.println("The lowest in row " + c + " = " + lowestInRow(numbers, c));
        System.out.println("");
    }

    private static int arraySum(int[][] numbers)
    {
        int sum = 0;
        for (int r = 0; r < numbers.length; r++)
        {
            for (int c = 0; c < numbers[r].length; c++)
            {
                sum += numbers[r][c];
            }
        }
        return sum;
    }
    
    private static double arrayAvg(int[][] numbers)
    {
        int sum = 0;
        int count = 0;
        for (int r = 0; r < numbers.length; r++)
        {
            for (int c = 0; c < numbers[r].length; c++)
            {
                sum += numbers[r][c];
                count++;
            }
        }
        return sum/count;
    }

    private static void showArray(int[][] numbers)
    {
        for (int r = 0; r < numbers.length; r++)
        {
            for (int c = 0; c < numbers[r].length; c++)
            {
                System.out.print(numbers[r][c] + "\t"); 
            }
            System.out.println();
        }
    }

    public static int sumRow(int[][] numbers, int row)
    {
        int sumOfRow = 0;

        for (int c = 0; c < numbers[row].length; c++)
            sumOfRow += numbers[row][c];

        return sumOfRow;
    }

    public static int sumCol(int[][] numbers, int col)
    {
        int sumOfCol = 0;

        for (int r = 0; r < numbers.length; r++)
            sumOfCol += numbers[r][col];

        return sumOfCol;
    }
     
    public static int highestInRow(int[][] numbers, int col)
    {
        int highestInRow = numbers[0][0];
        
        for (int r = 0; r < numbers.length; r++)
        {
            if(numbers[col][r]>highestInRow)
                highestInRow=numbers[col][r];
        }
        return highestInRow;
        
    }
    
     public static int lowestInRow(int[][] numbers, int row)
    {
        int lowestInRow = numbers[row][0];
        int a = 0;
        for (int c = 0; c < numbers[row].length; c++)
            if (lowestInRow>numbers[row][a+1])
                lowestInRow=numbers[row][a+1];
            else if (lowestInRow<numbers[row][a+1])
                lowestInRow=lowestInRow;
        return lowestInRow;
    }
    
}
