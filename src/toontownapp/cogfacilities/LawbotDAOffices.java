package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.LawbotSuit;

import java.util.ArrayList;

public class LawbotDAOffices extends CogFacility{

    //protected CogType facilityType = CogType.LAWBOT;

    public ArrayList<Integer> returnStats(Cog cog) {

        System.out.println("in LAWBOT returnStats(cog)");

        ArrayList<Integer> offices = new ArrayList<Integer>();
        int a = 0, b = 0, c = 0, d = 0; //temporary variables

        LawbotSuit lb = new LawbotSuit();
        int total = lb.getJuryNoticesNeeded(cog);

        //CALCULATE D OFFICES NEEDED
        if (total >= 1842) {
            d = total / 1842; //D Offices Needed
            total = total % 1842; //extra jury notices
        }
        if(1842 > total && total > 1370){
            d++;
            total = total % 1842;
        }

        //CALCULATE C OFFICES NEEDED
        if(total >= 1370){
            c = total / 1370; //C Offices Needed
            total = total % 1370; //extra jury notices
        }
        if(1370 > total && total > 944){
            c++;
            total = total % 1270;
        }
        //CALCULATE B OFFICES NEEDED
        if(total >= 944){
            b = total / 944; //B Offices Needed
            total = total % 944; //extra jury notices
        }
        if(944 > total && total > 564){
            b++;
            total = total % 944;
        }

        //CALCULATE A OFFICES NEEDED
        if(total <= 564){
            a = total / 564; //A Offices Needed
            total = total % 564; //extra jury notices
            if (564 >= total && total > 0)//extra jury notices -> add another A Office
                a++;
        }

        //ADD TOTALS TO INTEGER ARRAY
        offices.add(d); //number of D offices added
        offices.add(c); //number of C offices added
        offices.add(b); //number of B offices added
        offices.add(a); //number of A offices added
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