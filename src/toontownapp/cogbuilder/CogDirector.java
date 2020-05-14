package toontownapp.cogbuilder;

public class CogDirector {
    private CogBuilder builder;

    public CogIF buildCog(CogType cogtype, int coglvl, CogName cogname){

        CogBuilder cogBuilder = new CogBuilder(cogtype);
        cogBuilder.withCogLevel(coglvl);
        cogBuilder.withCogName(cogname);

        CogIF cog = new Cog(cogBuilder);
        return cog;
    }
}
