package finance;

/**
 * Created by kristi on 05/12/15.
 */
public class SWED {
    int minimumFee = 320;
    double perCentFee = 0.002;

    public int calculate(int stockPriceCents, int stockQuantity){
        int purchaseFee = (int) (perCentFee*stockPriceCents*stockQuantity);
        if (purchaseFee > minimumFee) {
            return purchaseFee;
        } else {
            return minimumFee;
        }

    }
}
