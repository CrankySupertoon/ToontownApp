/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toontownapp.Test;

import toontownapp.cogbuilder.Cog;
import toontownapp.cogbuilder.CogBuilder;
import toontownapp.cogbuilder.CogName;
import toontownapp.cogbuilder.CogType;
//import toontownapp.cogfacilities.BossbotGolfCourses;
//import toontownapp.cogfacilities.BossbotGolfCourses;
import toontownapp.cogfacilities.*;
import toontownapp.cogsuits.BossbotSuit;
import toontownapp.cogsuits.CashbotSuit;
import toontownapp.cogsuits.LawbotSuit;
import toontownapp.cogsuits.SellbotSuit;

import java.util.ArrayList;
import java.util.Scanner;

public class ToontownApp {

  CogName cogname;
  CogType cogtype;
  int coglvl;
  Cog cog;
  Scanner in = new Scanner(System.in);
  int choice1, choice2;

  public void menu(){
    
    //Cog cog = new Cog();
    int on = 1;

    while( on == 1) {
      System.out.println("Select a Cog Suit\n");
      System.out.println("1 - Bossbot");
      System.out.println("2 - Lawbot");
      System.out.println("3 - Cashbot");
      System.out.println("4 - Sellbot");
      System.out.println("5 - Exit");

      Scanner in = new Scanner(System.in);
      int choice = in.nextInt();

      switch (choice) {
        case 1:
          cogtype = CogType.BOSSBOT;
          Bossbot();
          break;
        case 2:
          cogtype = CogType.LAWBOT;
          Lawbot();
          break;
        case 3:
          cogtype = CogType.CASHBOT;
          Cashbot();
          break;
        case 4:
          cogtype = CogType.SELLBOT;
          Sellbot();
          break;
        default:
          on = 0;
        case 5:
          System.exit(0);
      }

      buildCog();
      findCogSuit();
    }
  }//end menu()

  public void buildCog(){
    CogBuilder cogBuilder = new CogBuilder(cogtype);
    cogBuilder.withCogLevel(coglvl);
    cogBuilder.withCogName(cogname);

    cog = new Cog(cogBuilder);
    System.out.println(cog.getCoglevel() + " " + cog.getCogname() + " " + cog.getCogtype());
  }
  
  public void Bossbot(){
    System.out.println("\n\t1 -- Flunky");
    System.out.println("\t2 -- Pencil Pusher");
    System.out.println("\t3 -- Yesman");
    System.out.println("\t4 -- Micromanager");
    System.out.println("\t5 -- Downsizer");
    System.out.println("\t6 -- Head Hunter");
    System.out.println("\t7 -- Corporate Raider");
    System.out.println("\t8 -- The Big Cheese");
    System.out.println("Select Bossbot: ");
    choice1 = in.nextInt();
    cogname = findBossbot(choice1);

    System.out.println("What level are you?");
    coglvl = in.nextInt();

  }
  public void Lawbot(){
    System.out.println("\n\t1 -- Bottom Feeder");
    System.out.println("\t2 -- Bloodsucker");
    System.out.println("\t3 -- Double Talker");
    System.out.println("\t4 -- Ambulance Chaser");
    System.out.println("\t5 -- Back Stabber");
    System.out.println("\t6 -- Spin Doctor");
    System.out.println("\t7 -- Legal Eagle");
    System.out.println("\t8 -- Big Wig");
    System.out.println("Select Lawbot: ");
    choice1 = in.nextInt();
    cogname = findLawbot(choice1);

    System.out.println("What level are you?");
    coglvl = in.nextInt();
  }
  public void Cashbot(){
    System.out.println("\n\t1 -- Short Change");
    System.out.println("\t2 -- Penny Pincher");
    System.out.println("\t3 -- Tightwad");
    System.out.println("\t4 -- Bean Counter");
    System.out.println("\t5 -- Number Cruncher");
    System.out.println("\t6 -- Money Bags");
    System.out.println("\t7 -- Loan Shark");
    System.out.println("\t8 -- Robber Baron");
    System.out.println("Select Cashbot: ");
    choice1 = in.nextInt();
    cogname = findCashbot(choice1);

    System.out.println("What level are you?");
    coglvl = in.nextInt();
  }
  public void Sellbot(){
    System.out.println("Select Sellbot: ");
    System.out.println("\n\t1 -- Cold Caller");
    System.out.println("\t2 -- Telemarketer");
    System.out.println("\t3 -- Name Dropper");
    System.out.println("\t4 -- Glad Hander");
    System.out.println("\t5 -- Mover & Shaker");
    System.out.println("\t6 -- Two-Face");
    System.out.println("\t7 -- The Mingler");
    System.out.println("\t8 -- Mr. Hollywood");
    choice1 = in.nextInt();
    cogname = findSellbot(choice1);

    System.out.println("What level are you?");
    coglvl = in.nextInt();
  }

  public CogName findBossbot(int num){
    switch (num) {
      case 1: return CogName.FLUNKY;
      case 2: return CogName.PENCIL_PUSHER;
      case 3: return CogName.YESMAN;
      case 4: return CogName.MICROMANAGER;
      case 5: return CogName.DOWNSIZER;
      case 6: return CogName.HEADHUNTER;
      case 7: return CogName.CORPORATE_RAIDER;
      case 8: return CogName.THE_BIG_CHEESE;
      default: System.out.println("Error: Invalid num: "+num+"; returning flunky"); return CogName.FLUNKY;
    }
  }
  public CogName findLawbot(int num){
    switch (num) {
      case 1: return CogName.BOTTOM_FEEDER;
      case 2: return CogName.BLOODSUCKER;
      case 3: return CogName.DOUBLE_TALKER;
      case 4: return CogName.AMBULANCE_CHASER;
      case 5: return CogName.BACK_STABBER;
      case 6: return CogName.SPIN_DOCTOR;
      case 7: return CogName.LEGAL_EAGLE;
      case 8: return CogName.BIG_WIG;
      default: System.out.println("Error: Invalid num: "+num+"; returning bottom feeder"); return CogName.BOTTOM_FEEDER;
    }
  }
  public CogName findCashbot(int num){
    switch (num) {
      case 1: return CogName.SHORT_CHANGE;
      case 2: return CogName.PENNY_PINCHER;
      case 3: return CogName.TIGHTWAD;
      case 4: return CogName.BEAN_COUNTER;
      case 5: return CogName.NUMBER_CRUNCHER;
      case 6: return CogName.MONEY_BAGS;
      case 7: return CogName.LOAN_SHARK;
      case 8: return CogName.ROBBER_BARON;

      default: System.out.println("Error: Invalid num: "+num+"; returning short change"); return CogName.SHORT_CHANGE;
    }
  }
  public CogName findSellbot(int num){
    switch (num) {
      case 1: return CogName.COLD_CALLER;
      case 2: return CogName.TELEMARKETER;
      case 3: return CogName.NAME_DROPPER;
      case 4: return CogName.GLAD_HANDER;
      case 5: return CogName.MOVER_AND_SHAKER;
      case 6: return CogName.TWO_FACE;
      case 7: return CogName.THE_MINGLER;
      case 8: return CogName.MR_HOLLYWOOD;
      default: System.out.println("Error: Invalid num: "+num+"; returning cold caller"); return CogName.COLD_CALLER;
    }
  }

  public void findCogSuit(){
    int num = 0;

    ArrayList<Integer> numsNeeded = new ArrayList<Integer>();
    CogFacility_IF cogFacility_if = null;

    switch (cog.getCogtype()) {
      case BOSSBOT: cogFacility_if = new BossbotGolfCourses();
        break;
      case LAWBOT: cogFacility_if = new LawbotDAOffices();
        break;
      case CASHBOT: cogFacility_if = new CashbotMint();
        break;
      case SELLBOT: cogFacility_if = new SellbotFactory();
        break;
      default: System.out.println("Error: invalid choice; ending program");
        System.exit(0);
        break;
    }
      numsNeeded = cogFacility_if.returnStats(cog);
      System.out.println("Nums needed: " + numsNeeded);

  }
  public static void main(String[] args) {
    ToontownApp app = new ToontownApp();
    app.menu();
  }


  
}
