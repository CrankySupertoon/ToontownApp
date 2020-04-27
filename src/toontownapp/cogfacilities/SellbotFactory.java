package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.SellbotSuit;

import java.util.ArrayList;

public class SellbotFactory extends CogFacility{

        protected CogType facilityType = CogType.SELLBOT;

        public ArrayList<Integer> returnStats(Cog cog) {

            ArrayList<Integer> factories = new ArrayList<Integer>();
            int x = 0, y = 0; //temporary variables

            SellbotSuit sb = new SellbotSuit();
            int total = sb.getMeritsNeeded(cog);

            //CALCULATE LONGS NEEDED
            if (total >= 776) {
                x = total / 776; //longs needed
                total = total % 776; //extra merits
            }

            //CALCULATE SHORTS NEEDED
            y = total / 480; //shorts needed
            total = total % 480; //extra merits
            if (480 >= total && total > 0)//extra merits -> add another short
                y++;

            factories.add(x); //number of longs added
            factories.add(y); //number of shorts added
            return factories;
        }
}

        /*
    TYPE    MERITS EARNED
    Short   480
    Long    776
     */
