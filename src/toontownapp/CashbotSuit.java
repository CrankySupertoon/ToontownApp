package toontownapp;

public class CashbotSuit{

    public int getCogbucksNeeded(Cog cog){
        switch(cog.cogname){
            case "short change":
                return coldCaller(cog.coglevel);
            break;
            case "penny pincher":
                return pennyPincher(cog.coglevel);
            break;
            case "tightwad":
                return tightwad(cog.coglevel);
            break;
            case "bean counter":
                return beanCounter(cog.coglevel);
            break;
            case "number cruncher":
                return numberCruncher(cog.coglevel);
            break;
            case "money bags":
                return moneyBags(cog.coglevel);
            break;
            case "loan shark":
                return loanShark(cog.coglevel);
            break;
            case "robber baron":
                return robberBaron(cog.coglevel);
            break;
            default: System.out.println("Error: Invalid cog.cogname: "+cog.cogname); break;
        }
    }

    public int shortChange(int coglevel){
        switch(coglevel){
            case 1: return 40; break;
            case 2: return 50; break;
            case 3: return 60; break;
            case 4: return 70; break;
            case 5: return 300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int pennyPincher(int coglevel){
        switch(coglevel){
            case 2: return 60; break;
            case 3: return 80; break;
            case 4: return 100; break;
            case 5: return 120; break;
            case 6: return 500; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int tightwad(int coglevel){
        switch(coglevel){
            case 3: return 100; break;
            case 4: return 130; break;
            case 5: return 160; break;
            case 6: return 190; break;
            case 7: return 800; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int beanCounter(int coglevel){
        switch(coglevel){
            case 4: return 160; break;
            case 5: return 210; break;
            case 6: return 260; break;
            case 7: return 310; break;
            case 8: return 1300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int numberCruncher(int coglevel){
        switch(coglevel){
            case 5: return 260; break;
            case 6: return 340; break;
            case 7: return 420; break;
            case 8: return 500; break;
            case 9: return 2100; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int moneyBags(int coglevel){
        switch(coglevel){
            case 6: return 420; break;
            case 7: return 550; break;
            case 8: return 680; break;
            case 9: return 810; break;
            case 10: return 3400; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int loanShark(int coglevel){
        switch(coglevel){
            case 7: return 680; break;
            case 8: return 890; break;
            case 9: return 1100; break;
            case 10: return 1310; break;
            case 11: return 5500; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
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
                return 1100; break;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 1440; break;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 1780; break;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 2120; break;
            case 24:
            case 34:
            case 44:
                return 2460; break;
            case 25:
            case 35:
            case 45:
                return 2800; break;
            case 26:
            case 36:
            case 46:
                return 3140; break;
            case 27:
            case 37:
            case 47:
                return 2150; break;
            case 28:
            case 38:
            case 48:
                return 3480; break;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 8900; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

}