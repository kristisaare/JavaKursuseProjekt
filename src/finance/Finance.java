package finance;

import java.util.HashMap;

/**
 * Created by kristi on 11/10/15.
 * All the math!
 * Calculates stock purchase fees for all countries x all banks.
 */
public class Finance {

    public static double reasonableFeePercent = 1.0;

    public Finance(){

    }

    public HashMap calculateEST(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for EST fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVEST = lhv.calculateEST(stockPriceCents, stockQuantity);
        fees.put("LHV", bankFeeLHVEST);

        SWED swed = new SWED();
        Money bankFeeSWEDEST = swed.calculateEST(stockPriceCents, stockQuantity);
        fees.put("SWED", bankFeeSWEDEST);

        SEB seb = new SEB();
        Money bankFeeSEBEST = seb.calculateEST(stockPriceCents, stockQuantity);
        fees.put("SEB", bankFeeSEBEST);

        return fees;

    }

    public HashMap calculateFINSWE(int stockPriceCents, int stockQuantity){ //Runs calc for all types of banks for Finnish and Swedish fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVFINSWE = lhv.calculateFINSWE(stockPriceCents, stockQuantity);
        fees.put("LHV", bankFeeLHVFINSWE);

        SWED swed = new SWED();
        Money bankFeeSWEDFINSWE = swed.calculateFINSWE(stockPriceCents,stockQuantity);
        fees.put("SWED", bankFeeSWEDFINSWE);

        SEB seb = new SEB();
        Money bankFeeSEBFINSWE = seb.calculateFINSWE(stockPriceCents,stockQuantity);
        fees.put("SEB", bankFeeSEBFINSWE);

        return fees;
    }

    public HashMap calculateUSA(int stockPriceCents, int stockQuantity){ // Runs calc for all types of bank for USA fees

        HashMap<String, Money> fees = new HashMap<>();

        LHV lhv = new LHV();
        Money bankFeeLHVUSA = lhv.calculateUSA(stockPriceCents, stockQuantity);
        fees.put("LHV", bankFeeLHVUSA);

        SWED swed = new SWED();
        Money bankFeeSWEDUSA = swed.calculateUSA(stockPriceCents, stockQuantity);
        fees.put("SWED", bankFeeSWEDUSA);

        SEB seb = new SEB();
        Money bankFeeSEBUSA = seb.calculateUSA(stockPriceCents, stockQuantity);
        fees.put("SEB", bankFeeSEBUSA);

        return fees;
    }

    public Money findLowestFee(HashMap<String, Money> results) { //Checks for lowest value. Starts with maxintvalue

        int lowestFee = Integer.MAX_VALUE;

        for (HashMap.Entry<String, Money> valuePair : results.entrySet()) {
            if (lowestFee>valuePair.getValue().getAmountCents()) {
                lowestFee = valuePair.getValue().getAmountCents();
            }
        }

        return new Money(lowestFee);
    }

    public double feeImpactPercent(Money bankFee, Money stockPrice, int stockQuantity){ //Calculates 1% impact of fee vs price
        double feeRatio = (double) bankFee.getAmountCents()/(stockPrice.getAmountCents()*stockQuantity);
        double feePercent = Math.round(feeRatio*1000.0)/10.0; //To not cause rounding issues
        return feePercent;

    }

}
