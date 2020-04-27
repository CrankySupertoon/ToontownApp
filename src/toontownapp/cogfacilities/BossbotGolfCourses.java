package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.BossbotSuit;

import java.util.ArrayList;

public class BossbotGolfCourses extends CogFacility{

    protected CogType facilityType = CogType.BOSSBOT;

    public ArrayList<Integer> returnStats(Cog cog) {

        ArrayList<Integer> golfCourses = new ArrayList<Integer>();
        int x = 0, y = 0, z = 0; //temporary variables

        BossbotSuit bbsuit = new BossbotSuit();
        int total = bbsuit.getStockOptionsNeeded(cog);

        //CALCULATE BACK NINES NEEDED
        if (total >= 3350) {
            x = total / 3350; //bullions needed
            total = total % 3350; //extra cogbucks
        }

        //CALCULATE MIDDLE SIXES NEEDED
        if(total >= 1874){
            y = total / 1874; //dollars needed
            total = total % 1874; //extra cogbucks
        }

        //CALCULATE FRONT THREES NEEDED
        z = total / 764; //shorts needed
        total = total % 764; //extra merits
        if (764 >= total && total > 0)//extra merits -> add another short
            z++;

        //ADD TOTALS TO INTEGER ARRAY
        golfCourses.add(x); //number of back nines added
        golfCourses.add(y); //number of middle sixes added
        golfCourses.add(z); //number of front threes added
        return golfCourses;
    }

        /*
    TYPE            STOCK OPTIONS
    Front Three     764
    Middle Six      1874
    Back Nine       3350
     */

}