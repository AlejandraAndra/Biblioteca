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

public class IdiomaModel {
    
      private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
       public IdiomaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
        public void crearIdioma (String nombreIdioma, String InicialIdioma) {
    
        Idioma Idioma = new Idioma();
        Idioma.setNombre_Idioma(nombreIdioma);
        Idioma.setInicial_Idioma(InicialIdioma);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Idioma);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
    
    
    
}

    
    

