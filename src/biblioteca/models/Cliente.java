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
@Table(name="Cliente")
public class Cliente {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int ID_Cliente;
    private String Rut_Trabajador;
    private String Nombre_Trabajador;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Direccion_Trabajador;
    private String Correo_Electronico;
    private String Fech_Contrato;

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getRut_Trabajador() {
        return Rut_Trabajador;
    }

    public void setRut_Trabajador(String Rut_Trabajador) {
        this.Rut_Trabajador = Rut_Trabajador;
    }

    public String getNombre_Trabajador() {
        return Nombre_Trabajador;
    }

    public void setNombre_Trabajador(String Nombre_Trabajador) {
        this.Nombre_Trabajador = Nombre_Trabajador;
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

    public String getDireccion_Trabajador() {
        return Direccion_Trabajador;
    }

    public void setDireccion_Trabajador(String Direccion_Trabajador) {
        this.Direccion_Trabajador = Direccion_Trabajador;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getFech_Contrato() {
        return Fech_Contrato;
    }

    public void setFech_Contrato(String Fech_Contrato) {
        this.Fech_Contrato = Fech_Contrato;
    }

    public Cliente() {
    }

    public Cliente(int ID_Cliente, String Rut_Trabajador, String Nombre_Trabajador, String Apellido_Paterno, String Apellido_Materno, String Direccion_Trabajador, String Correo_Electronico, String Fech_Contrato) {
        this.ID_Cliente = ID_Cliente;
        this.Rut_Trabajador = Rut_Trabajador;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Direccion_Trabajador = Direccion_Trabajador;
        this.Correo_Electronico = Correo_Electronico;
        this.Fech_Contrato = Fech_Contrato;
    }
    
    
    
    
}
