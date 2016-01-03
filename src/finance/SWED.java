package finance;

/**
 * Created by kristi on 05/12/15.
 * Swed EST stock purchase fee = 0.2% OR min 3 EUR
 * Swed FIN/SWE stock purchase fee = 0.2% OR min 18.85 EUR
 * Swed USA stock purchase fee = 0.2% OR min 18.85 EUR
 */
public class SWED {
    int minimumFeeEST = 320;
    double perCentFeeEST = 0.002;
    int minimumFeeFINSWE = 1885;
    double perCentFeeFINSWE = 0.002;
    int minimumFeeUSA = 1885;
    double perCentFeeUSA = 0.002;

    public Money calculateEST(int stockPriceCents, int stockQuantity){
        int purchaseFeeEST = (int) (perCentFeeEST*stockPriceCents*stockQuantity);
        if (purchaseFeeEST > minimumFeeEST) {
            return new Money(purchaseFeeEST);
        } else {
            return new Money(minimumFeeEST);
        }
    }

    public Money calculateFINSWE(int stockPriceCents, int stockQuantity){
        int purchaseFeeFINSWE = (int) (perCentFeeFINSWE*stockPriceCents*stockQuantity);
        if (purchaseFeeFINSWE > minimumFeeFINSWE){
            return new Money(purchaseFeeFINSWE);
        } else {
            return new Money(minimumFeeFINSWE);
        }
    }

    public Money calculateUSA(int stockPriceCents, int stockQuantity){
        int purchaseFeeUSA = (int) (perCentFeeUSA*stockPriceCents*stockQuantity);
        if (purchaseFeeUSA > minimumFeeUSA){
            return new Money(purchaseFeeUSA);
        } else {
            return new Money(minimumFeeUSA);
        }
    }
}
