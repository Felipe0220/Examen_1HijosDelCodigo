/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author Student
 */
public interface Lista <S> {
    public S Buscar(Object id);
    
    public boolean eliminar(S s);
    
    public boolean agregar(S s);
}
