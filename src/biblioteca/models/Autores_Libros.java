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
@Table(name="Autores_Libros")
public class Autores_Libros {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Autores_ID_Autor;
    private int Libro_Numero_Serie_Libro;

    public int getAutores_ID_Autor() {
        return Autores_ID_Autor;
    }

    public void setAutores_ID_Autor(int Autores_ID_Autor) {
        this.Autores_ID_Autor = Autores_ID_Autor;
    }

    public int getLibro_Numero_Serie_Libro() {
        return Libro_Numero_Serie_Libro;
    }

    public void setLibro_Numero_Serie_Libro(int Libro_Numero_Serie_Libro) {
        this.Libro_Numero_Serie_Libro = Libro_Numero_Serie_Libro;
    }

    public Autores_Libros() {
    }

    public Autores_Libros(int Autores_ID_Autor, int Libro_Numero_Serie_Libro) {
        this.Autores_ID_Autor = Autores_ID_Autor;
        this.Libro_Numero_Serie_Libro = Libro_Numero_Serie_Libro;
    }
    
}
