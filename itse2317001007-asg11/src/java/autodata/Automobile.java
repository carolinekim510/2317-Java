/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autodata;

/**
 *
 * @author carolinekim
 */
public class Automobile {
    
    private String type;
    private String maker;
    private String model;
    private String color;
    
    public Automobile() {
        type = "";
        maker = "";
        model = "";
        color = "";
    }
    
    public Automobile (String type, String maker, String model, String color) {
        this.type = type;
        this.maker = maker;
        this.model = model;
        this.color = color;
    }
    
   public void setType (String type) {
       this.type = type;
   }
   public String getType() {
       return type;
   }
   public void setMaker (String maker) {
       this.maker = maker;
   }
   public String getMaker() {
       return maker;
   }
   public void setModel (String model) {
       this.model = model;
   }
   public String getModel() {
       return model;
   }
    public void setColor (String color) {
       this.color = color;
   }
   public String getColor() {
       return color;
   }
}
