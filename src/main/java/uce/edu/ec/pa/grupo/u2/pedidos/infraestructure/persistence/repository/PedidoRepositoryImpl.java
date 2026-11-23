package uce.edu.ec.pa.grupo.u2.pedidos.domain.infraestructure;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void created(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
        return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Pedido pedido = this.read(id);

        if (pedido != null) {
            this.entityManager.remove(pedido);
        }
    }
}