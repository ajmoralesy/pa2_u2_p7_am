package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Venta;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.VentaRepository;

@ApplicationScoped
public class VentaRepositoryImpl implements VentaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Venta venta) {
        this.entityManager.persist(venta);
    }

    @Override
    public Venta read(Integer id) {
        return this.entityManager.find(Venta.class, id);
    }

    @Override
    public void update(Venta venta) {
        this.entityManager.merge(venta);
    }

    @Override
    public void delete(Integer id) {
        Venta venta = this.read(id);

        if (venta != null) {
            this.entityManager.remove(venta);
        }
    }
}