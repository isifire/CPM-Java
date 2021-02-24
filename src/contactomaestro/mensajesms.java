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
public class mensajesms {

    private String destinatario;
    private String mensaje;
    
    public mensajesms(){
        
    }
    
    public mensajesms(String destinatario,String mensaje){
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    
    public String getDestinatario() {
        return destinatario;
    }


    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }


    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString(){
        return destinatario;
    }
    
}
