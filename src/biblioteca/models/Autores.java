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
@Table(name="Autores")
public class Autores {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Autor;
    private String Nombre_Autor;
    private String Apellido_Paterno;
    private String Apellido_Materno;

    public int getID_Autor() {
        return ID_Autor;
    }

    public void setID_Autor(int ID_Autor) {
        this.ID_Autor = ID_Autor;
    }

    public String getNombre_Autor() {
        return Nombre_Autor;
    }

    public void setNombre_Autor(String Nombre_Autor) {
        this.Nombre_Autor = Nombre_Autor;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public Autores() {
    }

    public Autores(int ID_Autor, String Nombre_Autor, String Apellido_Paterno, String Apellido_Materno) {
        this.ID_Autor = ID_Autor;
        this.Nombre_Autor = Nombre_Autor;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
    }
    
   }
     
