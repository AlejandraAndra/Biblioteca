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
public class Autores_LibrosModel {
      
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public Autores_LibrosModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
        public void crearAutores_LibrosModel (int Libro_Numero_Serie_Libro) {
    
        Autores_Libros Autores_Libros = new Autores_Libros();
        Autores_Libros.setLibro_Numero_Serie_Libro(Libro_Numero_Serie_Libro);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Autores_Libros);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
