/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

/**
 *
 * @author Owner
 */
public class Application {
    //Application to describe a publication
    
    private Pants pants;
    private Tops tops;
    private Shoes shoes;

    public Application(GarmentFactory factory) {
        pants = factory.createPants();
        tops = factory.createTops();
        shoes = factory.createShoes();
    }
    
    public void revealContent(){
        pants.typeOfGarment();
        tops.typeOfGarment();
        shoes.typeOfGarment();
    }
    
    
}
