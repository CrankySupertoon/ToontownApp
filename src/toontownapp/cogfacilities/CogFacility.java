package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogType;

import java.util.ArrayList;

public abstract class CogFacility implements CogFacility_IF{

    protected CogType facilityType;

    public abstract ArrayList<Integer> returnStats(Cog cog);

    public abstract void printStats(ArrayList<Integer> nums);

    public void setFacilityType(CogType facilityType) {
        this.facilityType = facilityType;
    }

    public CogType getFacilityType() {
        return facilityType;
    }
}
