package uce.edu.ec.pa.grupo.u2.pedidos.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Factura;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.FacturaRepository;

@ApplicationScoped
@Transactional
public class FacturaService {

    @Inject
    private FacturaRepository facturaRepository;

    public void guardar(Factura factura) {
        this.facturaRepository.create(factura);
    }

    public Factura buscarPorId(Integer id) {
        return this.facturaRepository.read(id);
    }

    public void actualizar(Factura factura) {
        this.facturaRepository.update(factura);
    }

    public void eliminar(Integer id) {
        this.facturaRepository.delete(id);
    }
}