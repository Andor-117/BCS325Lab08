/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

/**
 *
 * @author Owner
 */
public class DriverClass {

    private static Application configureApplication(){

        Application app;
        GarmentFactory factory;

        String printName = "Check the config file for cominc";

        if (printName.contains("professional")) {
            factory = new ProfessionalGarmentFactory();
            app = new Application(factory);
        } else if (printName.contains("casual")) {
            factory = new CasualGarmentFactory();
            app = new Application(factory);
        } else {
            factory = new PartyGarmentFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }
}
