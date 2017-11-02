//Constanza Cabrera
//11.24.15

public class WorldList_Driver
{
    public static void main()
    {
        WordList animals = new WordList();
        animals.ad("cat");
        animals.ad("mouse");
        animals.ad("frog");
        animals.ad("dog");
        animals.ad("dog");
        
        System.out.println(animals);
        
        System.out.println("four letter count " + animals.numWordsOfLength(4));    // 1
        System.out.println("three letter count " + animals.numWordsOfLength(3));    //  3
        System.out.println("two letter count " + animals.numWordsOfLength(2));    //  0
        
        animals.removeWordsOfLength(4); 
        System.out.println("Four letter words removed");
        System.out.println(animals);    //["cat", "mouse", "dog", "dog"]
        
        animals.removeWordsOfLength(3); 
        System.out.println("Three letter words removed");
        System.out.println(animals);    //["mouse"]
        
        animals.removeWordsOfLength(2); 
        System.out.println("Two letter words removed");
        System.out.println(animals);    //["mouse"]
    }
}