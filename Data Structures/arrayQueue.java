import java.util.*;

public class arrayQueue {

    public static void main(String[] args) {

        System.out.println("This program will capture numeric data ");
        System.out.println("from a user and add it to a Queue");

        Queue<Integer> myQueue = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 5 values of numeric data");
        for (int x = 0; x<5; x++)
        {
            int numData = scan.nextInt();
            myQueue.add(numData);
        }
        System.out.println("Here is your queue: "+ myQueue);

        Stack<Integer> myStack = new Stack<Integer>();
        for (int x = 0; x<5; x++)
        {
            int numData = myQueue.remove();
            numData = numData*5;
            myStack.add(numData);
        }
        System.out.println("Here is your stack: "+ myStack);
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for (int x = 0; x<5; x++)
        {
            int numData = myStack.pop();
            pQueue.add(numData);
        }
        System.out.println("Here is your priority queue: "+ pQueue);
    }
}
