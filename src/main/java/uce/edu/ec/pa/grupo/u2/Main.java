package uce.edu.ec.pa.grupo.u2;

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
        System.out.println("Hello, Quarkus!");
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.0);
        pedido.setFechaCreacion(java.time.LocalDateTime.now());

        this.pedidoService.guardar(pedido);

        return 0;
    }
}
