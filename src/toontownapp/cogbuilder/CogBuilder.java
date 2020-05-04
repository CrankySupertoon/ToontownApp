/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toontownapp.cogbuilder;

import toontownapp.cogbuilder.CogName;
import toontownapp.cogbuilder.CogType;

/**
 *
 * @author James
 */
public class CogBuilder {
  
  protected final CogType cogtype;
  protected CogName cogname;
  protected int coglevel;
  
  public CogBuilder(CogType cogtype){//}, CogName cogname){
    if(cogtype == null)
      throw new IllegalArgumentException("Cog type cannot be null");
    this.cogtype = cogtype;
  }
  
  public CogBuilder withCogName(CogName cogname){
    this.cogname = cogname;
    return this;
  }
  
  public CogBuilder withCogLevel(int coglevel){
    this.coglevel = coglevel;
    return this;
  }
  
  public Cog build(){
      return new Cog(this);
  }

  CogType getCogType() {
    return cogtype;
  }

  CogName getCogName() {
    return cogname;
  }

  int getCogLevel() {
    return coglevel;
  }

}
