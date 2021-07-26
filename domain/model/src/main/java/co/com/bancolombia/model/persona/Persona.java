package co.com.bancolombia.model.persona;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Persona {

    private String id;
    private String nombre;
    private String telefono;

    public Persona(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona() {
    }
}
