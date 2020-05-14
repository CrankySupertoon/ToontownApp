package toontownapp.cogfacilities;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogIF;
import toontownapp.cogbuilder.CogType;

import java.util.ArrayList;

public interface CogFacility_IF {
    abstract String returnStats(CogIF cog);
    abstract String printStats(ArrayList<Integer> nums);
}
