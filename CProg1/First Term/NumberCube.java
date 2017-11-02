aaa//Constanza Cabrera
//11.17.15
import java.util.Random;

public class NumberCube {
    public static void main(String[] args) {
        NumberCube newCube = new NumberCube();
        int x[] = getCubeTosses(newCube, 10);
        
        System.out.print("These are the runs: { ");

        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");

        System.out.println(" }");
        
        System.out.println("This is the maxRunIndex: " + getLongestRun(x));
    }

    public int toss()
    { 
        Random rand = new Random();
        int toss = 0;
        while(true){
            toss = rand.nextInt(6);
            if(toss > 0)
                break;
        }
        return toss;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int x[] = new int[numTosses];
        for(int i=0; i<numTosses; i++){
            x[i] = cube.toss();
        }
        return x;
    }

    public static int getLongestRun(int[] x) {
        int newMax = -1;
        int count = 1;
        int maxRunLocation = -1;

        for (int i = 0; i < x.length - 1; i++) {
            if (count >= newMax) {
                newMax = count;
                maxRunLocation = i + 1 - count;
            }
            if (x[i] == x[i + 1])
                count++;
            else
                count = 1;
        }
        return maxRunLocation;
    }
}