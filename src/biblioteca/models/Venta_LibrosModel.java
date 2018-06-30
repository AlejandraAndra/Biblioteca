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
public class Venta_LibrosModel {
        private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public Venta_LibrosModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearVenta_LibrosModel (int Libros_Numero_Serie_Libro) {
    
        Venta_Libros Venta_Libros = new Venta_Libros();
        Venta_Libros.setLibros_Numero_Serie_Libro(Libros_Numero_Serie_Libro);
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Venta_Libros);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
    
}
