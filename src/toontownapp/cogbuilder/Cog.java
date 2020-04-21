/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toontownapp.cogbuilder;

//import java.util.Scanner;

import toontownapp.cogbuilder.CogBuilder;
import toontownapp.cogbuilder.CogName;
import toontownapp.cogbuilder.CogType;


public class Cog {
  
    private final CogType cogtype;
    private final CogName cogname;
    private final int coglevel;
  
    public Cog(CogBuilder builder){
      this.cogtype = builder.getCogType();
      this.cogname = builder.getCogName();
      this.coglevel = builder.getCogLevel();
    }

  public CogType getCogtype() {
    return cogtype;
  }


  public CogName getCogname() {
    return cogname;
  }

  public int getCoglevel() {
    return coglevel;
  }

}
