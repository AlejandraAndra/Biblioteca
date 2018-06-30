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
@Table(name="Boletas")
public class Boletas {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int ID_Venta;
     private int ID_Boleta;

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    public int getID_Boleta() {
        return ID_Boleta;
    }

    public void setID_Boleta(int ID_Boleta) {
        this.ID_Boleta = ID_Boleta;
    }

    public Boletas() {
    }

    public Boletas(int ID_Venta, int ID_Boleta) {
        this.ID_Venta = ID_Venta;
        this.ID_Boleta = ID_Boleta;
    }
     
}
