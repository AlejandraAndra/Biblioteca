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
public class DistribuidorModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DistribuidorModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearDistribuidor (String  Rut_Distribuidor, String Direccion_Distribuidor, int Año_Venta, int Numero_Telefono) {
    
        Distribuidor Distribuidor  = new Distribuidor();
        Distribuidor .setDireccion_Distribuidor(Direccion_Distribuidor);
        Distribuidor .setAño_Venta(Año_Venta);
        Distribuidor .setNumero_Telefono(Numero_Telefono);
        Distribuidor .setRut_Distribuidor(Rut_Distribuidor);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Distribuidor );
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
}
