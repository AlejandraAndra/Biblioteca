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
 * @author 20076697-0
 */
public class CondicionModel {
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public CondicionModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearCondicion (String nombreCondicion) {
    
        Condicion condiciones = new Condicion();
        condiciones.setCondicion(nombreCondicion);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(condiciones);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
    
    
    
}
