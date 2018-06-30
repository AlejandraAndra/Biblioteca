/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mxrni
 */

public class LibroModel {
    
      private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public LibroModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearLibro (String Titulo, String I_S_B_N, int Precio, String Idioma, int Publicacion, String Autor_Libro, String Estado_Libro, String Editorial)
    {
    
        Libro Libro = new Libro();
        Libro.setTitulo(Titulo);
        Libro.setI_S_B_N(Precio);
        Libro.setPreocio(Precio);
        Libro.setIdioma(Idioma);
        Libro.setPublicacion(Publicacion);
        Libro.setAutor_Libro(Autor_Libro);
        Libro.setEstado_Libro(Estado_Libro);
        Libro.setEditorial(Editorial);
    
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Libro);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
}
