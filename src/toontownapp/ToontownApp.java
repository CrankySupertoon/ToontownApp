/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toontownapp;

import java.util.Scanner;

public class ToontownApp {
  
  public void menu(){
    
    //Cog cog = new Cog();
    
    System.out.println("Select a Cog Suit\n");
    System.out.println("1 - Bossbot");
    System.out.println("2 - Lawbot");
    System.out.println("3 - Cashbot");
    System.out.println("4 - Sellbot");
    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();
    
  }

    Scanner in = new Scanner(System.in);
    int choice1, choice2;
  
    public void Bossbot(){
      System.out.println("Select Bossbot:\n");
      System.out.println("1 -- Flunky");
      System.out.println("2 -- Pencil Pusher");
      System.out.println("3 -- Yesman");
      System.out.println("4 -- Micromanager");
      System.out.println("5 -- Downsizer");
      System.out.println("6 -- Head Hunter");
      System.out.println("7 -- Corporate Raider");
      System.out.println("8 -- The Big Cheese");
      choice1 = in.nextInt();
      
      System.out.println("What level are you?");
      choice2 = in.nextInt();
      
      switch(choice1){
        case 1: 
      }
      
    }
    
    public void Lawbot(){
      System.out.println("Select Lawbot:\n");
      System.out.println("1 -- Bottom Feeder");
      System.out.println("2 -- Bloodsucker");
      System.out.println("3 -- Double Talker");
      System.out.println("4 -- Ambulance Chaser");
      System.out.println("5 -- Back Stabber");
      System.out.println("6 -- Spin Doctor");
      System.out.println("7 -- Legal Eagle");
      System.out.println("8 -- Big Wig");
    }
    
    public void Cashbot(){
      System.out.println("Select Cashbot:\n");
      System.out.println("1 -- Short Change");
      System.out.println("2 -- Penny Pincher");
      System.out.println("3 -- Tightwad");
      System.out.println("4 -- Bean Counter");
      System.out.println("5 -- Number Cruncher");
      System.out.println("6 -- Money Bags");
      System.out.println("7 -- Loan Shark");
      System.out.println("8 -- Robber Baron");
    }
    
    public void Sellbot(){
      System.out.println("Select Sellbot:\n");
      System.out.println("1 -- Cold Caller");
      System.out.println("2 -- Telemarketer");
      System.out.println("3 -- Name Dropper");
      System.out.println("4 -- Glad Hander");
      System.out.println("5 -- Mover & Shaker");
      System.out.println("6 -- Two-Face");
      System.out.println("7 -- The Mingler");
      System.out.println("8 -- Mr. Hollywood");
    }

  public static void main(String[] args) {
    ToontownApp app = new ToontownApp();
    app.menu();
  }
  
}
