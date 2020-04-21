/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toontownapp.cogbuilder;

/**
 *
 * @author James
 */
public enum CogName {
  //bossbots
  FLUNKY("flunky"), PENCIL_PUSHER("pencil pusher"), YESMAN("yesman"), 
  MICROMANAGER("micromanager"), DOWNSIZER("downsizer"), 
  HEADHUNTER("head hunter"), CORPORATE_RAIDER("corporate raider"), 
  THE_BIG_CHEESE("the big cheese"),
  
  //lawbots
  BOTTOM_FEEDER("bottom feeder"), BLOODSUCKER("bloodsucker"), 
  DOUBLE_TALKER("double talker"), AMBULANCE_CHASER("ambulance chaser"), 
  BACK_STABBER("back stabber"), SPIN_DOCTOR("spin doctor"), 
  LEGAL_EAGLE("legal eagle"), BIG_WIG("big wig"),
  
  //cashbots
  SHORT_CHANGE("short change"), PENNY_PINCHER("penny pincher"), 
  TIGHTWAD("tightwad"), BEAN_COUNTER("bean counter"), 
  NUMBER_CRUNCHER("number cruncher"), MONEY_BAGS("money bags"), 
  LOAN_SHARK("loan shark"), ROBBER_BARON("robber baron"),
  
  //sellbots
  COLD_CALLER("cold caller"), TELEMARKETER("telemarketer"), 
  NAME_DROPPER("name dropper"), GLAD_HANDER("glad hander"), 
  MOVER_AND_SHAKER("mover & shaker"), TWO_FACE("two-face"), 
  THE_MINGLER("the mingler"), MR_HOLLYWOOD("mr. hollywood");
  
  private String name;
  CogName(String name){
    this.name = name;
  }
}
