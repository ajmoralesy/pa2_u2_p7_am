package uce.edu.ec.pa.grupo.u2.pedidos.domain.repository;

import uce.edu.ec.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    //Created
    public void created(Pedido pedido);

    //Read
    public Pedido read(Integer id);
    
    //Update
    public void update(Pedido pedido);

    //Delete
    public void delete(Integer id);


}