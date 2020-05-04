package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;

import java.util.ArrayList;

public interface CogFacility_IF {

    //CogType facilityType = null;
    abstract ArrayList<Integer> returnStats(Cog cog);

    //public void setFacilityType(CogType facilityType);
    //public CogType getFacilityType();
}
