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
@Table(name="Libros_Compra")
public class Libros_Compra {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int Libros_Numero_Serie_Libro;
     private int Compra_ID_Compra;

    public int getLibros_Numero_Serie_Libro() {
        return Libros_Numero_Serie_Libro;
    }

    public void setLibros_Numero_Serie_Libro(int Libros_Numero_Serie_Libro) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }

    public int getCompra_ID_Compra() {
        return Compra_ID_Compra;
    }

    public void setCompra_ID_Compra(int Compra_ID_Compra) {
        this.Compra_ID_Compra = Compra_ID_Compra;
    }

    public Libros_Compra() {
    }

    public Libros_Compra(int Libros_Numero_Serie_Libro, int Compra_ID_Compra) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
        this.Compra_ID_Compra = Compra_ID_Compra;
    }
     
}
