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
public abstract class abst_hospital {

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
    private String data;
    
    //sign for abstract methods
    public abstract String patient_type();
    
    public abstract String surgery();
    
    public String get_hospital_info(){
        return "la información es: "+ this.getData();
    }
}
