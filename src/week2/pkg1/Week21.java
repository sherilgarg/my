/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.pkg1;

/**
 *
 * @author sheri
 */
public class Week21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      cylinder cy1=new cylinder();
      
      cy1.radius=2.5;
      cy1.height=5.5;
      System.out.println("area of circle "+cy1.areaCircle());
      
      System.out.println(cy1.toString());
      System.out.println("height="+cy1.height+"area of cylinder= "+cy1.areaCylinder());
    }
    
}
