package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.CashbotSuit;

import java.util.ArrayList;

public class CashbotMint extends CogFacility{

    protected CogType facilityType = CogType.CASHBOT;

    public ArrayList<Integer> returnStats(Cog cog) {

        ArrayList<Integer> mints = new ArrayList<Integer>();
        int x = 0, y = 0, z = 0; //temporary variables

        CashbotSuit cb = new CashbotSuit();
        int total = cb.getCogbucksNeeded(cog);

        //CALCULATE BULLS NEEDED
        if (total >= 1202) {
            x = total / 1202; //bullions needed
            total = total % 1202; //extra cogbucks
        }

        //CALCULATE DOLLARS NEEDED
        if(total >= 679){
            y = total / 679; //dollars needed
            total = total % 679; //extra cogbucks
        }

        //CALCULATE COINS NEEDED
        z = total / 356; //shorts needed
        total = total % 356; //extra merits
        if (356 >= total && total > 0)//extra merits -> add another short
            z++;

        //ADD TOTALS TO INTEGER ARRAY
        mints.add(x); //number of bulls added
        mints.add(y); //number of dollars added
        mints.add(z); //number of coins added
        return mints;
    }

    /*
    TYPE    COGBUCKS EARNED
    Coin    356 - 554
    Dollar 679 - 1004
    Bullion 1202 - 1496
     */
}