/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme.Polimorphisme;

/**
 *
 * @author ACER
 */
public abstract class Vehicle {
    public void function(){
        System.out.println("Tools tranportation");
    }
    public void fuel(){
        System.out.println("fuels");
    }
    public abstract void walk(); 
}
