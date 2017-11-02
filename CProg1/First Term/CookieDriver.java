//11.18.15
//Constanza Cabrera

public class CookieDriver
{
    /*public String toString() {
        String answer = "";
        for (CookieOrder c : orders)
            answer += c+"\n";
        return answer;
        }
        */
    public static void main(String [] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.showOrders();
        
        int removed = goodies.removeVariety("Chocolate Chip");
        
        System.out.println("After removing " + removed + " chocolate chip we have: ");
        goodies.showOrders();

    }
}