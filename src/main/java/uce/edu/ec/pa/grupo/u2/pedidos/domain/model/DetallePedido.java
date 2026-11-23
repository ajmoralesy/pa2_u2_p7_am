package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @SequenceGenerator(
        name = "detalle_pedido_seq",
        sequenceName = "detalle_pedido_seq_db",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "detalle_pedido_seq"
    )
    @Column(name = "det_id")
    private Integer id;

    @Column(name = "det_cantidad")
    private Integer cantidad;

    @Column(name = "det_precio_unitario")
    private Double precioUnitario;

    @Column(name = "det_subtotal")
    private Double subtotal;

    @Column(name = "det_descripcion")
    private String descripcion;

    // GETTERS Y SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
