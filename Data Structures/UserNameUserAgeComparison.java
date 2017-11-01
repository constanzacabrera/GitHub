/*
 * Programming Queue Assignment
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (04.18.2017)
 */

import java.util.*;

public class UserNameUserAgeComparison
{
    public static void main(String[] args)
    {
        System.out.println("This is a priority queue that recieves user name");
        System.out.println("and user age from the system user.");
        System.out.println("");

        MyComparator comparator = new MyComparator();

        Scanner scan = new Scanner(System.in);

        PriorityQueue<Comp> pQueue = new PriorityQueue<Comp>(5, comparator);

        int y = 5;
        int x = 0;
        while (x<5)
        {
            System.out.println("Please input the users' name");
            String userName = scan.nextLine();
            
            System.out.println("Please input the users' age");
            int userAge = scan.nextInt();
            
            pQueue.offer(new Comp(userName, userAge));
            
            x++;
        }

        for(int z=0; z<5; z++)
        {
            System.out.println(pQueue.poll());
        }
    }
}
