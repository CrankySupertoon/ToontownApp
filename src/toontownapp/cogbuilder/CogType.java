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
public enum CogType {
  BOSSBOT("bossbot"), LAWBOT("lawbot"), 
  CASHBOT("cashbot"), SELLBOT("sellbot");
  
  private String type;
  
  CogType(String type){
    this.type = type;
  }
}
