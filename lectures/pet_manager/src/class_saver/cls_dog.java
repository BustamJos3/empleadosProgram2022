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
public class cls_dog extends cls_pet{
    private String breed;
    private boolean pedigree;
            
    //constructor

    public cls_dog(String breed, boolean pedigree, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    
    //my method walk_around();
    public void walk_around(){
        System.out.println("El perro "+ super.getName()+ " está caminando");
    }
    
    //alternative walk_around() method: polymorphism oveload
    public void walk_around(int km){
        System.out.println("El perro "+ super.getName()+ " está caminando "+ km+ " Km");
    }
    //alt method: p_overload
    public void walk_around(boolean dog_leash){
        //conditional inline!
        String has_leash= dog_leash ? "con correa" : "sin correa";
        
        System.out.println("El perro "+ super.getName()+ " está caminando "+ has_leash);
    }
    
    //new .sound() method: polymorphism overwrite
    @Override
    public void sound(){
        System.out.println("El perro "+ super.getName()+ " Hace guauuu");
    }
    
    //refactor
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
}
