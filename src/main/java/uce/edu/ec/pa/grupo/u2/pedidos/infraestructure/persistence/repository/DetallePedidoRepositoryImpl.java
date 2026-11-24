package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.DetallePedido;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.DetallePedidoRepository;

@ApplicationScoped
public class DetallePedidoRepositoryImpl implements DetallePedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(DetallePedido detallePedido) {
        this.entityManager.persist(detallePedido);
    }

    @Override
    public DetallePedido read(Integer id) {
        return this.entityManager.find(DetallePedido.class, id);
    }

    @Override
    public void update(DetallePedido detallePedido) {
        this.entityManager.merge(detallePedido);
    }

    @Override
    public void delete(Integer id) {
        DetallePedido detallePedido = this.read(id);

        if (detallePedido != null) {
            this.entityManager.remove(detallePedido);
        }
    }
}