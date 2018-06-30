/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mxrni
 */

public class Arriendo_LibrosModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
     public Arriendo_LibrosModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
       
    }
        public void crearArriendo_Libros (Date Arriendo_Fecha_Prestamo, int Libros_Numero_Serie_Libro) {
    
        Arriendo_Libros Arriendo_Libros = new Arriendo_Libros();
        Arriendo_Libros.setArriendo_Fecha_Prestamo(Arriendo_Fecha_Prestamo);
        Arriendo_Libros.setLibros_Numero_Serie_Libro(Libros_Numero_Serie_Libro);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Arriendo_Libros);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
