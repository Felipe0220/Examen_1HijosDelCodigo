/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Denunciantes;

import Personas.Persona;

/**
 *
 * @author Student
 */
public class Denunciante extends Persona {
    
    private String correo;
    private String anonimo;

    public String getCorreo() {
        return correo;
    }

    public String getAnonimo() {
        return anonimo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public Denunciante(String cedula, String nombre) {
        super(cedula, nombre);
        this.nombre=nombre;
        this.cedula=cedula;
        this.correo=correo;
        this.anonimo=anonimo;
    }
    
    
}
