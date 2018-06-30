/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mxrni
 */

public class BoletaModel {
 private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public BoletaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearBoleta (int Prc_Neto, int Prc_IVA, int Folio, String Metodo_Pago, int Costo_IVA, Time Hora_Venta, Date Fech_Venta, String Cliente_Rut_Cliente, String Trabajador_Rut_Trabajador) {
    
        Boleta Boleta = new Boleta();
        Boleta.setPrc_Neto(Prc_Neto);
        Boleta.setPrc_IVA(Prc_IVA);
        Boleta.setFolio(Folio);
        Boleta.setMetodo_Pago(Metodo_Pago);
        Boleta.setCosto_Iva(Costo_IVA);
        Boleta.setHora_Venta(Hora_Venta);
        Boleta.setFech_Venta(Fech_Venta);
        Boleta.setCliente_Rut_Cliente(Cliente_Rut_Cliente);
        Boleta.setTrabajador_Rut_Trabajor(Trabajador_Rut_Trabajador);
        
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Boleta);
        
        
        this.entityManager.getTransaction().commit();
    
    }
        
}
