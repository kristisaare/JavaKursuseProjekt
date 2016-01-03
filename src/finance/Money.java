package finance;

/**
 * Created by kristi on 31/10/15.
 * This is where the conversion magic happens!
 */
public class Money {

    int amountCents;

    public Money(double amount){
        amountCents = (int) (amount*100);
    }
    public Money(int _amountCents){
        amountCents = _amountCents;
    }



    public int getAmountCents(){
        return amountCents;
    }

    public double getAmountAsDouble() { return amountCents/100; }


    //ToDo make a method to print stockprice to string
}
