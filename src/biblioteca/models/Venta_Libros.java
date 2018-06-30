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
@Table(name="Venta_Libros")
public class Venta_Libros {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int Venta_ID_Venta;
     private int Libros_Numero_Serie_Libro;

    public int getVenta_ID_Venta() {
        return Venta_ID_Venta;
    }

    public void setVenta_ID_Venta(int Venta_ID_Venta) {
        this.Venta_ID_Venta = Venta_ID_Venta;
    }

    public int getLibros_Numero_Serie_Libro() {
        return Libros_Numero_Serie_Libro;
    }

    public void setLibros_Numero_Serie_Libro(int Libros_Numero_Serie_Libro) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }

    public Venta_Libros() {
    }

    public Venta_Libros(int Venta_ID_Venta, int Libros_Numero_Serie_Libro) {
        this.Venta_ID_Venta = Venta_ID_Venta;
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }
     
    
}
