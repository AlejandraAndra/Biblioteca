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
 * @author 20076697-0
 */
@Entity
@Table(name="Condiciones")
public class Condicion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID_Condicion;
    private String Condicion;

    public int getID_Condicion() {
        return ID_Condicion;
    }

    public void setID_Condicion(int ID_Condicion) {
        this.ID_Condicion = ID_Condicion;
    }

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

    public Condicion() {
    }

    public Condicion(int ID_Condicion, String Condicion) {
        this.ID_Condicion = ID_Condicion;
        this.Condicion = Condicion;
    }
    
    
    
}
