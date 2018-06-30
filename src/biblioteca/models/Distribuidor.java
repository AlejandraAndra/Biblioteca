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
@Table(name="Distribuidor")
public class Distribuidor {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private String Rut_Distribuidor;
     private String Direccion_Distribuidor;
     private int Año_Venta;
     private int Numero_Telefono;

    public String getRut_Distribuidor() {
        return Rut_Distribuidor;
    }

    public void setRut_Distribuidor(String Rut_Distribuidor) {
        this.Rut_Distribuidor = Rut_Distribuidor;
    }

    public String getDireccion_Distribuidor() {
        return Direccion_Distribuidor;
    }

    public void setDireccion_Distribuidor(String Direccion_Distribuidor) {
        this.Direccion_Distribuidor = Direccion_Distribuidor;
    }

    public int getAño_Venta() {
        return Año_Venta;
    }

    public void setAño_Venta(int Año_Venta) {
        this.Año_Venta = Año_Venta;
    }

    public int getNumero_Telefono() {
        return Numero_Telefono;
    }

    public void setNumero_Telefono(int Numero_Telefono) {
        this.Numero_Telefono = Numero_Telefono;
    }

    public Distribuidor() {
    }

    public Distribuidor(String Rut_Distribuidor, String Direccion_Distribuidor, int Año_Venta, int Numero_Telefono) {
        this.Rut_Distribuidor = Rut_Distribuidor;
        this.Direccion_Distribuidor = Direccion_Distribuidor;
        this.Año_Venta = Año_Venta;
        this.Numero_Telefono = Numero_Telefono;
    }
     
}
