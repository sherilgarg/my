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
public class circle {
    
    public double radius;
    
    public double areaCircle()
    {
        return 3.14*radius*radius;
    }
    public String toString()
    {
        return "radius = "+radius+" area of circle = "+areaCircle();
    }
}
