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

public class TrabajadorModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public TrabajadorModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearTrabajador (String Nombre_Trabajador, String Apellido_Paterno, String Apellido_Materno,String Correo_Electronico,String Fech_Contrato)   {
    
        Trabajador Trabajador = new Trabajador();
        Trabajador.setNombre_Trabajador(Nombre_Trabajador);
        Trabajador.setApellido_Materno(Apellido_Materno);
        Trabajador.setApellido_Paterno(Apellido_Paterno);
        Trabajador.setCorreo_Electronico(Correo_Electronico);
        Trabajador.setFech_Contrato(Fech_Contrato);
        
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Trabajador);
        
        
        this.entityManager.getTransaction().commit();
        }

    
    
}
