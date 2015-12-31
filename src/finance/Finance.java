package finance;

/**
 * Created by kristi on 11/10/15.
 * All the math!
 */
public class Finance {

    public Finance(){

    }

    public void calculateEST(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for EST fees
        LHV lhv = new LHV();
        int bankFeeLHVEST = lhv.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("LHV fee is " + bankFeeLHVEST);

        SWED swed = new SWED();
        int bankFeeSWEDEST = swed.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SWED fee is " + bankFeeSWEDEST);

        SEB seb = new SEB();
        int bankFeeSEBEST = seb.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SEB fee is " + bankFeeSEBEST);

    }

    public void calculateFINSWE(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for Finnish and Swedish fees

    }

    public void calculateUSA(int stockPriceCents, int stockQuantity){ // Runs calc for all types of bank for USA fees

    }

}
