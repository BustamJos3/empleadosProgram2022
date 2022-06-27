/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_saver;

import interfaces.*;

/**
 *
 * @author EL MAGO
 */
public class cls_pet implements Ianimal, Ivertebrate {
    
    private String code;
    private String name;
    private int born_year;
    private String color;
    private String health_status;
    //agregation
    private cls_veterinary veterinary;

    /**
     * @return the code
     */
    
    // void constructor is not necessary in this context
    /**
    *public cls_pet() {
    *}
    */
    
    public cls_pet(String code, String name, int born_year, String color, String health_status) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_status = health_status;
    }
    
    
    
    //default methods
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the health_status
     */
    public String getHealth_status() {
        return health_status;
    }

    /**
     * @param health_status the health_status to set
     */
    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }
    //def type variables
    
    //my_methods
    public void eat(){
        System.out.println("La mascota " + this.name + " está comiendo");
    }
    
    public void move(){
        System.out.println("La mascota " + this.name + " está moviendose");
    }
    
    public void sound(){
        System.out.println("La mascota " + this.name + " está realizando el sonido");
    }

    /**
     * @return the veterinary
     */
    public cls_veterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(cls_veterinary veterinary) {
        this.veterinary = veterinary;
    }
    
    //interfaces methods to be implemented
    
    @Override
    public String get_animal_type() {
        //for specific type, overwrite children classes
        return "domestico";
    }

    @Override
    public int get_number_bones() {
        //for specific numbers, overwrite children classes
        return 0;
    }
    
}
