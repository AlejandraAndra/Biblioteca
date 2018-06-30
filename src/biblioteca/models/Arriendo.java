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
@Table(name="Arriendo")
public class Arriendo {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int ID_Cliente;
    private String Prest_Fecha;
    private int Multa;
    private String Valor_de_Arriendo;
    private String Fech_Devolucion;
    private int Di_Atrasado;
    private String Rut_Trabajador;
    

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getPrest_Fecha() {
        return Prest_Fecha;
    }

    public void setPrest_Fecha(String Prest_Fecha) {
        this.Prest_Fecha = Prest_Fecha;
    }

    public int getMulta() {
        return Multa;
    }

    public void setMulta(int Multa) {
        this.Multa = Multa;
    }

    public String getValor_de_Arriendo() {
        return Valor_de_Arriendo;
    }

    public void setValor_de_Arriendo(String Valor_de_Arriendo) {
        this.Valor_de_Arriendo = Valor_de_Arriendo;
    }

    public String getFech_Devolucion() {
        return Fech_Devolucion;
    }

    public void setFech_Devolucion(String Fech_Devolucion) {
        this.Fech_Devolucion = Fech_Devolucion;
    }

    public int getDi_Atrasado() {
        return Di_Atrasado;
    }

    public void setDi_Atrasado(int Di_Atrasado) {
        this.Di_Atrasado = Di_Atrasado;
    }

    public String getRut_Trabajador() {
        return Rut_Trabajador;
    }

    public void setRut_Trabajador(String Rut_Trabajador) {
        this.Rut_Trabajador = Rut_Trabajador;
    }

    public Arriendo() {
    }

    public Arriendo(int ID_Cliente, String Prest_Fecha, int Multa, String Valor_de_Arriendo, String Fech_Devolucion, int Di_Atrasado, String Rut_Trabajador) {
        this.ID_Cliente = ID_Cliente;
        this.Prest_Fecha = Prest_Fecha;
        this.Multa = Multa;
        this.Valor_de_Arriendo = Valor_de_Arriendo;
        this.Fech_Devolucion = Fech_Devolucion;
        this.Di_Atrasado = Di_Atrasado;
        this.Rut_Trabajador = Rut_Trabajador;
    }
    
}
