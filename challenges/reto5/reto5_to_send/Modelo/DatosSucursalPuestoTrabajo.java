package Modelo;

public class DatosSucursalPuestoTrabajo {

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

    /**
     * @return the idPuestoTrabajo
     */
    public int getIdPuestoTrabajo() {
        return idPuestoTrabajo;
    }

    /**
     * @param idPuestoTrabajo the idPuestoTrabajo to set
     */
    public void setIdPuestoTrabajo(int idPuestoTrabajo) {
        this.idPuestoTrabajo = idPuestoTrabajo;
    }

    /**
     * @return the nombrePuestoTrabajo
     */
    public String getNombrePuestoTrabajo() {
        return nombrePuestoTrabajo;
    }

    /**
     * @param nombrePuestoTrabajo the nombrePuestoTrabajo to set
     */
    public void setNombrePuestoTrabajo(String nombrePuestoTrabajo) {
        this.nombrePuestoTrabajo = nombrePuestoTrabajo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    private int idSucursal;
    private String nombreSucursal;
    private int idPuestoTrabajo;
    private String nombrePuestoTrabajo;
    private float salario;

    public DatosSucursalPuestoTrabajo() {
        this.idSucursal = 0;
        this.nombreSucursal = "";
        this.idPuestoTrabajo = 0;
        this.nombrePuestoTrabajo = "";
        this.salario = 0.0f;
    }

}
