package co.com.bancolombia.model.producto.gateways;

import co.com.bancolombia.model.producto.Producto;

public interface ProductoRepository {

    Float obtenerPrecio(String id);
    Producto crearProducto(Producto producto);
}
