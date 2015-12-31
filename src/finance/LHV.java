package finance;

/**
 * Created by kristi on 05/12/15.
 * LHV stock fee = 3 eur + 0.2%
 */
public class LHV {
    int flatFeeEST = 300;
    double perCentFeeEST = 0.002;
    int flatFeeFINSWE = 1100;
    double perCentFeeFINSWE = 0.003;
    int flatFeeUSA = 1100;
    double perCentFeeUSA = 0.003;

    public int calculateEST(int stockPriceCents, int stockQuantity){
        int purchaseFeeEST = flatFeeEST + (int) (perCentFeeEST*stockPriceCents*stockQuantity);
        return purchaseFeeEST;
    }

    public int calculateFINSWE(int stockPriceCents, int stockQuantity){
        int purchaseFeeFINSWE = flatFeeFINSWE + (int) (perCentFeeFINSWE*stockPriceCents*stockQuantity);
        return purchaseFeeFINSWE;
    }

    public int calculateUSA(int stockPriceCents, int stockQuantity){
        int purchaseFeeUSA = flatFeeUSA + (int) (perCentFeeUSA*stockPriceCents*stockQuantity);
        return purchaseFeeUSA;
    }
}
