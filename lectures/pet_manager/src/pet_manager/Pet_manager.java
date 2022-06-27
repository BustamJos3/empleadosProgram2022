/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_manager;

//libraries
/**
import class_saver.cls_pet;
*/
//import all from class_saver package
import class_saver.*;
//date library
import java.util.Date;

/**
 *
 * @author EL MAGO
 */
public class Pet_manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        cls_pet pet1=new cls_pet() ;
        //asignar atributos a partir de los Set
        pet1.setName("Firulais");
        pet1.setBorn_year(2015);
        pet1.setHealth_status("Sano");
        pet1.setCode("001");
        pet1.setColor("Negro");
        pet1.setBreed("Criollo");
        */
        
        //calling inhiterance to create dog object
        cls_dog dog1= new cls_dog("Criollo", false, "001", "Firulais", 2013, "Negro", "Sano");
        
        //otro objeto
        cls_cat cat1 = new cls_cat("Angora", "002", "Minino", 2018, "Blanco y Negro", "Enfermo");
        
        //pet ages
        Date current_date = new Date();
        int current_year = current_date.getYear();
        
        //edad
        int age_pet1 = current_year - dog1.getBorn_year();
        int age_pet2 = current_year - cat1.getBorn_year();
        
        if(age_pet1>age_pet2){
            System.out.println("La mascota "+ dog1.getName()+ " es mayor que la mascota "+ cat1.getName());
        }else{
            if(age_pet2>age_pet1){
                System.out.println("La mascota "+ cat1.getName()+ " es mayor que la mascota "+ dog1.getName());
            }else{
                System.out.println("La mascota "+ dog1.getName()+ " tiene la misma edad que la mascota "+ cat1.getName());
            }
        }
        
        //run methods
        dog1.eat();
        
        cat1.eat();
        
        cat1.move();
        cat1.sound();
        
        dog1.walk_around();
        cat1.self_cleaning();
        
    }
    
}
