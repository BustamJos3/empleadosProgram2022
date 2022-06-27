/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_manager;

import class_saver.*;

/**
 *
 * @author EL MAGO
 */
public class polymorphism_overwrite {
    public static void main(String[] args) {
        
        //intances
        cls_dog dog= new cls_dog("Criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        cls_cat cat = new cls_cat("Angora", "002", "Minino", 2018, "Blanco y Negro", "Enfermo");
        
        //make sound
        dog.sound();
        cat.sound();
        
        //modify .sound():
        /**
         * decorator @override and definition of new .sound()
         */
    }
    
}
