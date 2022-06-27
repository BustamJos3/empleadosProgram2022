/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_manager;

import class_saver.cls_cat;
import class_saver.cls_dog;

/**
 *
 * @author EL MAGO
 */
public class interface_test {
    //execute class
    public static void main(String[] args) {
        //instance 2 pets
        cls_dog dog= new cls_dog("Criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        cls_cat cat = new cls_cat("Angora", "002", "Minino", 2018, "Blanco y Negro", "Enfermo");
        
        //do 1
        /**
        dog.get_animal_type();
        cat.get_animal_type();
        
        //do 2
        dog.get_number_bones();
        cat.get_number_bones();
        */
        
        //print results (1 println for multiple lines** "\n" work as well)
        /**
         * System.out.println("Players take turns marking a square."
            + "\nOnly squares not already marked can be picked."
            + "\nOnce a player has marked three squares in a row, he or she wins!"
            + "\nIf all squares are marked and no three squares are the same, a tied game is declared."
            + "\nHave Fun!");
         */
        System.out.println(dog.get_animal_type()+"\n"
                   +cat.get_animal_type()+"\n"
                   + " "+ dog.get_number_bones()+"\n"
                   + " "+ cat.get_number_bones()+"\n");
    }
    
}
