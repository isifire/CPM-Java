
package contactomaestro;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
public class Contacto {

    public String nombre, apellidos, email, movil, fijo,prefijo1,prefijo2;
    public String bloqueado = " ";
    public String favorito = " ";

    public Contacto() {

    }


    public Contacto(String nombre, String apellidos, String email,String prefijo1, String movil, String prefijo2, String fijo,String bloqueado,String favorito) {
        this.setNombre(nombre);
        this.apellidos = apellidos;
        this.email = email;
        this.movil = movil;
        this.fijo = fijo;
        this.prefijo1 = prefijo1;
        this.prefijo2 = prefijo2;
        this.bloqueado = bloqueado;
        this.favorito = favorito;
    }
    
        public Contacto(Contacto copiara) {
        this.nombre = copiara.nombre;
        this.apellidos = copiara.apellidos;
        this.email = copiara.email;
        this.movil = copiara.movil;
        this.fijo = copiara.fijo;
        this.prefijo1 = copiara.prefijo1;
        this.prefijo2 = copiara.prefijo2;
        this.bloqueado = copiara.bloqueado;
        this.favorito = copiara.favorito;
    }
    

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    
        public void setFavorito(String n) {
        this.favorito = n;
    }

    public String getFavorito() {
        return this.favorito;
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

    public void setMovil(String n) {
        this.movil = n;
    }

    public String getMovil() {
        return this.movil;
    }

    public void setFijo(String n) {
        this.fijo = n;
    }

    public String getFijo() {
        return this.fijo;
    }

    
    @Override
    public String toString() {
        return nombre+" "+apellidos+" "+movil+" "+fijo+"  "+email;
    }

}
