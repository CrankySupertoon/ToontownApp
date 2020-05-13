package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;
import toontownapp.cogsuits.BossbotSuit;

import java.util.ArrayList;

public class BossbotGolfCourses extends CogFacility{

    //protected CogType facilityType = CogType.BOSSBOT;


    public String printStats(ArrayList<Integer> nums){
        //System.out.print("You need :\n\t" + nums.get(0) + " back nine(s),\n\t");
        //System.out.print(nums.get(1) + " middle six(es), and \n\t");
        //System.out.print(nums.get(2) + " front three(s).\n");
        //testing this for gui
        String x;
        x="You need :\n  " + nums.get(0) + " back nine(s),\n  ";
        x+=nums.get(1) + " middle six(es), and \n  ";
        x+=nums.get(2) + " front three(s).\n";
        return x;
    }

    public String returnStats(Cog cog) {

        //System.out.println("in Bossbot returnStats(cog)");

        ArrayList<Integer> golfCourses = new ArrayList<Integer>();
        int x = 0, y = 0, z = 0; //temporary variables

        BossbotSuit bbsuit = new BossbotSuit();
        int total = bbsuit.getStockOptionsNeeded(cog);

        //CALCULATE BACK NINES NEEDED
        if (total >= 3350) {
            x = total / 3350; //back nines needed
            total = total % 3350; //extra stock options
        }
        if(3350 > total && total > 1874){
            x++;
            total = total - 3550;
        }

        //CALCULATE MIDDLE SIXES NEEDED
        if(total >= 1874){
            y = total / 1874; //middle sixes needed
            total = total % 1874; //extra stock options
        }
        if(1874 > total && total > 764){
            y++;
            total = total % 1874;
        }

        //CALCULATE FRONT THREES NEEDED
        if (764 >= total && total > 0){
            z = total / 764; //front threes needed
            z++;
        }

        //ADD TOTALS TO INTEGER ARRAY
        golfCourses.add(x); //number of back nines added
        golfCourses.add(y); //number of middle sixes added
        golfCourses.add(z); //number of front threes added
        this.printStats(golfCourses);
        return this.printStats(golfCourses);
    }

        /*
    TYPE            STOCK OPTIONS
    Front Three     764
    Middle Six      1874
    Back Nine       3350
     */

}