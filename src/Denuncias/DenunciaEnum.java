/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Denuncias;

/**
 *
 * @author Student
 */
public enum DenunciaEnum {
    CONTAMINACIONDELAIRE("Contaminacion del Aire"),
    CONTAMINACIONDELAGUA("Contaminacion del Agua"),
    TALAILEGAL("Tala Ilegal"),
    VERTIDODERESIDUOS("Vertido de Residuos"),
    RUIDOEXCESIVO("Ruido Excesivo"),
    AFECTACIONALABIODIVERSIDAD("Afectacion a la Biodiversidad");
    
    private String tipo;

    private DenunciaEnum(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    @Override
    public String toString() {
        return "DenunciaEnum: " + " tipo= " + tipo;
    }
}
