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
public class Libros_CompraModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public Libros_CompraModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
        public void crearLibros_CompraModel (int Libros_Numero_Serie_Libro) {
    
        Libros_Compra Libros_Compra = new Libros_Compra();
        Libros_Compra.setLibros_Numero_Serie_Libro(Libros_Numero_Serie_Libro);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Libros_Compra);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
}
