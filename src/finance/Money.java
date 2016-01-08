package finance;

/**
 * Created by kristi on 31/10/15.
 * This is where the conversion magic happens!
 */
public class Money {

    int amountCents;

    public Money(double amount){ //Can give Money data as either int or double (overload) http://beginnersbook.com/2013/05/method-overloading/
        amountCents = (int) (amount*100);
    }
    public Money(int _amountCents){
        amountCents = _amountCents;
    }



    public int getAmountCents(){
        return amountCents;
    }

    public double getAmountAsDouble() { return amountCents/100.0; }

}
