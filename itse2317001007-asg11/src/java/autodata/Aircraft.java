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
public class Aircraft {
    
    private String maker;
    private String year;
    private String model;
    private String capacity;
    
    public Aircraft() {
        maker = "";
        year = "";
        model = "";
        capacity = "";
    }
            
    public Aircraft (String maker, String year, String model, String capacity) {
        this.maker = maker;
        this.year = year;
        this.model = model;
        this.capacity = capacity;
    }
    
   public void setMaker (String maker) {
       this.maker = maker;
   }
   public String getMaker() {
       return maker;
   }
   public void setYear (String year) {
       this.year = year;
   }
   public String getYear() {
       return year;
   }
   public void setModel (String model) {
       this.model = model;
   }
   public String getModel() {
       return model;
   }
    public void setCapacity (String capacity) {
       this.capacity = capacity;
   }
   public String getCapacity() {
       return capacity;
   }
   
}