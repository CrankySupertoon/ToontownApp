package toontownapp.cogsuits;
import toontownapp.cogbuilder.*;

public class SellbotSuit{

    public int getMeritsNeeded(CogIF cog){

        switch(cog.getCogname()){
            case COLD_CALLER:
                return coldCaller(cog.getCoglevel());

            case TELEMARKETER:
                return telemarketer(cog.getCoglevel());

            case NAME_DROPPER:
                return nameDropper(cog.getCoglevel());

            case GLAD_HANDER:
                return gladHander(cog.getCoglevel());

            case MOVER_AND_SHAKER:
                return moverAndShaker(cog.getCoglevel());

            case TWO_FACE:
                return twoface(cog.getCoglevel());

            case THE_MINGLER:
                return theMingler(cog.getCoglevel());

            case MR_HOLLYWOOD:
                return mrHollywood(cog.getCoglevel());

            default: System.out.println("Error: Invalid cog.cogname: "+cog.getCogname()); return -1;
        }
    }

    public int coldCaller(int coglevel){
        switch(coglevel){
            case 1: return 20;
            case 2: return 30;
            case 3: return 40;
            case 4: return 50;
            case 5: return 200;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int telemarketer(int coglevel){
        switch(coglevel){
            case 2: return 40;
            case 3: return 50;
            case 4: return 60;
            case 5: return 70;
            case 6: return 300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int nameDropper(int coglevel){
        switch(coglevel){
            case 3: return 60;
            case 4: return 80;
            case 5: return 100;
            case 6: return 120;
            case 7: return 500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int gladHander(int coglevel){
        switch(coglevel){
            case 4: return 100;
            case 5: return 130;
            case 6: return 160;
            case 7: return 190;
            case 8: return 800;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int moverAndShaker(int coglevel){
        switch(coglevel){
            case 5: return 160;
            case 6: return 210;
            case 7: return 260;
            case 8: return 310;
            case 9: return 1300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int twoface(int coglevel){
        switch(coglevel){
            case 6: return 260;
            case 7: return 340;
            case 8: return 420;
            case 9: return 500;
            case 10: return 2100;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int theMingler(int coglevel){
        switch(coglevel){
            case 7: return 420;
            case 8: return 5550;
            case 9: return 680;
            case 10: return 810;
            case 11: return 3400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int mrHollywood(int coglevel){
        switch(coglevel){
            case 8:
            case 13:
            case 15:
            case 20:
            case 30:
            case 40:
                return 680;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 890;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 1100;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 1310;
            case 24:
            case 34:
            case 44:
                return 1520;
            case 25:
            case 35:
            case 45:
                return 1730;
            case 26:
            case 36:
            case 46:
                return 1940;
            case 27:
            case 37:
            case 47:
                return 2150;
            case 28:
            case 38:
            case 48:
                return 2360;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 5500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

}