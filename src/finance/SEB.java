package finance;

/**
 * Created by kristi on 05/12/15.
 * SEB stock purchase fee = 0.2% OR min 3 EUR
 */
public class SEB {
    int minimumFeeEST = 320;
    double perCentFeeEST = 0.002;
    int flatFeeFINSWE = 1400;
    double percentFeeFINSWE = 0.002;
    int flatFeeUSA = 1400;
    double perCentFeeUSA = 0.002;
    int lowPriceFeeUSA = 1;


    public int calculateEST(int stockPriceCents, int stockQuantity) {
        int purchaseFeeEST = (int) (perCentFeeEST * stockPriceCents * stockQuantity);
        if (purchaseFeeEST > minimumFeeEST) {
            return purchaseFeeEST;
        }else{
            return minimumFeeEST;
        }
    }

    public int calculateFINSWE(int stockPriceCents, int stockQuantity){
        int purchaseFeeFINSWE = flatFeeFINSWE + (int) (percentFeeFINSWE*stockPriceCents*stockQuantity);
        return purchaseFeeFINSWE;
    }

    public int calculateUSA(int stockPriceCents, int stockQuantity){
        if (stockPriceCents<500){
            int purchaseFeeUSA = (stockPriceCents*lowPriceFeeUSA*stockQuantity);
            return purchaseFeeUSA;
        }else{
            int purchaseFeeUSA = flatFeeUSA + (int) (stockPriceCents*perCentFeeUSA*stockQuantity);
            return purchaseFeeUSA;
        }
    }

}
