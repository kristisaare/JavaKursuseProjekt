package Main;


import java.util.Scanner;
import finance.FinanceClass;

/**
 * Created by kristi on 11/10/15.
 */
public class StockPurchase {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Kui palju maksab aktsia, mida osta soovid?");
        int stockPrice = (int) (user.nextDouble()*100); // Cast price to int in cents, only works with . not ,.

        System.out.println("Mitu aktsiat soovid osta?");
        int stockAmount = user.nextInt();

        System.out.println("Aktsia hind on täna " + stockPrice + " senti." );
        System.out.println("Soovid osta " + stockAmount + " aktsiat.");

    }
}
