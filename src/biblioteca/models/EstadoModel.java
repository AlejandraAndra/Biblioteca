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
public class EstadoModel {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EstadoModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearEstado (int Numero_Serie) {
    
        Estado estado = new Estado();
        estado.setNumero_Serie(Numero_Serie);
        
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(estado);
        
        
        this.entityManager.getTransaction().commit();
    
    }
}
