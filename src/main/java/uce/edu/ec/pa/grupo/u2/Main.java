
package uce.edu.ec.pa.grupo.u2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

import uce.edu.ec.pa.grupo.u2.pedidos.application.PedidoService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.ClienteService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.DetallePedidoService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.FacturaService;
import uce.edu.ec.pa.grupo.u2.pedidos.application.VentaService;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Cliente;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Factura;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Venta;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private DetallePedidoService detallePedidoService;

    @Inject
    private FacturaService facturaService;

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        // ========================================
        // CRUD PEDIDO
        // ========================================

        System.out.println("\n========== PEDIDO ==========");

        // CREATE
        Pedido pedido = new Pedido();
        pedido.setProducto("Computadora");
        pedido.setPrecio(500.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);
        Integer idPedido = pedido.getId();

        System.out.println("Pedido guardado: " + pedido);

        // READ
        Pedido pedido1 = this.pedidoService.buscarPorId(idPedido);
        System.out.println("Pedido encontrado: " + pedido1);

        // UPDATE
        pedido.setPrecio(600.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorId(idPedido);
        System.out.println("Pedido actualizado: " + pedido2);

        // DELETE
        // this.pedidoService.eliminar(idPedido);
        // System.out.println("Pedido eliminado");


        // ========================================
        // CRUD CLIENTE
        // ========================================

        System.out.println("\n========== CLIENTE ==========");

        // CREATE
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setCorreo("juan@gmail.com");
        cliente.setTelefono("0991234567");

        this.clienteService.guardar(cliente);
        Integer idCliente = cliente.getId();

        System.out.println("Cliente guardado: " + cliente);

        // READ
        Cliente cliente1 = this.clienteService.buscarPorId(idCliente);
        System.out.println("Cliente encontrado: " + cliente1);

        // UPDATE
        cliente.setNombre("Carlos");
        cliente.setCorreo("carlos@gmail.com");

        this.clienteService.actualizar(cliente);

        Cliente cliente2 = this.clienteService.buscarPorId(idCliente);
        System.out.println("Cliente actualizado: " + cliente2);

        // DELETE
        // this.clienteService.eliminar(idCliente);
        // System.out.println("Cliente eliminado");


        // ========================================
        // CRUD DETALLE PEDIDO
        // ========================================

        System.out.println("\n========== DETALLE PEDIDO ==========");

        // CREATE
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setCantidad(2);
        detallePedido.setPrecioUnitario(50.0);
        detallePedido.setSubtotal(100.0);
        detallePedido.setDescripcion("Teclados");

        this.detallePedidoService.guardar(detallePedido);
        Integer idDetalle = detallePedido.getId();

        System.out.println("Detalle guardado: " + detallePedido);

        // READ
        DetallePedido detalle1 =
                this.detallePedidoService.buscarPorId(idDetalle);

        System.out.println("Detalle encontrado: " + detalle1);

        // UPDATE
        detallePedido.setCantidad(4);
        detallePedido.setSubtotal(200.0);

        this.detallePedidoService.actualizar(detallePedido);

        DetallePedido detalle2 =
                this.detallePedidoService.buscarPorId(idDetalle);

        System.out.println("Detalle actualizado: " + detalle2);

        // DELETE
        // this.detallePedidoService.eliminar(idDetalle);
        // System.out.println("Detalle eliminado");


        // ========================================
        // CRUD FACTURA
        // ========================================

        System.out.println("\n========== FACTURA ==========");

        // CREATE
        Factura factura = new Factura();
        factura.setNumeroFactura("FAC-001");
        factura.setFechaEmision(LocalDate.now().toString());
        factura.setTotal(150.0);
        factura.setEstado("PENDIENTE");

        this.facturaService.guardar(factura);
        Integer idFactura = factura.getId();

        System.out.println("Factura guardada: " + factura);

        // READ
        Factura factura1 = this.facturaService.buscarPorId(idFactura);
        System.out.println("Factura encontrada: " + factura1);

        // UPDATE
        factura.setTotal(200.0);
        factura.setEstado("PAGADA");

        this.facturaService.actualizar(factura);

        Factura factura2 = this.facturaService.buscarPorId(idFactura);
        System.out.println("Factura actualizada: " + factura2);

        // DELETE
        // this.facturaService.eliminar(idFactura);
        // System.out.println("Factura eliminada");


        // ========================================
        // CRUD VENTA
        // ========================================

        System.out.println("\n========== VENTA ==========");

        // CREATE
        Venta venta = new Venta();
        venta.setFecha(LocalDate.now().toString());
        venta.setTotal(150.0);
        venta.setMetodoPago("EFECTIVO");
        venta.setEstado("PENDIENTE");

        this.ventaService.guardar(venta);
        Integer idVenta = venta.getId();

        System.out.println("Venta guardada: " + venta);

        // READ
        Venta venta1 = this.ventaService.buscarPorId(idVenta);
        System.out.println("Venta encontrada: " + venta1);

        // UPDATE
        venta.setTotal(250.0);
        venta.setMetodoPago("TARJETA");
        venta.setEstado("COMPLETADA");

        this.ventaService.actualizar(venta);

        Venta venta2 = this.ventaService.buscarPorId(idVenta);
        System.out.println("Venta actualizada: " + venta2);

        // DELETE
        // this.ventaService.eliminar(idVenta);
        // System.out.println("Venta eliminada");

        return 0;
    }
}
