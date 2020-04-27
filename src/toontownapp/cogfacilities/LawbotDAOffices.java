package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.LawbotSuit;

import java.util.ArrayList;

public class LawbotDAOffices extends CogFacility{

    protected CogType facilityType = CogType.LAWBOT;

    public ArrayList<Integer> returnStats(Cog cog) {

        ArrayList<Integer> offices = new ArrayList<Integer>();
        int x = 0, y = 0, z = 0, w = 0; //temporary variables

        LawbotSuit lb = new LawbotSuit();
        int total = lb.getJuryNoticesNeeded(cog);

        //CALCULATE A OFFICES NEEDED
        if (total >= 1842) {
            x = total / 1842; //bullions needed
            total = total % 1842; //extra cogbucks
        }

        //CALCULATE B OFFICES NEEDED
        if(total >= 1370){
            y = total / 1370; //dollars needed
            total = total % 1370; //extra cogbucks
        }

        //CALCULATE C OFFICES NEEDED
        if(total >= 944){
            z = total / 944; //dollars needed
            total = total % 944; //extra cogbucks
        }

        //CALCULATE D OFFICES NEEDED
        w = total / 564; //shorts needed
        total = total % 564; //extra merits
        if (564 >= total && total > 0)//extra merits -> add another short
            w++;

        //ADD TOTALS TO INTEGER ARRAY
        offices.add(x); //number of A offices added
        offices.add(y); //number of B offices added
        offices.add(z); //number of C offices added
        offices.add(w); //number of D offices added
        return offices;
    }

        /*
 TYPE   JURY NOTICES EARNED
    A   564
    B   944
    C   1370
    D   1842
     */
}