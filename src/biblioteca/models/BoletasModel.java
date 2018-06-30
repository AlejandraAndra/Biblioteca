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
public class BoletasModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public BoletasModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearBoletas (int ID_Boleta, int ID_Venta) {
    
        Boleta Boleta = new Boleta();
        
        
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Boleta);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
