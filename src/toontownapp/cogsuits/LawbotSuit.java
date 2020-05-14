package toontownapp.cogsuits;
import toontownapp.cogbuilder.*;

public class LawbotSuit{

    public int getJuryNoticesNeeded(CogIF cog){

        switch(cog.getCogname()){
            case BOTTOM_FEEDER:
                return bottomFeeder(cog.getCoglevel());

            case BLOODSUCKER:
                return bloodsucker(cog.getCoglevel());

            case DOUBLE_TALKER:
                return doubleTalker(cog.getCoglevel());

            case AMBULANCE_CHASER:
                return ambulanceChaser(cog.getCoglevel());

            case BACK_STABBER:
                return backStabber(cog.getCoglevel());

            case SPIN_DOCTOR:
                return spinDoctor(cog.getCoglevel());

            case LEGAL_EAGLE:
                return legalEagle(cog.getCoglevel());

            case BIG_WIG:
                return bigWig(cog.getCoglevel());

            default: System.out.println("Error: Invalid cog.cogname: "+cog.getCogname()); return -1;
        }
    }

    public int bottomFeeder(int coglevel){
        switch(coglevel){
            case 1: return 60;
            case 2: return 80;
            case 3: return 100;
            case 4: return 120;
            case 5: return 500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int bloodsucker(int coglevel){
        switch(coglevel){
            case 2: return 100;
            case 3: return 130;
            case 4: return 160;
            case 5: return 190;
            case 6: return 800;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int doubleTalker(int coglevel){
        switch(coglevel){
            case 3: return 160;
            case 4: return 210;
            case 5: return 260;
            case 6: return 310;
            case 7: return 1300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int ambulanceChaser(int coglevel){
        switch(coglevel){
            case 4: return 260;
            case 5: return 340;
            case 6: return 420;
            case 7: return 500;
            case 8: return 2100;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int backStabber(int coglevel){
        switch(coglevel){
            case 5: return 420;
            case 6: return 550;
            case 7: return 680;
            case 8: return 810;
            case 9: return 3400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int spinDoctor(int coglevel){
        switch(coglevel){
            case 6: return 680;
            case 7: return 890;
            case 8: return 1100;
            case 9: return 1310;
            case 10: return 5500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int legalEagle(int coglevel){
        switch(coglevel){
            case 7: return 1100;
            case 8: return 400;
            case 9: return 1780;
            case 10: return 2120;
            case 11: return 8900;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int bigWig(int coglevel){
        switch(coglevel){
            case 8:
            case 13:
            case 15:
            case 20:
            case 30:
            case 40:
                return 1780;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 2330;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 2880;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 3430;
            case 24:
            case 34:
            case 44:
                return 3980;
            case 25:
            case 35:
            case 45:
                return 4530;
            case 26:
            case 36:
            case 46:
                return 5080;
            case 27:
            case 37:
            case 47:
                return 5630;
            case 28:
            case 38:
            case 48:
                return 6180;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 14400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }
}