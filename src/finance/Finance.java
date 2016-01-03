package finance;

import java.util.HashMap;

/**
 * Created by kristi on 11/10/15.
 * All the math!
 * Calculates stock purchase fees for all countries x all banks.
 */
public class Finance {

    public Finance(){

    }

    public HashMap calculateEST(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for EST fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVEST = lhv.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("LHV EST fee is " + bankFeeLHVEST.getAmountCents());
        fees.put("LHV", bankFeeLHVEST);

        SWED swed = new SWED();
        Money bankFeeSWEDEST = swed.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SWED EST fee " + bankFeeSWEDEST.getAmountCents());
        fees.put("SWED", bankFeeSWEDEST);

        SEB seb = new SEB();
        Money bankFeeSEBEST = seb.calculateEST(stockPriceCents, stockQuantity);
        System.out.println("SEB EST fee is " + bankFeeSEBEST.getAmountCents());
        fees.put("SEB", bankFeeSEBEST);

        return fees;

    }

    public HashMap calculateFINSWE(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for Finnish and Swedish fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVFINSWE = lhv.calculateFINSWE(stockPriceCents, stockQuantity);
        System.out.println("LHV FINSWE fee is " + bankFeeLHVFINSWE.getAmountCents());
        fees.put("LHV", bankFeeLHVFINSWE);

        SWED swed = new SWED();
        Money bankFeeSWEDFINSWE = swed.calculateFINSWE(stockPriceCents,stockQuantity);
        System.out.println("SWED FINSWE fee is " + bankFeeSWEDFINSWE.getAmountCents());
        fees.put("SWED", bankFeeSWEDFINSWE);

        SEB seb = new SEB();
        Money bankFeeSEBFINSWE = seb.calculateFINSWE(stockPriceCents,stockQuantity);
        System.out.println("SEB FINSWE fee is " + bankFeeSEBFINSWE.getAmountCents());
        fees.put("SEB", bankFeeSEBFINSWE);

        return fees;
    }

    public HashMap calculateUSA(int stockPriceCents, int stockQuantity){ // Runs calc for all types of bank for USA fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVUSA = lhv.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("LHV USA fee is " + bankFeeLHVUSA.getAmountCents());
        fees.put("LHV", bankFeeLHVUSA);

        SWED swed = new SWED();
        Money bankFeeSWEDUSA = swed.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("SWED USA fee is " + bankFeeSWEDUSA.getAmountCents());
        fees.put("SWED", bankFeeSWEDUSA);

        SEB seb = new SEB();
        Money bankFeeSEBUSA = seb.calculateUSA(stockPriceCents, stockQuantity);
        System.out.println("SEB USA fee is " + bankFeeSEBUSA.getAmountCents());
        fees.put("SEB", bankFeeSEBUSA);

        return fees;
    }

}
