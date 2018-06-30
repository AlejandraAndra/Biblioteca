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
@Table(name="Libro")
public class Libro {
  @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int ID_Libro;
    private String Titulo;
    private int I_S_B_N;
    private int Precio;
    private String Idioma;
    private int Publicacion;
    private String Autor_Libro;
    private String Categoria_Libro;
    private String Estado_Libro;
    private String Editorial;

    public int getID_Libro() {
        return ID_Libro;
    }

    public void setID_Libro(int ID_Libro) {
        this.ID_Libro = ID_Libro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getI_S_B_N() {
        return I_S_B_N;
    }

    public void setI_S_B_N(int I_S_B_N) {
        this.I_S_B_N = I_S_B_N;
    }

    public int getPreocio() {
        return Precio;
    }

    public void setPreocio(int Preocio) {
        this.Precio = Preocio;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getPublicacion() {
        return Publicacion;
    }

    public void setPublicacion(int Publicacion) {
        this.Publicacion = Publicacion;
    }

    public String getAutor_Libro() {
        return Autor_Libro;
    }

    public void setAutor_Libro(String Autor_Libro) {
        this.Autor_Libro = Autor_Libro;
    }

    public String getCategoria_Libro() {
        return Categoria_Libro;
    }

    public void setCategoria_Libro(String Categoria_Libro) {
        this.Categoria_Libro = Categoria_Libro;
    }

    public String getEstado_Libro() {
        return Estado_Libro;
    }

    public void setEstado_Libro(String Estado_Libro) {
        this.Estado_Libro = Estado_Libro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public Libro() {
    }

    public Libro(int ID_Libro, String Titulo, int I_S_B_N, int Preocio, String Idioma, int Publicacion, String Autor_Libro, String Categoria_Libro, String Estado_Libro, String Editorial) {
        this.ID_Libro = ID_Libro;
        this.Titulo = Titulo;
        this.I_S_B_N = I_S_B_N;
        this.Precio = Precio;
        this.Idioma = Idioma;
        this.Publicacion = Publicacion;
        this.Autor_Libro = Autor_Libro;
        this.Categoria_Libro = Categoria_Libro;
        this.Estado_Libro = Estado_Libro;
        this.Editorial = Editorial;
    }

    
}
