package finance;

/**
 * Created by kristi on 05/12/15.
 * Swed stock purchase fee = 0.2% OR min 3 EUR
 */
public class SWED {
    int minimumFeeEST = 320;
    double perCentFeeEST = 0.002;
    int minimumFeeFINSWE = 1885;
    double perCentFeeFINSWE = 0.002;
    int minimumFeeUSA = 1885;
    double perCentFeeUSA = 0.002;

    public int calculateEST(int stockPriceCents, int stockQuantity){
        int purchaseFeeEST = (int) (perCentFeeEST*stockPriceCents*stockQuantity);
        if (purchaseFeeEST > minimumFeeEST) {
            return purchaseFeeEST;
        } else {
            return minimumFeeEST;
        }
    }

    public int calculateFINSWE(int stockPriceCents, int stockQuantity){
        int purchaseFeeFINSWE = (int) (perCentFeeFINSWE*stockPriceCents*stockQuantity);
        if (purchaseFeeFINSWE > minimumFeeFINSWE){
            return purchaseFeeFINSWE;
        } else {
            return minimumFeeFINSWE;
        }
    }

    public int calculateUSA(int stockPriceCents, int stockQuantity){
        int purchaseFeeUSA = (int) (perCentFeeUSA*stockPriceCents*stockQuantity);
        if (purchaseFeeUSA > minimumFeeUSA){
            return purchaseFeeUSA;
        } else {
            return minimumFeeUSA
        }
    }
}
