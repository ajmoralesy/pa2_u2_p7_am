package uce.edu.ec.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Factura;
import uce.edu.ec.pa.grupo.u2.pedidos.domain.repository.FacturaRepository;

@ApplicationScoped
public class FacturaRepositoryImpl implements FacturaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Factura factura) {
        this.entityManager.persist(factura);
    }

    @Override
    public Factura read(Integer id) {
        return this.entityManager.find(Factura.class, id);
    }

    @Override
    public void update(Factura factura) {
        this.entityManager.merge(factura);
    }

    @Override
    public void delete(Integer id) {
        Factura factura = this.read(id);

        if (factura != null) {
            this.entityManager.remove(factura);
        }
    }
}