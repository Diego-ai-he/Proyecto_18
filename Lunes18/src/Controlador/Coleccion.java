/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;
import java.util.ArrayList;

/**
 *
 * @author Falopero
 */
public class Coleccion {
    
    private ArrayList<Paciente>pacientes;

    public Coleccion() {
        
        pacientes = new ArrayList<>();
        
        
    }
    public void agregarPaciente(Paciente paci)
    {
    pacientes.add(paci);
    
    
    }
    
            
    
}
