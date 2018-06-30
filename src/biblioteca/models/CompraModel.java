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
public class CompraModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public CompraModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearModel (String Rut_Distribuidor) {
    
        Compra Compra = new Compra();
        Compra.setRut_Distribuidor(Rut_Distribuidor);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Compra);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
