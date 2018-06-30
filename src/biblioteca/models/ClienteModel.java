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

public class ClienteModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ClienteModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
    }
    public void crearCliente (String nombre_Cliente, String Apellido_Paterno,String Apellido_Materno,String Direccion_Trabajador, String Correo_Electronico, String Fech_Contrato) {
    
        Cliente Cliente = new Cliente();
        
        Cliente.setNombre_Trabajador(nombre_Cliente);
        Cliente .setApellido_Paterno(Apellido_Paterno);
        Cliente .setApellido_Materno(Apellido_Materno);
        Cliente .setCorreo_Electronico(Correo_Electronico);
        Cliente .setFech_Contrato(Fech_Contrato);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Cliente );
        
        
        this.entityManager.getTransaction().commit();
    
    }
}
