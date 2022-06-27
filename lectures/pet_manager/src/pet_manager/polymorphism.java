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
public class polymorphism {
    public static void main(String[] args) {
        //prove method pet_care()
        
        //instance children cls dog, cat
        cls_dog dog= new cls_dog("Criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        cls_cat cat = new cls_cat("Angora", "002", "Minino", 2018, "Blanco y Negro", "Enfermo");
        
        // instance veterinary
        
        //create doctor
        cls_doctor doctor= new cls_doctor("María Fernandez", "L12345");
        
        cls_veterinary veterinary = new cls_veterinary("Veterinaria UdC", "036 878 15 00", "Calle N 26-10", doctor);
            
        
        //check for care status
        String care_dog= veterinary.pet_care(dog);
        
        //print care status
        System.out.println("El estado de salud de "+ dog.getName()+ " es "+ care_dog);
        
        //check for care status
        String care_cat= veterinary.pet_care(cat);
        
        //print care status
        System.out.println("El estado de salud de "+ cat.getName()+ " es "+ care_cat);
    }
    
}
