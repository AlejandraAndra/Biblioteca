/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

/**
 *
 * @author mxrni
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriasModel {
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public CategoriasModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
        public void crearCategoria (String NombreCategoria) {
    
        Categorias categorias = new Categorias();
        categorias.setNombre_Categoria(NombreCategoria);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(categorias);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
}
