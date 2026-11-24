package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.DetallePedido;

public interface DetallePedidoRepository {

    // Create
    public void create(DetallePedido detallePedido);

    // Read
    public DetallePedido read(Integer id);

    // Update
    public void update(DetallePedido detallePedido);

    // Delete
    public void delete(Integer id);
}