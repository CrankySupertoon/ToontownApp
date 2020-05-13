package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;

import java.util.ArrayList;

public interface CogFacility_IF {

    //CogType facilityType = null;
    abstract String returnStats(Cog cog);
    abstract String printStats(ArrayList<Integer> nums);
    //public void setFacilityType(CogType facilityType);
    //public CogType getFacilityType();
}
