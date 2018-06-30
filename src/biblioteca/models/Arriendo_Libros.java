/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import java.sql.Date;
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
@Table(name="Arriendo_Libros")
public class Arriendo_Libros {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
     private Date Arriendo_Fecha_Prestamo;
     private int Libros_Numero_Serie_Libro;

    public Date getArriendo_Fecha_Prestamo() {
        return Arriendo_Fecha_Prestamo;
    }

    public void setArriendo_Fecha_Prestamo(Date Arriendo_Fecha_Prestamo) {
        this.Arriendo_Fecha_Prestamo = Arriendo_Fecha_Prestamo;
    }

    public int getLibros_Numero_Serie_Libro() {
        return Libros_Numero_Serie_Libro;
    }

    public void setLibros_Numero_Serie_Libro(int Libros_Numero_Serie_Libro) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }

    public Arriendo_Libros() {
    }

    public Arriendo_Libros(Date Arriendo_Fecha_Prestamo, int Libros_Numero_Serie_Libro) {
        this.Arriendo_Fecha_Prestamo = Arriendo_Fecha_Prestamo;
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }
     
    
}
