package uce.edu.ec.pa.grupo.u2.pedidos.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Venta;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.VentaRepository;

@ApplicationScoped
@Transactional
public class VentaService {

    @Inject
    private VentaRepository ventaRepository;

    public void guardar(Venta venta) {
        this.ventaRepository.create(venta);
    }

    public Venta buscarPorId(Integer id) {
        return this.ventaRepository.read(id);
    }

    public void actualizar(Venta venta) {
        this.ventaRepository.update(venta);
    }

    public void eliminar(Integer id) {
        this.ventaRepository.delete(id);
    }
}