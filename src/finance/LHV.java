package finance;

/**
 * Created by kristi on 05/12/15.
 * LHV EST stock purchase fee = 3 eur + 0.2%
 * LHV FIN/SWE stock purchase fee = 11 EUR + 0.3%
 * LHV USA stock purchase fee = 11 EUR + 0.3%
 */
public class LHV {
    int flatFeeEST = 300;
    double perCentFeeEST = 0.002;
    int flatFeeFINSWE = 1100;
    double perCentFeeFINSWE = 0.003;
    int flatFeeUSA = 1100;
    double perCentFeeUSA = 0.003;

    public Money calculateEST(int stockPriceCents, int stockQuantity){
        int purchaseFeeEST = flatFeeEST + (int) (perCentFeeEST*stockPriceCents*stockQuantity);
        return new Money(purchaseFeeEST);
    }

    public Money calculateFINSWE(int stockPriceCents, int stockQuantity){
        int purchaseFeeFINSWE = flatFeeFINSWE + (int) (perCentFeeFINSWE*stockPriceCents*stockQuantity);
        return new Money(purchaseFeeFINSWE);
    }

    public Money calculateUSA(int stockPriceCents, int stockQuantity){
        int purchaseFeeUSA = flatFeeUSA + (int) (perCentFeeUSA*stockPriceCents*stockQuantity);
        return new Money(purchaseFeeUSA);
    }
}
