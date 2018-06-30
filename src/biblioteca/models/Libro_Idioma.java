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
@Table(name="Libro_Idioma")
public class Libro_Idioma {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Libros_Numero_Serie_Libro;
    private int Idiomas_ID_Idioma;

    public int getLibros_Numero_Serie_Libro() {
        return Libros_Numero_Serie_Libro;
    }

    public void setLibros_Numero_Serie_Libro(int Libros_Numero_Serie_Libro) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
    }

    public int getIdiomas_ID_Idioma() {
        return Idiomas_ID_Idioma;
    }

    public void setIdiomas_ID_Idioma(int Idiomas_ID_Idioma) {
        this.Idiomas_ID_Idioma = Idiomas_ID_Idioma;
    }

    public Libro_Idioma() {
    }

    public Libro_Idioma(int Libros_Numero_Serie_Libro, int Idiomas_ID_Idioma) {
        this.Libros_Numero_Serie_Libro = Libros_Numero_Serie_Libro;
        this.Idiomas_ID_Idioma = Idiomas_ID_Idioma;
    }
    
}

