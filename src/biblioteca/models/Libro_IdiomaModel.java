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
public class Libro_IdiomaModel {
        private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public Libro_IdiomaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearLibro_Idioma (int Idiomas_ID_Idioma) {
    
        Libro_Idioma Libro_Idioma = new Libro_Idioma();
        Libro_Idioma.setLibros_Numero_Serie_Libro(Idiomas_ID_Idioma);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Libro_Idioma);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
    
}
