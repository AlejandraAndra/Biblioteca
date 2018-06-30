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
@Table(name="Compra")
public class Compra {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     
     private int ID_Compra;
     private String Rut_Distribuidor;

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public String getRut_Distribuidor() {
        return Rut_Distribuidor;
    }

    public void setRut_Distribuidor(String Rut_Distribuidor) {
        this.Rut_Distribuidor = Rut_Distribuidor;
    }

    public Compra() {
    }

    public Compra(int ID_Compra, String Rut_Distribuidor) {
        this.ID_Compra = ID_Compra;
        this.Rut_Distribuidor = Rut_Distribuidor;
    }
     
}

