package Main;

import java.util.Scanner;

/**
 * Created by kristi on 11/10/15.
 */
public class StockPurchase {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Palju maksab Tallinna Vee aktsia?");
        int TallinnaVesiPrice = user.nextInt(); // Cast to int.
        System.out.println("Aktsia hind on täna " + TallinnaVesiPrice);

    }
}
