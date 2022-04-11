/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

/**
 *
 * @author Owen Wurster
 */
public class CasualGarmentFactory implements GarmentFactory {

    @Override
    public Tops createTops() {
        return new Tops();
    }
    
    @Override
    public Pants createPants() {
        return new Pants();
    }
    
    @Override
    public Shoes createShoes() {
        return new Shoes();
    }
    
}
