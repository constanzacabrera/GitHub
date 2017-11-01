
//Create a program that uses a priority queue to 
//display 20 numeric pre-defined values in ascending 
//order (regardless of the order in which they are added).

import java.util.PriorityQueue;
import java.util.Comparator;

public class OrderFix {

    public static void main(String[] args) {

        PriorityQueue<Integer> NYITQ = new PriorityQueue<Integer>();

        NYITQ.offer(10);
        NYITQ.offer(9);
        NYITQ.offer(8);
        NYITQ.offer(7);
        NYITQ.offer(6);
        NYITQ.offer(5);
        NYITQ.offer(4);
        NYITQ.offer(3);
        NYITQ.offer(2);        
        NYITQ.offer(1);
        NYITQ.offer(11);       
        NYITQ.offer(12);
        NYITQ.offer(13);        
        NYITQ.offer(14);       
        NYITQ.offer(15);  
        NYITQ.offer(16);     
        NYITQ.offer(17);     
        NYITQ.offer(18);    
        NYITQ.offer(19);   
        NYITQ.offer(20);

        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());            
        System.out.println(NYITQ.poll());            
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());            
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());            
        System.out.println(NYITQ.poll());            
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    
        System.out.println(NYITQ.poll());    

    }

}