/*
 * Programming BUBBLE SORT Assignment A
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (04.25.2017)
 * 
 * Create a java program that displays a list of 20 #'s from an array
 * in ascending order from lowest to highest.
 */

public class bubblesort1 {
    public static void main(String[] args) {
        int intArray[] = new int[]{5,90,35,45,150,2,7,9,2,100,22,12,34,54,13,27,46,65,94,20};
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
        int t = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(intArray[j-1] > intArray[j]){
                    t = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = t;
                }
            }
        }

    }
}