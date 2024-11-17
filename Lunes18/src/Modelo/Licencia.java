package Modelo;

import java.util.Date;

/**
 *
 * @author stephania
 */
public class Licencia {
    private Paciente paciente;
    private int inicioLicencia;
    private int idLicencia,rutEmpleador;
    private String nombreEmpleador;

    public Licencia() {
    }

    public Licencia(Paciente paciente, int inicioLicencia, int idLicencia, int rutEmpleador, String nombreEmpleador) {
        this.paciente = paciente;
        this.inicioLicencia = inicioLicencia;
        this.idLicencia = idLicencia;
        this.rutEmpleador = rutEmpleador;
        this.nombreEmpleador = nombreEmpleador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getInicioLicencia() {
        return inicioLicencia;
    }

    public void setInicioLicencia(int inicioLicencia) {
        this.inicioLicencia = inicioLicencia;
    }

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public int getRutEmpleador() {
        return rutEmpleador;
    }

    public void setRutEmpleador(int rutEmpleador) {
        this.rutEmpleador = rutEmpleador;
    }

    public String getNombreEmpleador() {
        return nombreEmpleador;
    }

    public void setNombreEmpleador(String nombreEmpleador) {
        this.nombreEmpleador = nombreEmpleador;
    }

    @Override
    public String toString() {
        return "Licencia{" + "paciente=" + paciente + ", inicioLicencia=" + inicioLicencia + ", idLicencia=" + idLicencia + ", rutEmpleador=" + rutEmpleador + ", nombreEmpleador=" + nombreEmpleador + '}';
    }
    
    
    
}
