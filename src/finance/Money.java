package finance;

/**
 * Created by kristi on 31/10/15.
 */
public class Money {

    int amountCents;

    public Money(double amount){
        amountCents = (int) (amount*100);
    }
    public int getAmountCents(){
        return amountCents;
    }
    //ToDo make a method to print stockprice to string
}
