/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_manager;

import class_saver.cls_dog;

/**
 *
 * @author EL MAGO
 */
public class polymorphism_overload {
    public static void main(String[] args) {
        //instance dog
        cls_dog dog= new cls_dog("Criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        //call overloaded methods
        dog.walk_around();
        dog.walk_around(2);
        dog.walk_around(true);
    }
    
}
