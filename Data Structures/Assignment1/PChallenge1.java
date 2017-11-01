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
package Assignment1;
public class PChallenge1
{
    public static void main(String[ ] args)
    {
        String[ ] continents = {"North America", "South America", "Europe", "Asia", "Africa", "Antarctica", "Australia"};
        sortContinents (continents);
        for ( int k = 0;  k < 7;  k++ )
            System.out.println( continents [ k ] );
    }

    public static void sortContinents( String  a [ ] )
    {
        int j;
        boolean f = true;
        String t;

        while ( f )
        {
            f = false;
            for ( j = 0;  j < a.length - 1;  j++ )
            {
                if ( a [ j ].compareToIgnoreCase( a [ j+1 ] ) > 0 )
                {
                    t = a [ j ];
                    a [ j ] = a [ j+1];    
                    a [ j+1] = t; 
                    f = true;
                } 
            } 
        } 
    } 
}