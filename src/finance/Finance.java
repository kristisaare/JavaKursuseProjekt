package finance;

/**
 * Created by kristi on 11/10/15.
 * All the math!
 */
public class Finance {

    public Finance(){

    }

    public void calculate(int stockPriceCents, int stockQuantity){
        LHV lhv = new LHV();
        int bankFeeLHV = lhv.calculate(stockPriceCents, stockQuantity);
        System.out.println("LHV fee is " + bankFeeLHV);

        SWED swed = new SWED();
        int bankFeeSWED = swed.calculate(stockPriceCents, stockQuantity);
        System.out.println("SWED fee is " + bankFeeSWED);

        SEB seb = new SEB();
        int bankFeeSEB = seb.calculate(stockPriceCents, stockQuantity);
        System.out.println("SEB fee is " + bankFeeSEB);

    }

}
