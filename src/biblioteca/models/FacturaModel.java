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
public class FacturaModel {
     private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public FacturaModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
    public void crearFactura (int Prc_Iva, String Rut_Distribuidor, int Metodo_Pago, int Costo_Iva, Time Hora_Compra, Date Fech_Compra ) {
    
        Factura Factura = new Factura();
        Factura.setPrc_IVA(Prc_Iva);
        Factura.setRut_Distribuidor(Rut_Distribuidor);
        Factura.setMetodo_Pago(Metodo_Pago);
        Factura.setCosto_Iva(Costo_Iva);
        Factura.setHora_Compra(Hora_Compra);
        Factura.setFech_Compra(Fech_Compra);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Factura);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
    
}
