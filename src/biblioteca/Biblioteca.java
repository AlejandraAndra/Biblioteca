/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.models.CondicionModel;

/**
 *
 * @author 20076697-0
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CondicionModel condicionModel = new CondicionModel();
        
        condicionModel.crearCondicion("prueba");
        System.out.println("Creado");
    }
    
}
