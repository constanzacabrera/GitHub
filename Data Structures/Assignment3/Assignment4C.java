// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)
package Assignment3;
public class Assignment4C
{

       private int maxSize;
       private long[] stackArray;
       private int top;
       public Assignment4C(int s)
       {
           maxSize = s;
           stackArray = new long[maxSize];
           top = -1;
       }

       public void push(long j)
       {
           stackArray[++top] = j;
       }

       public long pop()
       {
           return stackArray[top--];
       }

       public long peek()
       {
           return stackArray[top];
       }

       public boolean isEmpty()
       {
           return (top == -1);
       }

       public boolean isFull()
       {
           return (top == maxSize - 1);
       }

       public static void main(String[] args)
       {
           Assignment4C theStack = new Assignment4C(10);
           theStack.push(10);
           theStack.push(20);
           theStack.push(30);
           theStack.push(40);
           theStack.push(50);
           while (!theStack.isEmpty())
           {
               long value = theStack.pop();
               System.out.print(value);
               System.out.print(" ");
           }
           System.out.println("");
       }
}
