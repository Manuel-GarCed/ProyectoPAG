/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author carlo
 */
public class heroes {

    private String id;
    private String nombre;
    private String alterEgo;
    private String primera_publicacion;
    private String personajes;

    public heroes() {
    }

    public heroes(String id, String nombre, String alterEgo, String primera_publicacion, String personajes) {
        this.id = id;
        this.nombre = nombre;
        this.alterEgo = alterEgo;
        this.primera_publicacion = primera_publicacion;
        this.personajes = personajes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    public String getPrimera_publicacion() {
        return primera_publicacion;
    }

    public void setPrimera_publicacion(String primera_publicacion) {
        this.primera_publicacion = primera_publicacion;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    

    @Override
    public String toString() {
        return this.id + " - " + this.nombre + " - " + this.alterEgo + " - " + this.primera_publicacion + " - " + this.personajes;
    }


}
