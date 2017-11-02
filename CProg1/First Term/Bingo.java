/*************************
 *        BINGO
 *************************
 *
 * The standard bingo game.
 *
 * Name: Constanza Cabrera
 *       Waleed Alnasser
 *
 * Date: 12.10.15
 *
 ***********************/

import java.util.*;
import java.io.*;
public class Bingo
{
    private Random rand = new Random(); 
    private int[][] card;           
    private int[] stream;           
    private boolean[][] marks;      

    public Bingo()
    {
        card   = new int[5][5];
        stream = new int[75];
        marks  = new boolean[5][5];
    }

    public void write(String outputFile)  throws IOException
    {
        //throw new RuntimeException ("You need to implement this method");
        System.out.println("B"+"\t"+"I"+"\t"+"N"+"\t"+"G"+"\t"+"O");
        PrintWriter filesWritten = new PrintWriter("input1.txt");
        ArrayList<Integer> completed = new ArrayList<Integer>();
        boolean v = false; 
        int t = 0;
        for (int a = 0; a<=card.length-1; a++)
        {
            for(int r = 0; r<card.length;r++)
            {
                while(!v)
                {
                    t = (int)(Math.random()*15)+1+15*a;
                    if(!completed.contains(t))
                    {
                        v = true;
                        completed.add(t);
                    }
                }
                card[r][a]=t;
                v=false;
            }
        }
        card[2][2] = 0;
        filesWritten.println();
        for(int r=0; r<card.length;r++)
        {
            for(int c=0; c<card[r].length; c++)
            {
                filesWritten.print(card[r][c]+" /t");
            }
            filesWritten.println();
        }
        filesWritten.println();
        for(int r=0;r<card.length;r++)
        {
            for(int c=0;c<card[r].length;c++)
            {
                filesWritten.print(card[r][c]+ " \t");
            }
            filesWritten.println();
        }
        filesWritten.println();
        for (int a=0; a<stream.length; a++ )
        {
            stream[a]=a+1;
        }
        Random rand = new Random();
        for (int i=0; i<stream.length; i++) 
        {
            int n=rand.nextInt(74);
            shuffle(stream,i,n); 
        }
        for (int a=0; a<stream.length; a++ )
        {
            filesWritten.print(stream[a] + ", ");
        }
        filesWritten.close();
    }

    public void shuffle(int[] list, int x, int y)
    {
        int temp=list[x];
        list[x]=list[y];
        list[y]=temp;
    }

    public void read(String inputFile) throws IOException
    {
        int sum = 0;
        int count = 0;
        File file = new File(inputFile);
        Scanner inFile = new Scanner(file);
        for(int row = 0; inFile.hasNextLine() && row < 5; row++)
        {
            for(int i = 0; i < 5; i++)
            {
                card[row][i] = inFile.nextInt();
            }
        }
        for(int i=0; i<75;i++)
        {
            stream[i] = inFile.nextInt();
        }
        for(int row=0;row<5;row++)
        {
            for(int col=0;col<5;col++)
            {
                System.out.print(card[row][col]+ " \t");
            }
            System.out.println();
        }
        System.out.println();
        for (int index = 0; index < stream.length; index++ )
        {
            System.out.print(stream[index]+", ");
        }
        System.out.println();
        inFile.close();
    }

    public int playGame()
    {
        for(int indx=0;indx<75;indx++)
        {
            for(int r=0;r<5;r++)
            {
                for(int c=0;c<5;c++)
                {
                    if(stream[indx]==card[r][c])
                    {
                        marks[r][c] = true;
                        marks[2][2] = true;                        
                        if((marks[r][0]==true)&&(marks[r][1]==true)&&(marks[r][2]==true)&&(marks[r][3]==true)&&(marks[r][4]==true))
                        {
                            return stream[indx];
                        }
                        if((marks[0][c]==true)&&(marks[1][c]==true)&&(marks[2][c]==true)&&(marks[3][c]==true)&&(marks[4][c]==true))
                        {
                            return stream[indx];
                        }
                        if((marks[0][0]==true)&&(marks[1][1]==true)&&(marks[3][3]==true)&&(marks[4][4]==true))//diag1
                        {
                            return stream[indx];
                        }
                        if((marks[4][1]==true)&&(marks[3][2]==true)&&(marks[2][3]==true)&&(marks[1][4]==true))//diag2
                        {
                            return stream[indx];
                        }
                        if((marks[0][0]==true)&&(marks[0][4]==true)&&(marks[4][0]==true)&&(marks[4][4]==true))//4points
                        {
                            return stream[indx];
                        }
                    }
                }
            }
        }
        return 0;
    }
}