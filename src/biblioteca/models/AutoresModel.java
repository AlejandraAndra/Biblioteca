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
public class AutoresModel {
        private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

     public AutoresModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    
public void crearAutor (String nombreAutor, String apellidopaterno, String apellidomaterno) {
    
        Autores Autores = new Autores();
        Autores.setNombre_Autor(nombreAutor);
        Autores.setApellido_Paterno(apellidopaterno);
        Autores.setApellido_Materno(apellidomaterno);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Autores);
        
        
        this.entityManager.getTransaction().commit();
    
    }    
    
}
