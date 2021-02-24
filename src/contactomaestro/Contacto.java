/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactomaestro;

/**
 *
 * @author isifi
 */
public class Contacto {

    public String nombre, apellidos, email, movil, fijo;
    public String bloqueado = " ";

    public Contacto() {

    }

    public Contacto(String nombre,String prefijo1, String movil,String bloqueado) {
        this.nombre = nombre;
        this.movil = prefijo1+movil;
        this.bloqueado = bloqueado;

    }

    public Contacto(String nombre, String apellidos, String email,String prefijo1, String movil, String prefijo2, String fijo,String bloqueado) {
        this.setNombre(nombre);
        this.apellidos = apellidos;
        this.email = email;
        this.movil = prefijo1+movil;
        this.fijo = prefijo2+fijo;
        this.bloqueado = bloqueado;
    }
    
    public Contacto(Contacto persona){
        this.nombre = persona.nombre;
        this.movil = persona.movil;
        this.bloqueado = persona.bloqueado;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setBloqueado(String n) {
        this.bloqueado = n;
    }

    public String getBloqueado() {
        return this.bloqueado;
    }

    public void setApellidos(String n) {
        this.apellidos = n;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setEmail(String n) {
        this.email = n;
    }

    public String getEmail() {
        return this.email;
    }

    public void setMovil(String prefijo, String n) {
        this.movil = prefijo + n;
    }

    public String getMovil() {
        return this.movil;
    }

    public void setFijo(String prefijo, String n) {
        this.fijo = prefijo + n;
    }

    public String getFijo() {
        return this.fijo;
    }

    
    @Override
    public String toString() {
        return nombre+" "+movil+" "+bloqueado;
    }

}
