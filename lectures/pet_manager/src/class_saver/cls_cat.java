/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_saver;

/**
 *
 * @author EL MAGO
 */
public class cls_cat extends cls_pet{
    
    //define breed
    private String breed;
    
    //constructor

    public cls_cat(String breed, String code, String name, int born_year, String color, String health_status) {
        //constructor de cls_pet!
        super(code, name, born_year, color, health_status);
        this.breed = breed;
    }
    
    //my method self_cleaning();
    public void self_cleaning(){
        System.out.println("El gato "+ super.getName()+ " se está limpiando");
    }
    
    
    //new .sound() method
    @Override
    public void sound(){
        System.out.println("El gato "+ super.getName()+ " Hace miauuuu");
    }
    
    //overwrite father class method get_number_bones()
    @Override
    public int get_number_bones(){
        return 230;
    }
    
    //overwrite father class method get_animal_type()
    @Override
    public String get_animal_type(){
        return "Gato";
    }
    
    //refactor!

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
