/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mxrni
 */
@Entity
@Table(name="Idioma")
public class Idioma {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
       private int ID_Idioma;
    private String Nombre_Idioma;
    private String Inicial_Idioma;

    public int getID_Idioma() {
        return ID_Idioma;
    }

    public void setID_Idioma(int ID_Idioma) {
        this.ID_Idioma = ID_Idioma;
    }

    public String getNombre_Idioma() {
        return Nombre_Idioma;
    }

    public void setNombre_Idioma(String Nombre_Idioma) {
        this.Nombre_Idioma = Nombre_Idioma;
    }

    public String getInicial_Idioma() {
        return Inicial_Idioma;
    }

    public void setInicial_Idioma(String Inicial_Idioma) {
        this.Inicial_Idioma = Inicial_Idioma;
    }

    public Idioma() {
    }

    public Idioma(int ID_Idioma, String Nombre_Idioma, String Inicial_Idioma) {
        this.ID_Idioma = ID_Idioma;
        this.Nombre_Idioma = Nombre_Idioma;
        this.Inicial_Idioma = Inicial_Idioma;
    }
    
    
}
