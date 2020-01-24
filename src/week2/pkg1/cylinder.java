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
public class cylinder extends circle //cylinder subclass and circle superclass
{
    public double height;
    
    public double areaCylinder()
    {
        return ((2*3.14*radius*height)+(2*areaCircle()));
    }
}
