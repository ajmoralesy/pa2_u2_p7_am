package uce.edu.ec.pa.grupo.u2.pedidos.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.DetallePedidoRepository;

@ApplicationScoped
@Transactional
public class DetallePedidoService {

    @Inject
    private DetallePedidoRepository detallePedidoRepository;

    public void guardar(DetallePedido detallePedido) {
        this.detallePedidoRepository.create(detallePedido);
    }

    public DetallePedido buscarPorId(Integer id) {
        return this.detallePedidoRepository.read(id);
    }

    public void actualizar(DetallePedido detallePedido) {
        this.detallePedidoRepository.update(detallePedido);
    }

    public void eliminar(Integer id) {
        this.detallePedidoRepository.delete(id);
    }
}