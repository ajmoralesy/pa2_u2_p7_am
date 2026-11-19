package uce.edu.ec.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // esta clase esta administrada por Jakarta Persistence API
@Table(name = "pedidos") // nombre de la tabla en la base de datos
public class Pedido {

    @Id
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1) // nombre de la secuencia en la base de datos
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq") // nombre de la secuencia en la base de datos
    @Column(name = "pedd_id") // nombre de la columna en la base de datos
    private Integer id;
    @Column(name = "pedd_producto") // nombre de la columna en la base de datos
    private String producto;
    @Column(name = "pedd_precio") // nombre de la columna en la base de datos
    private Double precio;
    @Column(name = "pedd_fecha") // nombre de la columna en la base de datos
    private LocalDateTime fechaCreacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
