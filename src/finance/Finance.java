package finance;

/**
 * Created by kristi on 11/10/15.
 * All the math!
 * Calculates stock purchase fees for all countries x all banks.
 */
public class Finance {

    public Finance(){

    }

    public void calculateEST(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for EST fees
        LHV lhv = new LHV();
        int bankFeeLHVEST = lhv.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("LHV EST fee is " + bankFeeLHVEST);

        SWED swed = new SWED();
        int bankFeeSWEDEST = swed.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SWED EST fee is " + bankFeeSWEDEST);

        SEB seb = new SEB();
        int bankFeeSEBEST = seb.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SEB EST fee is " + bankFeeSEBEST);

    }

    public void calculateFINSWE(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for Finnish and Swedish fees
        LHV lhv = new LHV();
        int bankFeeLHVFINSWE = lhv.calculateFINSWE(stockPriceCents, stockQuantity);
        System.out.println("LHV FINSWE fee is " + bankFeeLHVFINSWE);

        SWED swed = new SWED();
        int bankFeeSWEDFINSWE = swed.calculateFINSWE(stockPriceCents,stockQuantity);
        System.out.println("SWED FINSWE fee is " + bankFeeSWEDFINSWE);

        SEB seb = new SEB();
        int bankFeeSEBFINSWE = seb.calculateFINSWE(stockPriceCents,stockQuantity);
        System.out.println("SEB USA fee is " + bankFeeSEBFINSWE);
    }

    public void calculateUSA(int stockPriceCents, int stockQuantity){ // Runs calc for all types of bank for USA fees
        LHV lhv = new LHV();
        int bankFeeLHVUSA = lhv.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("LHV USA fee is " + bankFeeLHVUSA);

        SWED swed = new SWED();
        int bankFeeSWEDUSA = swed.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("SWED USA fee is " + bankFeeSWEDUSA);

        SEB seb = new SEB();
        int bankFeeSEBUSA = seb.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("SEB USA fee is " + bankFeeSEBUSA);
    }

}
