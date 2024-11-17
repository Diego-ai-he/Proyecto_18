package Modelo;

import java.util.ArrayList;

/**
 *
 * @author stephania
 */
public class Paciente {
    private String nombre, domicilio,prevision, correo;
    private int rut, numDocumento, telefono;
    private ArrayList<Licencia> licencias;

    public Paciente() {
    }

    public Paciente(String nombre, String domicilio, String prevision, String correo, int rut, int numDocumento, int telefono, ArrayList<Licencia> licencias) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.prevision = prevision;
        this.correo = correo;
        this.rut = rut;
        this.numDocumento = numDocumento;
        this.telefono = telefono;
        this.licencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(ArrayList<Licencia> licencias) {
        this.licencias = licencias;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", prevision=" + prevision + ", correo=" + correo + ", rut=" + rut + ", numDocumento=" + numDocumento + ", telefono=" + telefono + ", licencias=" + licencias + '}';
    }

  


    
    
}
