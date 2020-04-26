package toontownapp;

public class SellbotSuit{

    public int getMeritsNeeded(Cog cog){
        switch(cog.cogname){
            case "cold caller":
                return coldCaller(cog.coglevel);
            break;
            case "telemarketer":
                return telemarketer(cog.coglevel);
            break;
            case "name dropper":
                return nameDropper(cog.coglevel);
            break;
            case "glad hander":
                return gladHander(cog.coglevel);
            break;
            case "mover & shaker":
                return moverAndShaker(cog.coglevel);
            break;
            case "two-face":
                return twoface(cog.coglevel);
            break;
            case "the mingler":
                return theMingler(cog.coglevel);
            break;
            case "mr. hollywood":
                return mrHollywood(cog.coglevel);
            break;
            default: System.out.println("Error: Invalid cog.cogname: "+cog.cogname); break;
        }
    }

    public int coldCaller(int coglevel){
        switch(coglevel){
            case 1: return 20; break;
            case 2: return 30; break;
            case 3: return 40; break;
            case 4: return 50; break;
            case 5: return 200; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int telemarketer(int coglevel){
        switch(coglevel){
            case 2: return 40; break;
            case 3: return 50; break;
            case 4: return 60; break;
            case 5: return 70; break;
            case 6: return 300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int nameDropper(int coglevel){
        switch(coglevel){
            case 3: return 60; break;
            case 4: return 80; break;
            case 5: return 100; break;
            case 6: return 120; break;
            case 7: return 500; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int gladHander(int coglevel){
        switch(coglevel){
            case 4: return 100; break;
            case 5: return 130; break;
            case 6: return 160; break;
            case 7: return 190; break;
            case 8: return 800; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int moverAndShaker(int coglevel){
        switch(coglevel){
            case 5: return 160; break;
            case 6: return 210; break;
            case 7: return 260; break;
            case 8: return 310; break;
            case 9: return 1300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int twoface(int coglevel){
        switch(coglevel){
            case 6: return 260; break;
            case 7: return 340; break;
            case 8: return 420; break;
            case 9: return 500; break;
            case 10: return 2100; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int theMingler(int coglevel){
        switch(coglevel){
            case 7: return 420; break;
            case 8: return 5550; break;
            case 9: return 680; break;
            case 10: return 810; break;
            case 11: return 3400; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int theMingler(int coglevel){
        switch(coglevel){
            case 7: return 420; break;
            case 8: return 5550; break;
            case 9: return 680; break;
            case 10: return 810; break;
            case 11: return 3400; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
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
                return 680; break;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 890; break;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 1100; break;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 1310; break;
            case 24:
            case 34:
            case 44:
                return 1520; break;
            case 25:
            case 35:
            case 45:
                return 1730; break;
            case 26:
            case 36:
            case 46:
                return 1940; break;
            case 27:
            case 37:
            case 47:
                return 2150; break;
            case 28:
            case 38:
            case 48:
                return 2360; break;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 5500; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

}