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
public class VentaModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public VentaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearVenta (String nombreCondicion) {
    
        Venta venta = new Venta();
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(venta);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
