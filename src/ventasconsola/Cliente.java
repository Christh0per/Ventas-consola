package ventasconsola;
/**
 *
 * @author Christhoper
 */
public class Cliente {
    
    private String rut;
    private String nombre;
    private String dirección;
    private String telefono;
    private int id;
    
    public Cliente(String rut, String nombre, String direccion, String telefono, int id){
        
        this.rut = rut;
        this.nombre = nombre;
        this.dirección = direccion;
        this.telefono = telefono;
        this.id = id;
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
