/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_manager;

import class_saver.cls_doctor;
import class_saver.cls_veterinary;

/**
 *
 * @author EL MAGO
 */
public class test_abst_class {
    public static void main(String[] args) {
        //instance doctor and veterinary
    //create doctor
        cls_doctor doctor= new cls_doctor("María Fernandez", "L12345");
        
        cls_veterinary veterinary = new cls_veterinary("Veterinaria UdC", "036 878 15 00", "Calle N 26-10", doctor);
        
        //set (setear jajaja) data to be saved on string variables: name with address
        veterinary.setData(veterinary.getName()+ " - "+ veterinary.getAddress());
        
        //execute methods of abst class hospital
        String data= veterinary.get_hospital_info();
        String type= veterinary.patient_type();
        String surgery= veterinary.surgery();
        
        //print it
        System.out.println("Data: "+data+"\n"
        +"Type: "+type+"\n"
        +"Surgery: "+surgery);
    }
                
}
