/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.sql.Date;
import java.sql.Time;
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
@Table(name="Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int Prc_IVA;
    private String Rut_Distribuidor;
    private int Metodo_Pago;
    private int Costo_Iva;
    private Time Hora_Compra;
    private Date Fech_Compra;

    public int getPrc_IVA() {
        return Prc_IVA;
    }

    public void setPrc_IVA(int Prc_IVA) {
        this.Prc_IVA = Prc_IVA;
    }

    public String getRut_Distribuidor() {
        return Rut_Distribuidor;
    }

    public void setRut_Distribuidor(String Rut_Distribuidor) {
        this.Rut_Distribuidor = Rut_Distribuidor;
    }

    public int getMetodo_Pago() {
        return Metodo_Pago;
    }

    public void setMetodo_Pago(int Metodo_Pago) {
        this.Metodo_Pago = Metodo_Pago;
    }

    public int getCosto_Iva() {
        return Costo_Iva;
    }

    public void setCosto_Iva(int Costo_Iva) {
        this.Costo_Iva = Costo_Iva;
    }

    public Time getHora_Compra() {
        return Hora_Compra;
    }

    public void setHora_Compra(Time Hora_Compra) {
        this.Hora_Compra = Hora_Compra;
    }

    public Date getFech_Compra() {
        return Fech_Compra;
    }

    public void setFech_Compra(Date Fech_Compra) {
        this.Fech_Compra = Fech_Compra;
    }

    public Factura() {
    }

    public Factura(int Prc_IVA, String Rut_Distribuidor, int Metodo_Pago, int Costo_Iva, Time Hora_Compra, Date Fech_Compra) {
        this.Prc_IVA = Prc_IVA;
        this.Rut_Distribuidor = Rut_Distribuidor;
        this.Metodo_Pago = Metodo_Pago;
        this.Costo_Iva = Costo_Iva;
        this.Hora_Compra = Hora_Compra;
        this.Fech_Compra = Fech_Compra;
    }

   

    
}
