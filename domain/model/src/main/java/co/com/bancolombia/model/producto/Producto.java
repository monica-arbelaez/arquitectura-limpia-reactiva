package co.com.bancolombia.model.producto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Producto {

    private String nombre;
    private Float precio;
}
