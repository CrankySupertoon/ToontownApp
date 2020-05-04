package toontownapp;
import toontownapp.cogbuilder.*;
import toontownapp.cogfacilities.CogFacility;

import java.util.ArrayList;

public class calculate {

    public void calculateAmount(Cog cog) {
        CogFacility cogFacility = null;

        cogFacility.setFacilityType(cog.getCogtype());

        switch(cogFacility.getFacilityType()){
            case BOSSBOT: //cogFacility.returnStats(cog); //send to BossbotGolfCourses.java
                break;
            case LAWBOT: //cogFacility.returnStats(cog); //send to LawbotDAOffices.java
                break;
            case CASHBOT: //cogFacility.returnStats(cog); //send to CashbotMint.java
                break;
            case SELLBOT: //cogFacility.returnStats(cog); //send to SellbotFactory.java
                break;
            default: System.out.println("Error: Invalid cogFacility.facilityType in calculate.java"); break;
        }
    }

}
