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
@Table(name="Estado")
public class Estado {
      @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int Numero_Serie;
      private int ID_requisito;

    public int getNumero_Serie() {
        return Numero_Serie;
    }

    public void setNumero_Serie(int Numero_Serie) {
        this.Numero_Serie = Numero_Serie;
    }

    public int getID_requisito() {
        return ID_requisito;
    }

    public void setID_requisito(int ID_requisito) {
        this.ID_requisito = ID_requisito;
    }

    public Estado() {
    }

    public Estado(int Numero_Serie, int ID_requisito) {
        this.Numero_Serie = Numero_Serie;
        this.ID_requisito = ID_requisito;
    }
      
    
}
