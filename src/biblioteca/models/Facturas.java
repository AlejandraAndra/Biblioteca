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
@Table(name="Facturas")
public class Facturas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Compra;
    private int ID_Factura;

    public int getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }

    public int getID_Factura() {
        return ID_Factura;
    }

    public void setID_Factura(int ID_Factura) {
        this.ID_Factura = ID_Factura;
    }

    public Facturas() {
    }

    public Facturas(int ID_Compra, int ID_Factura) {
        this.ID_Compra = ID_Compra;
        this.ID_Factura = ID_Factura;
    }
    
}
