package Modelo;

public class Sucursal {

    private int idSucursal;
    private String nombreSucursal;

    //constructor
    public Sucursal() {
        this.idSucursal = 0;
        this.nombreSucursal = "";
    }

    @Override
    public String toString() {
        //return name of the sucursal
        return getNombreSucursal();
    }

    /**
     * @return the idSucursal
     */
    public int getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set
     */
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    /**
     * @return the nombreSucursal
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * @param nombreSucursal the nombreSucursal to set
     */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
}
