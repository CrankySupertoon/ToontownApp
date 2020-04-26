package toontownapp;

public class BossbotSuit{

    public int getStockOptionsNeeded(Cog cog){
        switch(cog.cogname){
            case "flunky":
                return coldCaller(cog.coglevel);
            break;
            case "pencil pusher":
                return pencilPusher(cog.coglevel);
            break;
            case "yesman":
                return yesman(cog.coglevel);
            break;
            case "micromanager":
                return beanCounter(cog.coglevel);
            break;
            case "downsizer":
                return downsizer(cog.coglevel);
            break;
            case "head hunter":
                return headHunter(cog.coglevel);
            break;
            case "corporate raider":
                return corporateRaider(cog.coglevel);
            break;
            case "the big cheese":
                return theBigCheese(cog.coglevel);
            break;
            default: System.out.println("Error: Invalid cog.cogname: "+cog.cogname); break;
        }
    }

    public int flunky(int coglevel){
        switch(coglevel){
            case 1: return 100; break;
            case 2: return 130; break;
            case 3: return 160; break;
            case 4: return 190; break;
            case 5: return 800; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int pencilPusher(int coglevel){
        switch(coglevel){
            case 2: return 160; break;
            case 3: return 210; break;
            case 4: return 260; break;
            case 5: return 310; break;
            case 6: return 1300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int yesman(int coglevel){
        switch(coglevel){
            case 3: return 260; break;
            case 4: return 340; break;
            case 5: return 420; break;
            case 6: return 500; break;
            case 7: return 2100; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int micromanager(int coglevel){
        switch(coglevel){
            case 4: return 420; break;
            case 5: return 550; break;
            case 6: return 680; break;
            case 7: return 810; break;
            case 8: return 3400; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int downsizer(int coglevel){
        switch(coglevel){
            case 5: return 680; break;
            case 6: return 890; break;
            case 7: return 1100; break;
            case 8: return 1310; break;
            case 9: return 5500; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int headHunter(int coglevel){
        switch(coglevel){
            case 6: return 1100; break;
            case 7: return 400; break;
            case 8: return 1780; break;
            case 9: return 2120; break;
            case 10: return 8900; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int corporateRaider(int coglevel){
        switch(coglevel){
            case 7: return 1780; break;
            case 8: return 2330; break;
            case 9: return 2880; break;
            case 10: return 3430; break;
            case 11: return 14400; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

    public int theBigCheese(int coglevel){
        switch(coglevel){
            case 8:
            case 13:
            case 15:
            case 20:
            case 30:
            case 40:
                return 2880; break;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 3770; break;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 4660; break;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 5500; break;
            case 24:
            case 34:
            case 44:
                return 6440; break;
            case 25:
            case 35:
            case 45:
                return 7330; break;
            case 26:
            case 36:
            case 46:
                return 8220; break;
            case 27:
            case 37:
            case 47:
                return 9110; break;
            case 28:
            case 38:
            case 48:
                return 100000; break;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 23300; break;
            default: System.out.println("Error: Invalid coglevel "+coglevel); break;
        }
    }

}