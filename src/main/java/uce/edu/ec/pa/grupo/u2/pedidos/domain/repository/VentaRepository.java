package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Venta;

public interface VentaRepository {

    // Create
    public void create(Venta venta);

    // Read
    public Venta read(Integer id);

    // Update
    public void update(Venta venta);

    // Delete
    public void delete(Integer id);
}