package toontownapp.cogsuits;
import toontownapp.cogbuilder.*;

public class BossbotSuit {

    public int getStockOptionsNeeded(Cog cog){

        switch(cog.getCogname()){
            case FLUNKY:
                return flunky(cog.getCoglevel());

            case PENCIL_PUSHER:
                return pencilPusher(cog.getCoglevel());

            case YESMAN:
                return yesman(cog.getCoglevel());

            case MICROMANAGER:
                return micromanager(cog.getCoglevel());

            case DOWNSIZER:
                return downsizer(cog.getCoglevel());

            case HEADHUNTER:
                return headHunter(cog.getCoglevel());

            case CORPORATE_RAIDER:
                return corporateRaider(cog.getCoglevel());

            case THE_BIG_CHEESE:
                return theBigCheese(cog.getCoglevel());

            default: System.out.println("Error: Invalid cog.cogname: "+cog.getCogname()); return -1;
        }
    }

    public int flunky(int coglevel){
        switch(coglevel){
            case 1: return 100;
            case 2: return 130;
            case 3: return 160;
            case 4: return 190;
            case 5: return 800;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int pencilPusher(int coglevel){
        switch(coglevel){
            case 2: return 160;
            case 3: return 210;
            case 4: return 260;
            case 5: return 310;
            case 6: return 1300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int yesman(int coglevel){
        switch(coglevel){
            case 3: return 260;
            case 4: return 340;
            case 5: return 420;
            case 6: return 500;
            case 7: return 2100;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int micromanager(int coglevel){
        switch(coglevel){
            case 4: return 420;
            case 5: return 550;
            case 6: return 680;
            case 7: return 810;
            case 8: return 3400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int downsizer(int coglevel){
        switch(coglevel){
            case 5: return 680;
            case 6: return 890;
            case 7: return 1100;
            case 8: return 1310;
            case 9: return 5500;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int headHunter(int coglevel){
        switch(coglevel){
            case 6: return 1100;
            case 7: return 400;
            case 8: return 1780;
            case 9: return 2120;
            case 10: return 8900;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

    public int corporateRaider(int coglevel){
        switch(coglevel){
            case 7: return 1780;
            case 8: return 2330;
            case 9: return 2880;
            case 10: return 3430;
            case 11: return 14400;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
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
                return 2880;
            case 9:
            case 16:
            case 21:
            case 31:
            case 41:
                return 3770;
            case 10:
            case 17:
            case 22:
            case 32:
            case 42:
                return 4660;
            case 11:
            case 18:
            case 23:
            case 33:
            case 43:
                return 5500;
            case 24:
            case 34:
            case 44:
                return 6440;
            case 25:
            case 35:
            case 45:
                return 7330;
            case 26:
            case 36:
            case 46:
                return 8220;
            case 27:
            case 37:
            case 47:
                return 9110;
            case 28:
            case 38:
            case 48:
                return 100000;
            case 12:
            case 19:
            case 29:
            case 39:
            case 49:
                return 23300;
            default: System.out.println("Error: Invalid coglevel "+coglevel); return -1;
        }
    }

}