package Assignment1;
/**
 * Programming Assignment 1B: Arrays & Loops
 * 
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 * 
 * @date (1.31.2017)
 * 
 */

public class Assignment1B {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}
