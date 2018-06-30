/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mxrni
 */
@Entity
@Table(name="Categorias")
public class Categorias {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     
    private int ID_Categoria;
    private String Nombre_Categoria;

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.Nombre_Categoria = Nombre_Categoria;
    }

    public Categorias() {
    }

    public Categorias(int ID_Categoria, String Nombre_Categoria) {
        this.ID_Categoria = ID_Categoria;
        this.Nombre_Categoria = Nombre_Categoria;
    }
    
    
    
    
}
