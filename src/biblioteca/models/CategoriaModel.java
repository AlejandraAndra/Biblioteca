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
public class CategoriaModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public CategoriaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
        public void crearAutores_LibrosModel (int Numero_Serie_Libro) {
    
        Categoria Categoria = new Categoria();
      Categoria.setNumero_Serie_Libro(Numero_Serie_Libro);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Categoria);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
}
