package uce.edu.ec.pa.grupo.u2.pedidos.application;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;

@ApplicationScoped
@Transactional
public class PedidoService {

    @Inject
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido) {
        this.pedidoRepository.created(pedido);
    }

    public Pedido buscarPorId(Integer id) {
        return this.pedidoRepository.read(id);
    }

    public void actualizar(Pedido pedido) {
        this.pedidoRepository.update(pedido);
    }

    public void eliminar(Integer id) {
        this.pedidoRepository.delete(id);
    }
}