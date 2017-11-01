/*
 * Programming BUBBLE SORT Assignment B
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (04.25.2017)
 * 
 * Create a java program that collects 10 #'s from the uder and uses 
 * bubble sort to display them in ascending order
 */
import java.util.Scanner;

public class assigB {
    public static void main(String[] args) {
        int intArray[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++)
        {
            System.out.println("Insert Number "+ i + ":");
            intArray[i] = sc.nextInt();
        }
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        bubbleSort(intArray);
        System.out.println("");
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(intArray[j-1] > intArray[j]){
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}