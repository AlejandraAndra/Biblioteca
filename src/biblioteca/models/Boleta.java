/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

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
@Table(name="Boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Boleta;
    private int Prc_Neto;
    private int Prc_IVA;
    private int Folio;
    private String Metodo_Pago;
    private int Costo_Iva;
    private Time Hora_Venta;
    private Date Fech_Venta;
    private String Cliente_Rut_Cliente;
    private String Trabajador_Rut_Trabajor;

    public int getID_Boleta() {
        return ID_Boleta;
    }

    public void setID_Boleta(int ID_Boleta) {
        this.ID_Boleta = ID_Boleta;
    }

    public int getPrc_Neto() {
        return Prc_Neto;
    }

    public void setPrc_Neto(int Prc_Neto) {
        this.Prc_Neto = Prc_Neto;
    }

    public int getPrc_IVA() {
        return Prc_IVA;
    }

    public void setPrc_IVA(int Prc_IVA) {
        this.Prc_IVA = Prc_IVA;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public String getMetodo_Pago() {
        return Metodo_Pago;
    }

    public void setMetodo_Pago(String Metodo_Pago) {
        this.Metodo_Pago = Metodo_Pago;
    }

    public int getCosto_Iva() {
        return Costo_Iva;
    }

    public void setCosto_Iva(int Costo_Iva) {
        this.Costo_Iva = Costo_Iva;
    }

    public Time getHora_Venta() {
        return Hora_Venta;
    }

    public void setHora_Venta(Time Hora_Venta) {
        this.Hora_Venta = Hora_Venta;
    }

    public Date getFech_Venta() {
        return Fech_Venta;
    }

    public void setFech_Venta(Date Fech_Venta) {
        this.Fech_Venta = Fech_Venta;
    }

    public String getCliente_Rut_Cliente() {
        return Cliente_Rut_Cliente;
    }

    public void setCliente_Rut_Cliente(String Cliente_Rut_Cliente) {
        this.Cliente_Rut_Cliente = Cliente_Rut_Cliente;
    }

    public String getTrabajador_Rut_Trabajor() {
        return Trabajador_Rut_Trabajor;
    }

    public void setTrabajador_Rut_Trabajor(String Trabajador_Rut_Trabajor) {
        this.Trabajador_Rut_Trabajor = Trabajador_Rut_Trabajor;
    }

    public Boleta() {
    }

    public Boleta(int ID_Boleta, int Prc_Neto, int Prc_IVA, int Folio, String Metodo_Pago, int Costo_Iva, Time Hora_Venta, Date Fech_Venta, String Cliente_Rut_Cliente, String Trabajador_Rut_Trabajor) {
        this.ID_Boleta = ID_Boleta;
        this.Prc_Neto = Prc_Neto;
        this.Prc_IVA = Prc_IVA;
        this.Folio = Folio;
        this.Metodo_Pago = Metodo_Pago;
        this.Costo_Iva = Costo_Iva;
        this.Hora_Venta = Hora_Venta;
        this.Fech_Venta = Fech_Venta;
        this.Cliente_Rut_Cliente = Cliente_Rut_Cliente;
        this.Trabajador_Rut_Trabajor = Trabajador_Rut_Trabajor;
    }
    
    
    
}
