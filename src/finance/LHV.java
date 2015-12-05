package finance;

/**
 * Created by kristi on 05/12/15.
 */
public class LHV {
    int flatFee = 300;
    double perCentFee = 0.002;

    public int calculate(int stockPriceCents, int stockQuantity){
        int purchaseFee = flatFee + (int) (perCentFee*stockPriceCents*stockQuantity);
        return purchaseFee;
    }
}
