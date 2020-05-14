package toontownapp.cogsuits;
import toontownapp.cogbuilder.*;

public class CashbotSuit{

    public int getCogbucksNeeded(CogIF cog){

        switch(cog.getCogname()){
            case SHORT_CHANGE:
                return shortChange(cog.getCoglevel());

            case PENNY_PINCHER:
                return pennyPincher(cog.getCoglevel());

            case TIGHTWAD:
                return tightwad(cog.getCoglevel());

            case BEAN_COUNTER:
                return beanCounter(cog.getCoglevel());

            case NUMBER_CRUNCHER:
                return numberCruncher(cog.getCoglevel());

            case MONEY_BAGS:
                return moneyBags(cog.getCoglevel());

            case LOAN_SHARK:
                return loanShark(cog.getCoglevel());

            case ROBBER_BARON:
                return robberBaron(cog.getCoglevel());

            default: System.out.println("Error: Invalid cog.cogname: "+cog.getCogname()); return -1;
        }
    }

    public int shortChange(int coglevel){
        switch(coglevel){
            case 1: return 40;
            case 2: return 50;
            case 3: return 60;
            case 4: return 70;
            case 5: return 300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int pennyPincher(int coglevel){
        switch(coglevel){
            case 2: return 60;
            case 3: return 80;
            case 4: return 100;
            case 5: return 120;
            case 6: return 500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int tightwad(int coglevel){
        switch(coglevel){
            case 3: return 100;
            case 4: return 130;
            case 5: return 160;
            case 6: return 190;
            case 7: return 800;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int beanCounter(int coglevel){
        switch(coglevel){
            case 4: return 160;
            case 5: return 210;
            case 6: return 260;
            case 7: return 310;
            case 8: return 1300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int numberCruncher(int coglevel){
        switch(coglevel){
            case 5: return 260;
            case 6: return 340;
            case 7: return 420;
            case 8: return 500;
            case 9: return 2100;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int moneyBags(int coglevel){
        switch(coglevel){
            case 6: return 420;
            case 7: return 550;
            case 8: return 680;
            case 9: return 810;
            case 10: return 3400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int loanShark(int coglevel){
        switch(coglevel){
            case 7: return 680;
            case 8: return 890;
            case 9: return 1100;
            case 10: return 1310;
            case 11: return 5500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int robberBaron(int coglevel){
        switch(coglevel){
            case 8:
            case 13:
            case 15:
            case 20:
            case 30:
            case 40:
                return 1100;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 1440;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 1780;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 2120;
            case 24:
            case 34:
            case 44:
                return 2460;
            case 25:
            case 35:
            case 45:
                return 2800;
            case 26:
            case 36:
            case 46:
                return 3140;
            case 27:
            case 37:
            case 47:
                return 2150;
            case 28:
            case 38:
            case 48:
                return 3480;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 8900;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

}