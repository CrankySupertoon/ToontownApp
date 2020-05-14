package toontownapp.cogsuits;

import toontownapp.cogbuilder.CogIF;
import toontownapp.cogfacilities.*;

public class CogSuitFacade {

    public String findCogSuit(CogIF cog){

        CogFacility_IF cogFacility_if = null;

        switch (cog.getCogtype()) {
            case BOSSBOT: cogFacility_if = new BossbotGolfCourses();
                break;
            case LAWBOT: cogFacility_if = new LawbotDAOffices();
                break;
            case CASHBOT: cogFacility_if = new CashbotMint();
                break;
            case SELLBOT: cogFacility_if = new SellbotFactory();
                break;
            default: System.out.println("Error: invalid choice; ending program");
                System.exit(0);
                break;
        }
        return "\n\n"+cogFacility_if.returnStats(cog)+"\n";
    }//findCogSuit()
}
