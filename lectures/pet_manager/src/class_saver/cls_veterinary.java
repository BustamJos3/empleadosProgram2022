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
public class cls_veterinary extends abst_hospital {
    
    //attributes
    private String name;
    private String phone;
    private String address;
    //composition
    private cls_doctor doctor;
    
    //constructor

    public cls_veterinary(String name, String phone, String address, cls_doctor doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doctor = doctor;
    }
    
    
    
    //pure polymorphism method
    /**
     * cls_pet is given as a parameter
     * string is returned
     * @param pet
     * @return 
     */
    public String pet_care(cls_pet pet){
        //indicate attention is given to pet
        System.out.println("Atendiendo a la mascota "+ pet.getName());
        
        return pet.getHealth_status();
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doctor
     */
    public cls_doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(cls_doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String patient_type() {
        return "Animal";
    }

    @Override
    public String surgery() {
        return "Surgery animal data";
    }
    
    /**
     * Probe all this with a executable class!
     */
    
}
