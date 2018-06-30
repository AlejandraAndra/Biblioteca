/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**^+}
 *
 * @author mxrni
 */
public class ArriendoModel {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
     public ArriendoModel() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BibliotecaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
       
    }
        public void crearArriendo ( int ID_Cliente, String Prest_Fecha, int Multa, String Valor_de_Arriendo, String Fech_Devolucion, int Di_Atrasado, String Rut_Trabajador) {
    
        Arriendo Arriendo = new Arriendo();
      
        Arriendo.setID_Cliente(ID_Cliente);
        Arriendo.setPrest_Fecha(Prest_Fecha);
        Arriendo.setMulta(Multa);
        Arriendo.setValor_de_Arriendo(Valor_de_Arriendo);
        Arriendo.setFech_Devolucion(Fech_Devolucion);
        Arriendo.setDi_Atrasado(Di_Atrasado);
        Arriendo.setRut_Trabajador(Rut_Trabajador);
        
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(Arriendo);
        
        
        this.entityManager.getTransaction().commit();
    
    }
    
     
}
