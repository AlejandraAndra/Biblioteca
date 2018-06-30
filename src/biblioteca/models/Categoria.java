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
@Table(name="Categoria")
public class Categoria {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int Numero_Serie_Libro;
     private int ID_Categoria;

    public int getNumero_Serie_Libro() {
        return Numero_Serie_Libro;
    }

    public void setNumero_Serie_Libro(int Numero_Serie_Libro) {
        this.Numero_Serie_Libro = Numero_Serie_Libro;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public Categoria() {
    }

    public Categoria(int Numero_Serie_Libro, int ID_Categoria) {
        this.Numero_Serie_Libro = Numero_Serie_Libro;
        this.ID_Categoria = ID_Categoria;
    }
     
    
}
