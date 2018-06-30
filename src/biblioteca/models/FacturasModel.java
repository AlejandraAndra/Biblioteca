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
public class FacturasModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public FacturasModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearFacturas (int ID_Compra, int ID_Factura) {
    
        Facturas Facturas = new Facturas();
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Facturas);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
