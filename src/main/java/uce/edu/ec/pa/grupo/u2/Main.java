package uce.edu.ec.pa.grupo.u2;


import java.time.LocalDateTime;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ec.pa.grupo.u2.pedidos.application.PedidoService;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

      // CREATE (guardar)
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba 2");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);

        // READ (buscar)
        Pedido pedido1 = this.pedidoService.buscarPorId(2);
        System.out.println("Pedido encontrado: " + pedido1);

        // UPDATE (actualizar)
        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorId(2);
        System.out.println("Pedido actualizado: " + pedido2);

        // DELETE (eliminar)
        this.pedidoService.eliminar(2);

        return 0;
    }
}
